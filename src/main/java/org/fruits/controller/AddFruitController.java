package org.fruits.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.fruits.model.Fruit;

import java.net.URI;
import java.util.UUID;

@Path("/fruits")
public class AddFruitController {

    @Inject
    MongoClient mongoClient;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Fruit fruit) {

        Bson filter = Filters.eq("name", fruit.getName());
        MongoCollection collection = getCollection();

        if (collection.countDocuments(filter) > 0) {

            Fruit fruitResponse = getFruit(collection, filter);
            URI uri = URI.create("/fruits/" + fruitResponse.getId());

            return Response.created(uri).build();
        }

        String id = UUID.randomUUID().toString();
        Document document = new Document()
                .append("name", fruit.getName())
                .append("description", fruit.getDescription())
                .append("id", id);

        collection.insertOne(document);

        URI uri = URI.create("/fruits/" + id);
        return Response.created(uri).build();
    }

    private Fruit getFruit(MongoCollection collection, Bson filter) {

        FindIterable<Document> documents = collection.find(filter);

        MongoCursor<Document> cursor = documents.iterator();

        Fruit fruit = null;

        while (cursor.hasNext()) {
            Document document = cursor.next();

            String name = document.getString("name");
            String description = document.getString("description");
            String id = document.getString("id");

            fruit = new Fruit(name, description, id);
        }

        return fruit;
    }

    private MongoCollection getCollection() {
        return mongoClient.getDatabase("fruit").getCollection("fruit");
    }
}

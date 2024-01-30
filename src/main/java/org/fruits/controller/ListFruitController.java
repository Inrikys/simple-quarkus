package org.fruits.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.Document;
import org.fruits.model.Fruit;

import java.util.ArrayList;
import java.util.List;

@Path("/fruits")
public class ListFruitController {

    @Inject
    MongoClient mongoClient;

    @GET
    @Produces("application/json")
    public Response fruits() {
        List<Fruit> list = new ArrayList<>();

        MongoCollection<Document> collection = mongoClient.getDatabase("fruit").getCollection("fruit");

        try (MongoCursor<Document> cursor = collection.find().iterator();) {
            while (cursor.hasNext()) {
                Document document = cursor.next();

                String name = document.getString("name");
                String description = document.getString("description");
                String id = document.getString("id");

                Fruit fruit = new Fruit(name, description, id);
                list.add(fruit);
            }
        }

        return Response.ok(list, MediaType.APPLICATION_JSON).build();
    }

}

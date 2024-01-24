package org.acme.controller;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

@QuarkusTest
@TestHTTPEndpoint(HelloWorldController.class)
class HelloWorldControllerTest {

    @Test
    public void testHelloEndpoint() {
        when().get()
                .then()
                .statusCode(200)
                .body(is("Olá! Eu e a Jessica estamos estudando"));
    }

}
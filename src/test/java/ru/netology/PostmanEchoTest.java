package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostmanEchoTest {
    @Test
    void souldPostmanEchoPost() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .headers("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==")
//   Выполняемые действия
                .when()
                .get("/basic-auth")
// Проверки
                .then()
                .statusCode(200)

        ;
    }
}

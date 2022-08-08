package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest1 {
    @Test
    void souldPostmanEchoPostAutorization() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .headers("Authorization","cG9zdG1hbjpwYXNzd29yZA==")
//   Выполняемые действия
                .when()
                .get("/basic-auth")
// Проверки
                .then()
                .statusCode(200)

        ;
    }
}

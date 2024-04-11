import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV3 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("hata deda, vsem privet!") // отправляемые данные (заголовки и query можно выставлять аналогично)
            // Выполняемые действия
                .when()
                .post("/post")
            // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("hata deda, vsem privet!"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }
}
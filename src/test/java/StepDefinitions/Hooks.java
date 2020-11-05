package StepDefinitions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.*;

public class Hooks {
    @BeforeClass
    public void beforeClass() {
        enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "https://reqres.in/";
        basePath = "/api";

        requestSpecification = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                build();

        responseSpecification = new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                build();
    }

}

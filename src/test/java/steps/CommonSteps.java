package steps;

import base.UserApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import utilities.Constant;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isA;

public class CommonSteps {
        @Steps
        UserApi userAPI;
        @Then("should return status code {int}")
        public void shouldReturnStatusCode(int statusCode) {
        SerenityRest.then().assertThat().statusCode(statusCode);
        }

        @And("response body should have id and Status")
        public void responseBodyPageShouldHaveIdAndStatus() {
        SerenityRest.then().assertThat().
                body(
                        "id", isA(Integer.class),
                        "status", equalTo("active")

                );
        }
}


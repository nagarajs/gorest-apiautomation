package steps;

import base.UserApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import utilities.Payload;


public class CreateUserSteps {
    @Steps
    UserApi userAPI;

    Payload payload = new Payload();
    @Given("create user with valid request body")
    public void createUserWithValidRequestBody() {
        userAPI.postUsers(payload.postUser());
    }

    @When("send request post user")
    public void sendRequestPostUser() {
        SerenityRest.when().post(UserApi.POST_USER);
    }

}

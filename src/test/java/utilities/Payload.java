package utilities;

import Pojo.CreateUser;

import java.util.UUID;

public class Payload {

    public CreateUser postUser(){
        String random = UUID.randomUUID().toString().substring(1,5);
        CreateUser createUser = new CreateUser();
        createUser.setName("Abc" + random);
        createUser.setEmail(random + "@gmail.com");
        createUser.setGender("female");
        createUser.setStatus("active");
        return createUser;
    }

}

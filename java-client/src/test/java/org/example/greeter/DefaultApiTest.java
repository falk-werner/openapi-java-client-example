/*
 * Greeter
 * This is an example of a simplistic OpenAPI document.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.example.greeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.ApiClient;
import org.example.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Greeting service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void greetGetTest() throws ApiException {
        ApiClient client = new ApiClient();
        HashMap<String,String> variables = new HashMap<>();
        variables.put("host", "http://localhost:8080");
        client.setServerVariables(variables);

        DefaultApi greeter = new DefaultApi(client);
        
        String whom = "Bob";
        String response = api.greetGet(whom);

        assertEquals("Hello, Bob!", response);
    }

}

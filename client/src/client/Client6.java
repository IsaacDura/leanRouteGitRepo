/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 *
 * @author isaac
 */
public class Client6 {

    public static final String BASE_URI = "http://localhost:8082/WebServiceRest/";
    public static final String PATH_NAME = "/InfoService/saludo/";
    public static final String PATH_AGE = "/InfoService/suma/";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name = "Pepe";
        int n1 = 2;
        int n2 = 4;

        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource resource = client.resource(BASE_URI);

    }

    private static String getResponse(WebResource resource) {
        return resource.accept(MediaType.TEXT_XML).get(String.class);
    }

}

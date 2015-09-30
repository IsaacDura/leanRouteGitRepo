package com.techvirtualenvironment.t3;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
@Path("InfoService") //Esta ruta indica la clase a la que se accederá
public class Services {
    
    @GET //Indica el tipo del método que determina como se recibe la información en
    @Path("/saludo/name={nombre}") //Ruta que se indica para llamar al método y la e
    @Produces(MediaType.TEXT_XML)
    
    public String saludo (@PathParam("nombre") String nombre){
      return "Hola "+nombre;
    }
    
    @GET
    @Path("/suma/n1={valorn1}&n2={valorn2}")
    @Produces(MediaType.TEXT_XML)
    public String suma(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
      return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
    }
    
}

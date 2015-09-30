/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techvirtualenvironment.t3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author isaac
 */
@Path("GenericService")
public class LeanRouteCore<E> {
    
    E obj;
    
    public LeanRouteCore(E o) {
    obj = o;
  }
 
    public void classType() {
    System.out.println("El tipo de E es " + obj.getClass().getName());
  }
    
    
    @GET //Indica el tipo del método que determina como se recibe la información en
    @Path("/test/name={nombre}") //Ruta que se indica para llamar al método y la e
    @Produces(MediaType.TEXT_XML)
    
     public String test (@PathParam("test") String nombre){
      return "test "+nombre;
    }
    
    
} 
    


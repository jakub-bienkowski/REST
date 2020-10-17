package com.isa.restapidemo.controller;

import com.isa.restapidemo.dto.PersonDTO;
import com.isa.restapidemo.person.Gender;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/old/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Path("/{id}")
    @GET
    public Response getPersonById(
            @PathParam("id") Integer id
    ) {
        if (id != 1) {
            return Response.status(404).build();
        }
        return Response.ok(new PersonDTO(1, "A", "B", Gender.MALE)).build();
    }

    @GET
    @Path("/query")
    public PersonDTO getPersonbyQuery(@QueryParam("name") String name) {
        return new PersonDTO(20, name, "Kowlaski", Gender.MALE);
    }

    @POST
    public PersonDTO savePerson(PersonDTO personDTO) {
        return personDTO;
    }
}

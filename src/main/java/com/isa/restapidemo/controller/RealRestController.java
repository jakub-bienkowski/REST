package com.isa.restapidemo.controller;

import com.isa.restapidemo.dto.PersonDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class RealRestController {

    @GET
    public List<PersonDTO> findAll() {

    }

    @GET
    @Path("/{id}")
    public PersonDTO findOneById(@PathParam("id") Integer id) {

    }

    @PUT
    @Path("/{id}")
    public PersonDTO edit(@PathParam("id") Integer id, PersonDTO personDTO) {

    }

    @POST
    public PersonDTO save(PersonDTO personDTO) {

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id) {

    }







}

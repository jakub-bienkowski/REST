package com.isa.restapidemo.controller;

import com.isa.restapidemo.dto.PersonDTO;
import com.isa.restapidemo.service.PersonService;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/person")
public class RealRestController {

    @Inject
    PersonService personService;

    @GET
    public List<PersonDTO> findAll() {
        return personService.getAll();
    }

    @GET
    @Path("/search")
    public List<PersonDTO> findByLastName(@QueryParam("lastName") String lastNameSearch) {
        return personService.findByLastName(lastNameSearch);
    }


    @GET
    @Path("/{id}")
    public PersonDTO findOneById(@PathParam("id") Integer id) {
        return personService.getById(id);
    }

    @PUT
    @Path("/{id}")
    public PersonDTO edit(@PathParam("id") Integer id, PersonDTO personDTO) {
        return personService.update(id, personDTO);
    }

    @POST
    public PersonDTO save(PersonDTO personDTO) {
        return personService.save(personDTO);
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id) {

        if (personService.delete(id)) {
            return Response.status(200).build();
        } else return Response.status(404).build();
    }








}

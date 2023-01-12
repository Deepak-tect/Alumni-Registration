package com.example.alumni.Controller;

import com.example.alumni.Bean.Alumni;
import com.example.alumni.Bean.Student;
import com.example.alumni.DAO.AlumniDAO;
import com.example.alumni.DAO.DAOImplementation.AlumniDAOImpl;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/alumni")
public class AlumniController {

    AlumniDAO alumni=new AlumniDAOImpl();
    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add_Alumni(Alumni a)
    {
        if(this.alumni.addAlumni(a))
        {
            return Response.status(200).entity("Success").build();
        }
        return Response.status(400).entity("Fail to add alumni").build();
    }

    @GET
    @Path("/hasRegistered")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response hasRegistered(Alumni a)
    {
         if(this.alumni.hasRegistered(a))
             return Response.status(200).entity("Alumni has not been registered.").build();
         return Response.status(400).entity("Alumni has already been registered!").build();
    }
}

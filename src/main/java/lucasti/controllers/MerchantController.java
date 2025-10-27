package lucasti.controllers;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lucasti.controllers.dtos.MerchantDTO;
import lucasti.models.MerchantModel;
import lucasti.services.MerchantService;

@Path("/merchant")
public class MerchantController {

    @Inject
    MerchantService merchantService;

    @POST
    public Response saveMerchant(MerchantDTO merchantDTO){
        MerchantModel merchantModel = merchantService.saveMerchant(merchantDTO);
        return Response.status(Response.Status.CREATED).entity(merchantModel).build();
    }

    @GET
    public Response getAllMerchants(){
        return  Response.status(Response.Status.FOUND).entity(merchantService.getAllMerchants()).build();
    }

    @GET
    @Path("/name")
    public  Response getByName(@QueryParam("name") String name){
        return  Response.status(Response.Status.OK).entity(merchantService.getByName(name)).build();
    }

    @GET
    @Path("/owner")
    public  Response getByOwner(@QueryParam("owner") String owner){
        return  Response.status(Response.Status.OK).entity(merchantService.getByOwner(owner)).build();
    }


}

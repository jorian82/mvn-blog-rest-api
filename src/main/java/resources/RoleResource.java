package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import mappers.RoleMapper;
import models.RoleDTO;
import services.IRoleService;

/**
 * Created by jra, SSDE Inc.
 * on Thursday, Apr 25, 2024
 * at 8:36 for blog-api project
 */
@Path("/api/v1/role")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RoleResource {

    @Inject
    IRoleService roleService;

    @GET
    public Response getRoles() {
        return roleService.getAllRoles();
    }

    @POST
    public Response addRole(RoleDTO roleDTO) {
        return roleService.addRole(RoleMapper.dtoToEntity(roleDTO));
    }
}

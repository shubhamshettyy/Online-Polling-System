package org.online.polling.system.Users;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    UserService userService = new UserService();
    @GET
    public List<UserModel> getQuestions() {
        return userService.getAllUsers();
    }
}

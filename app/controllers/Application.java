package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

import javax.inject.Inject;

public class Application extends Controller {
    private service.UserMapper userService;

    @Inject
    public Application(service.UserMapper userMapper) {
        this.userService = userMapper;
    }

    public Result listUsers() {
        return ok(users.render(userService.all()));
    }

    public Result showUser(Long id) {
        return ok(profile.render(userService.getUserById(id)));
    }

}

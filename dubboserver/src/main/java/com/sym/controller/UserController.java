package com.sym.controller;




import com.sym.entity.User;
import com.sym.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/userController")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById(
            @PathVariable(value = "id") Integer id,
            @PathVariable(value = "id2") Integer id2
            ){
      User users = userService.getUserById(2);
      return users;
    }
}

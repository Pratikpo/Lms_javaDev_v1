package com.lgi.lms.controller;

import com.lgi.lms.dto.LoginRequest;
import com.lgi.lms.model.User;
import com.lgi.lms.dto.Roles;
import com.lgi.lms.dto.Users;
import com.lgi.lms.service.RolesService;
import com.lgi.lms.service.UserService;
import com.lgi.lms.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private UsersService usersService;
    
    @Autowired
    private RolesService rolesService;

    @GetMapping("/telecaller")
    public List<User> getTelecallers() {
        return userService.getTelecallers();
    }

    @PostMapping("/login")
    public ResponseEntity<User> authenticate(@RequestBody LoginRequest loginRequest) {
        Optional<User> user = userService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.status(401).build();
    }
    
    @PostMapping("/addUsers")
    public ResponseEntity<String> addUser(@RequestBody Users user) {
    usersService.addUser(user);
    return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
   }
    
    @GetMapping("/userList")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = usersService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
    @GetMapping("users/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = usersService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    
    @PostMapping("/addRoles")
    public ResponseEntity<String> addRole(@RequestBody Roles role) {
    rolesService.addRole(role);
    return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    
   }
    
    @GetMapping("/roleList")
    public ResponseEntity<List<Roles>> findAllRoles() {
        List<Roles> roles = rolesService.findAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
    @GetMapping("/telecallers/parentId")
    public List<Users> telecallerByParentId(@RequestParam int parentId) {
        return usersService.telecallerByParentId(parentId);
    }
}




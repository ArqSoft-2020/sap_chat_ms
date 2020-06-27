package com.as2020.chat.controller;


import com.as2020.chat.Model.ChatMessage;
import com.as2020.chat.Model.Ipalabras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value = "/chat")
//@RequestMapping(value="/chat/{id}", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

public class ChatRest {

    @Autowired
    private Ipalabras repo;

    //@PostMapping (path = "/send",produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping ()
    public @ResponseBody ChatMessage setData(@RequestBody ChatMessage mensaje){


        String word = repo.getOne(mensaje.getIdChat()).getPalabra();
        if(word.equals(mensaje.getContent())){
            mensaje.setType("True");
        }
        else mensaje.setType("Wrong");


        return mensaje;
    }


  /*
    @PostMapping
    public void createUser(Request request) {
        // POST /users
        // create a user
    }

    @GetMapping
    public Users getUsers(Request request) {
        // GET /users
        // get users
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable long id) {
        // GET /users/1
        // get user by id
    }
    }*/



}

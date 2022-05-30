package com.garden.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping(path ="/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

}

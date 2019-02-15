package com.example.dockerFileTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2/15/19.
 * @author chaoqunshe
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "Hello spring boot123;";
    }
}

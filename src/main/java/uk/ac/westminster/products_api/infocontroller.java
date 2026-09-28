package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;

public class   infocontroller {

    @GetMapping("/info")
    public String info(){
        return "This application work with java. ";
    }
}

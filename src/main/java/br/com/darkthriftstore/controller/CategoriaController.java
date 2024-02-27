package br.com.darkthriftstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpRequest;

@Controller
public class CategoriaController {

    @RequestMapping(method = RequestMethod.GET,
                    path = "/categoria",
                    produces = "application/json")
    @ResponseBody
    public String home(){
        return """
                [
                  {
                    "id" : 1,
                    "nome": "Calçado"
                  }
                ]
                """;
    }
}

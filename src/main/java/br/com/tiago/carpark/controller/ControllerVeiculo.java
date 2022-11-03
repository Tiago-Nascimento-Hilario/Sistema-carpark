package br.com.tiago.carpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerVeiculo {
    
    @GetMapping("/principal")
    public String principal(){
        return "principal";
    }
}

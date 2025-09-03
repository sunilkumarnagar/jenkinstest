package com.jenkinstest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
    

 
    @GetMapping("/api")
    public ResponseEntity<?> test(){
        
        Map<String,String> map = new HashMap<>();
        map.put("V", "Version 1");
        map.put("V2", "V ersion 2");

        return ResponseEntity.ok(map);
    }
}

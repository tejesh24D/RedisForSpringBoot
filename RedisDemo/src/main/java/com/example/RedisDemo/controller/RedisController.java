package com.example.RedisDemo.controller;

import com.example.RedisDemo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public String saveValue(@RequestParam String key, @RequestParam String value) {
        redisService.saveValue(key, value);
        return "Value saved!";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        return redisService.getValue(key);
    }

    @DeleteMapping("/delete")
    public String deleteValue(@RequestParam String key) {
        redisService.deleteValue(key);
        return "Value deleted!";
    }
}

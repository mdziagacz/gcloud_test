package com.gcloud_training;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/hello")
@CrossOrigin("*")
public class Hello {

    private final JdbcTemplate jdbcTemplate;

    public Hello(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public String hello(){
        return "Hello, YES I'M WORKING!!!!!!!!!!!!!!!!";
    }

    @GetMapping("/getAllData")
    public List<String> getAllData(){
        return jdbcTemplate.queryForList("select * from TASK").stream()
                .map(m -> m.values().toString())
                .collect(Collectors.toList());
    }
}

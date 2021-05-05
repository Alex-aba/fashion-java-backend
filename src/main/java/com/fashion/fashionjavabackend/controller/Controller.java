package com.fashion.fashionjavabackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    /**
     * Method is responsible fro fetching answer.
     *
     * @return String.
     */
    @GetMapping("/answer")
    public String getAnswer() {
        return "Hello My Friends!!!";
    }
}

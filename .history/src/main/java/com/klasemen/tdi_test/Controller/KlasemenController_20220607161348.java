package com.klasemen.tdi_test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/klasemen")
public class KlasemenController {

    @GetMapping
    public String klasemen() {
        return "Welcome to Klasemen";
    }

}

package com.klasemen.tdi_test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klasemen.tdi_test.Model.RegisterModel;
import com.klasemen.tdi_test.Service.RegisterService;

@RestController
@RequestMapping("/api/registrasi")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping
    public RegisterModel create(@RequestBody RegisterModel register) {
        return registerService.save(register);
    }

    @GetMapping
    public Iterable<RegisterModel> findAll() {
        return registerService.findAll();
    }

    @GetMapping("/{id}")
    public RegisterModel findOne(@PathVariable("id") Long id) {
        return registerService.findOne(id);
    }

    @PutMapping
    public RegisterModel update(@RequestBody RegisterModel register) {
        return registerService.save(register);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        registerService.removeOne(id);
    }
}

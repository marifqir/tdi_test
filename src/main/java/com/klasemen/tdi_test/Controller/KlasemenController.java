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

import com.klasemen.tdi_test.Model.KlasemenModel;
import com.klasemen.tdi_test.Service.KlasemenService;

@RestController
@RequestMapping("/klasemen")
public class KlasemenController {

    @Autowired
    private KlasemenService klasemenService;

    @PostMapping
    public KlasemenModel create(@RequestBody KlasemenModel klasemen) {
        return klasemenService.save(klasemen);
    }

    @GetMapping
    public Iterable<KlasemenModel> findAll() {
        return klasemenService.findAll();
    }

    @GetMapping("/{id}")
    public KlasemenModel findOne(@PathVariable("id") Long id) {
        return klasemenService.findOne(id);
    }

    @PutMapping
    public KlasemenModel update(@RequestBody KlasemenModel klasemen) {
        return klasemenService.save(klasemen);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        klasemenService.removeOne(id);
    }
}

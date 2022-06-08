package com.klasemen.tdi_test.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klasemen.tdi_test.Model.RegisterModel;
import com.klasemen.tdi_test.Repo.RegisterRepo;

@Service
@Transactional
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public RegisterModel save(RegisterModel register) {
        return registerRepo.save(register);
    }

    public RegisterModel findOne(Long id) {
        Optional<RegisterModel> register = registerRepo.findById(id);
        if (!register.isPresent()) {
            return null;
        }
        return register.get();
    }

    public Iterable<RegisterModel> findAll() {
        return registerRepo.findAll();
    }

    public void removeOne(Long id) {
        registerRepo.deleteById(id);
    }

    // public List<Register> findByName(String nama) {
    // return RegisterRepo.findByNameContains(nama);
    // }
}

package com.klasemen.tdi_test.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klasemen.tdi_test.Model.KlasemenModel;
import com.klasemen.tdi_test.Repo.KlasemenRepo;

@Service
@Transactional
public class KlasemenService {

    @Autowired
    private KlasemenRepo klasemenRepo;

    public KlasemenModel save(KlasemenModel klasemen) {
        return klasemenRepo.save(klasemen);
    }

    public KlasemenModel findOne(Long id) {
        Optional<KlasemenModel> klasemen = klasemenRepo.findById(id);
        if (!klasemen.isPresent()) {
            return null;
        }
        return klasemen.get();
    }

    public Iterable<KlasemenModel> findAll() {
        return klasemenRepo.findAll();
    }

    public void removeOne(Long id) {
        klasemenRepo.deleteById(id);
    }

    // public List<Klasemen> findByName(String nama) {
    // return KlasemenRepo.findByNameContains(nama);
    // }
}

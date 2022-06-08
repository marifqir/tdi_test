package com.klasemen.tdi_test.Repo;

import org.springframework.data.repository.CrudRepository;

import com.klasemen.tdi_test.Model.KlasemenModel;

public interface KlasemenRepo extends CrudRepository<KlasemenModel, Long> {

}

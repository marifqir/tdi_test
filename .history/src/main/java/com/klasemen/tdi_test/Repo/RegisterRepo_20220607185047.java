package com.klasemen.tdi_test.Repo;

import org.springframework.data.repository.CrudRepository;

import com.klasemen.tdi_test.Model.RegisterModel;

public interface RegisterRepo extends CrudRepository<RegisterModel, Long> {

}

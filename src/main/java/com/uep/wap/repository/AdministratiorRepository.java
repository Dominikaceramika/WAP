package com.uep.wap.repository;

import com.uep.wap.model.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratiorRepository extends CrudRepository<Administrator, Integer> {
}

package com.example.servingwebcontent.datajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    List<Admin> findByOwnerName(String owner_name);

    Admin findByStoreNum(Long store_num);

}

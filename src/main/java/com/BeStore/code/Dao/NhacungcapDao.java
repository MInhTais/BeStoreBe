package com.BeStore.code.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Nhacungcap;

@Repository
public interface NhacungcapDao extends JpaRepository<Nhacungcap, String> {

}

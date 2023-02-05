package com.BeStore.code.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Phanquyen;

@Repository
public interface PhanquyenDao extends JpaRepository<Phanquyen, Integer> {

}

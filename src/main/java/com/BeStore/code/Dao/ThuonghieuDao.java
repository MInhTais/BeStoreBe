package com.BeStore.code.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Thuonghieu;

@Repository
public interface ThuonghieuDao extends JpaRepository<Thuonghieu, Integer>{

}

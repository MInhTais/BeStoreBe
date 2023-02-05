package com.BeStore.code.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Loai;

@Repository
public interface LoaiDao extends JpaRepository<Loai, Integer>{

}

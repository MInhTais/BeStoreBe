package com.BeStore.code.Dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Cuahang;

@Repository
public interface CuahangDao extends JpaRepository<Cuahang, String> {
	
	@Query(value = "select Cuahang.* from Cuahang INNER JOIN  Sanpham ON Cuahang.macuahang=Sanpham.nguoitao where Sanpham.masp=?1",nativeQuery = true)
	Cuahang getCuahangBymasp(String masp);
	
}

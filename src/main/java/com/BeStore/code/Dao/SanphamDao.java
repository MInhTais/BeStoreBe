package com.BeStore.code.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Cuahang;
import com.BeStore.code.Entity.Sanpham;

@Repository
public interface SanphamDao  extends JpaRepository<Sanpham, String>{
	
//		@Query("SELECT u FROM Sanpham u WHERE u.masp= ?1")
		Sanpham getSanphamBymasp(String masp);

}

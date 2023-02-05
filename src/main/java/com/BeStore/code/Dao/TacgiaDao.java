package com.BeStore.code.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.BeStore.code.Entity.Tacgia;

@Repository
public interface TacgiaDao extends JpaRepository<Tacgia, Integer>{
	
		@Query("FROM Tacgia g WHERE g.tacgiacuasanpham.masp=?1")
		List<Tacgia>findAllTacgiaBymasp(String masp);
}

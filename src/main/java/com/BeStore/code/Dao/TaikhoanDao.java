package com.BeStore.code.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeStore.code.Entity.Taikhoan;

@Repository
public interface TaikhoanDao extends JpaRepository<Taikhoan, String> {
	Taikhoan findByTendnLike(String username);

}

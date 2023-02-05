package com.BeStore.code.Service;

import java.util.List;

import com.BeStore.code.Entity.Sanpham;

public interface SanphamService {
	
	List<Sanpham>getAllSanpham();
	Sanpham getSanphamBymasp(String masp);
}

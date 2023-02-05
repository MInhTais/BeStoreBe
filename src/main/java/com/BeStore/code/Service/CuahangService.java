package com.BeStore.code.Service;

import java.util.List;

import com.BeStore.code.Entity.Cuahang;

public interface CuahangService {
	List<Cuahang> findAllCuahang();
	Cuahang getCuahangBymasp(String masp);
}

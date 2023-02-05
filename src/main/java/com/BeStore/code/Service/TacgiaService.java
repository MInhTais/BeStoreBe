package com.BeStore.code.Service;

import java.util.List;

import com.BeStore.code.Entity.Sanpham;
import com.BeStore.code.Entity.Tacgia;

public interface TacgiaService {
	
	List<Tacgia> findAll();
	List<Tacgia>getTacgiaBymatacgia(String masp);
}

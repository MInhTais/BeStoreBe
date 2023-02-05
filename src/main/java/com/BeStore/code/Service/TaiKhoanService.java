package com.BeStore.code.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BeStore.code.Entity.Taikhoan;

@Service
@Component
public interface TaiKhoanService {
	
	Taikhoan findByUsername(String username);
}

package com.BeStore.code.ResController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Dao.TaikhoanDao;
import com.BeStore.code.Entity.Taikhoan;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("*")
public class TaikhoanRestController {
	@Autowired TaikhoanDao dao;
	@GetMapping("/taikhoan")
	public ResponseEntity<List<Taikhoan>>getTaiKhoan(){
		return ResponseEntity.ok(dao.findAll());
	}
	
}	

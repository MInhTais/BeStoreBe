package com.BeStore.code.ResController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Dao.CuahangDao;
import com.BeStore.code.Entity.Cuahang;

@RestController
@CrossOrigin("*")
public class CuahangRestController {
	
	@Autowired CuahangDao cuahangdao;
	@GetMapping("/cuahang")
	public ResponseEntity<List<Cuahang>>getCuahang(){
		return ResponseEntity.ok(cuahangdao.findAll());
	}
}

package com.BeStore.code.ResController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Dao.ThuonghieuDao;
import com.BeStore.code.Entity.Thuonghieu;

@RestController
@CrossOrigin("*")
public class ThuonghieuRestController {
	
	@Autowired ThuonghieuDao thuonghieudao;
	@GetMapping("/thuonghieu")
	public ResponseEntity<List<Thuonghieu>>getThuonghieu(){
		return ResponseEntity.ok(thuonghieudao.findAll());
	}
}

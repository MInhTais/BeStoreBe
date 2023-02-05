package com.BeStore.code.ResController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Dao.NhacungcapDao;
import com.BeStore.code.Dao.PhanquyenDao;
import com.BeStore.code.Entity.Phanquyen;

@RestController
@CrossOrigin("*")

public class PhanQuyenRestController {
	@Autowired PhanquyenDao dao;
	@GetMapping("/phanquyen")
	public ResponseEntity<Collection<Phanquyen>>phanquyen(){
		return ResponseEntity.ok(dao.findAll());
	}
}

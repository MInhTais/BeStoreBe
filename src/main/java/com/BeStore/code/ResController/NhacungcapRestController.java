package com.BeStore.code.ResController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Dao.NhacungcapDao;
import com.BeStore.code.Entity.Nhacungcap;

@RestController
@CrossOrigin("*")
public class NhacungcapRestController {
	
	@Autowired NhacungcapDao nhacungcapdao;
	@GetMapping("/nhacungcap")
	public ResponseEntity<List<Nhacungcap>>nhacungcap(){
		return ResponseEntity.ok(nhacungcapdao.findAll());
	}
}

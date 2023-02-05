package com.BeStore.code.ResController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.Entity.Sanpham;
import com.BeStore.code.Service.CuahangService;
import com.BeStore.code.Service.SanphamService;
import com.BeStore.code.Service.TacgiaService;

@CrossOrigin("*")
@RestController
public class SanphamRestController {

	@Autowired SanphamService sanphamservice;
	@Autowired TacgiaService tacgiaService;
	@Autowired CuahangService cuahangService;
	
	@CrossOrigin("*")
	@GetMapping("/sanpham")
	public ResponseEntity<List<Sanpham>>getSanpham(){
		return ResponseEntity.ok(sanphamservice.getAllSanpham());
	}
	@GetMapping(value = "/sanpham", params = { "masp" })
	public ResponseEntity<Map<String, Object>> getSanphamBymasp(@RequestParam("masp") String masp){
		Map<String,Object> map=new HashMap<>();
		System.out.println();
		map.put("sanphamDetail",sanphamservice.getSanphamBymasp(masp));
		map.put("tacgia", tacgiaService.getTacgiaBymatacgia(masp));
		map.put("cuahang",cuahangService.getCuahangBymasp(masp));
		return ResponseEntity.ok(map);
	}
}

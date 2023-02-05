package com.BeStore.code.ResController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeStore.code.DTO.LoginDTO;
import com.BeStore.code.Entity.Taikhoan;
import com.BeStore.code.Service.TaiKhoanService;

import jakarta.servlet.http.HttpServletRequest;
@RestController

@CrossOrigin("*")
public class DangNhapAPIController {
	
	@Autowired Taikhoan tk;
	@Autowired TaiKhoanService tkService;
	
	@PostMapping("/taikhoan")
	public ResponseEntity<?>authenticatedUser(@Valid @RequestBody LoginDTO loginRequest,HttpServletRequest http ){
		System.out.println(loginRequest.getTendn());
		System.out.println(loginRequest.getMatkhau());
		tk=tkService.findByUsername(loginRequest.getTendn());
		System.out.println("Gall"+tkService.findByUsername(loginRequest.getTendn()));
		return ResponseEntity.ok(tk);
		
	}
}

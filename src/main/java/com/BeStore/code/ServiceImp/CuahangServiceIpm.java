package com.BeStore.code.ServiceImp;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeStore.code.Dao.CuahangDao;
import com.BeStore.code.Entity.Cuahang;
import com.BeStore.code.Service.CuahangService;

@Service
public class CuahangServiceIpm implements CuahangService{
	
	@Autowired CuahangDao cuahangdao;

	@Override
	public List<Cuahang> findAllCuahang() {
		// TODO Auto-generated method stub
		return cuahangdao.findAll();
	}

	@Override
	public Cuahang getCuahangBymasp(String masp) {
		// TODO Auto-generated method stub
		return cuahangdao.getCuahangBymasp(masp);
	}
}

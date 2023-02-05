package com.BeStore.code.ServiceImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeStore.code.Dao.SanphamDao;
import com.BeStore.code.Entity.Sanpham;
import com.BeStore.code.Service.SanphamService;

@Service
public class SanphamServiceImp implements SanphamService {
	@Autowired SanphamDao sanphamdao;
	private Object List;

	@Override
	public List<Sanpham> getAllSanpham() {
		// TODO Auto-generated method stub
		
		return sanphamdao.findAll().isEmpty() ? Collections.emptyList():sanphamdao.findAll();
	}

	@Override
	public Sanpham getSanphamBymasp(String masp) {
		// TODO Auto-generated method stub
		Sanpham sp=sanphamdao.getSanphamBymasp(masp);
		return sanphamdao.getSanphamBymasp(masp);
	}


}

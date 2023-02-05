package com.BeStore.code.ServiceImp;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeStore.code.Dao.TacgiaDao;
import com.BeStore.code.Entity.Sanpham;
import com.BeStore.code.Entity.Tacgia;
import com.BeStore.code.Service.TacgiaService;

@Service
public class TacgiaServiceIpm implements TacgiaService {
	
	@Autowired TacgiaDao tacgiadao;
	
	@Override
	public List<Tacgia> findAll() {
		// TODO Auto-generated method stub
		return tacgiadao.findAll().isEmpty()?Collections.emptyList():tacgiadao.findAll();
	}

	@Override
	public List<Tacgia> getTacgiaBymatacgia(String masp) {
		// TODO Auto-generated method stub
		return tacgiadao.findAllTacgiaBymasp(masp);
	}





}

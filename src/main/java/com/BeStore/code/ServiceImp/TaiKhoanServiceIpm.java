package com.BeStore.code.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeStore.code.Dao.TaikhoanDao;
import com.BeStore.code.Entity.Taikhoan;
import com.BeStore.code.Service.TaiKhoanService;

@Service
public class TaiKhoanServiceIpm implements TaiKhoanService{
	
	@Autowired TaikhoanDao tkdao;
	@Autowired Taikhoan tk;
	@Override
	public Taikhoan findByUsername(String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
		return tkdao.findByTendnLike(username);
	}

}

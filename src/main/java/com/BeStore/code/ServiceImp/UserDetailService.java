//package com.BeStore.code.ServiceImp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.BeStore.code.Entity.Taikhoan;
//import com.BeStore.code.Securiry.UserDetail;
//import com.BeStore.code.Service.TaiKhoanService;
//
//public class UserDetailService implements UserDetailsService {
//
//	@Autowired TaiKhoanService tkService;
//	@Autowired Taikhoan tk;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		tk=tkService.findByUsername(username);
//		if (tk == null) {
//			System.out.println("Not found: " + username);
//			throw new UsernameNotFoundException("Login Failed...");
//		}
//		return new UserDetail(tk);
//	}
//
//}

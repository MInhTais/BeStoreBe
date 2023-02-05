//package com.BeStore.code.Securiry;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.BeStore.code.Entity.Taikhoan;
//import com.BeStore.code.Entity.Vaitro;
//
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor
//public class UserDetail implements UserDetails {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private Taikhoan taikhoan;
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		List<SimpleGrantedAuthority>authorities=new ArrayList<>();
//		List<Vaitro>vaitro=taikhoan.getVaitro();
//		vaitro.forEach(role->authorities.add(new SimpleGrantedAuthority(role.getMavt())));
//		return authorities;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return taikhoan.getMatkhau();
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return taikhoan.getTendn();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return taikhoan.getKichhoat();
//	}
//
//}

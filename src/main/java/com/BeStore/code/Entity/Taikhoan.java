package com.BeStore.code.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@AllArgsConstructor @NoArgsConstructor
public class Taikhoan implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String tendn;
	private String matkhau;
	private String hoten;
	private Boolean gioitinh;
	private Date ngaysinh;
	private String hinhanh;
	private String sdt;
	private Boolean kichhoat=false;
	private String maxacthuc;
	private String nhacungcap;
	private Date ngaytao;
	private Integer tichdiem=0;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="Phanquyen",joinColumns = @JoinColumn(name="tendn")
	,inverseJoinColumns = @JoinColumn(name="mavt"))
	private List<Vaitro> Vaitro = new ArrayList<Vaitro>();
	@OneToMany(mappedBy = "nguoithem")
	@JsonIgnore
	List<Nhacungcap>ncc;
	
	@OneToOne(mappedBy = "email")
	@JsonIgnore
	private Cuahang cuahang;
		
}	

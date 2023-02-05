package com.BeStore.code.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sanpham implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String masp;
	private String tensp;
	private Integer gianhap;
	private Integer dongia;
//	private Integer maloai;
//	private Integer math;
	private String sanxuat;
//	private String baoquan;
//	private String sudung;
	private String mota;
	private String hinhanh;
	private Integer giamgia=0;
	private Integer tongsl;
	private Integer daban;
	private Integer conlai;
//	private Integer trongluong;
	private Integer views=0;
//	private Date ngayhethan;
	private Date ngaytao;
//	private String mancc;
//	private String madvd;
	private Boolean trangthai;
//	private String nguoitao;
	private Date ngayxuatban;
	private String kichthuoc ;
	private String dichgia;
	private String loaibia;
	private Integer sotrang;
	@ManyToOne
	@JoinColumn(name = "maloai")
	private Loai loaisp;
	
	@ManyToOne
	@JoinColumn(name = "math")
	private Thuonghieu mathsp;
	
	@ManyToOne
	@JoinColumn(name="mancc")
	private Nhacungcap manccsp;
	
	@ManyToOne
	@JoinColumn(name = "madvd")
	private Donvido madvdsp;
	@ManyToOne
	@JoinColumn(name="nguoitao")
	private Cuahang machcuahang;
	@OneToMany(mappedBy ="tacgiacuasanpham")
	@JsonIgnore
	List<Tacgia>tacgia;

}

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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Nhacungcap implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String mancc;
	private String tenncc;
	private String sdt;
	private String diachi;
	private Date ngaythamgia;
	private Boolean trangthai;
	@ManyToOne
	@JoinColumn(name="nguoithem")
	private Taikhoan nguoithem;
	
	@OneToMany(mappedBy = "manccsp")
	@JsonIgnore
	private List<Sanpham>manccsp;
	
	

}

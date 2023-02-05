package com.BeStore.code.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Loai implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer maloai;
	private String tenloai;
	private String mota;
	@ManyToOne
	@JoinColumn(name = "manhom")
	private Nhomloai manhom;
	private String hinhanh;
	
	@OneToMany(mappedBy = "thuonghieu")
	@JsonIgnore
	private List<Thuonghieu>thuonghieu;
	
	@OneToMany(mappedBy = "loaisp")
	@JsonIgnore
	private List<Sanpham>loaisanpham;
	

	
	
}

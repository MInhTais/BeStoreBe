package com.BeStore.code.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Cuahang implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String macuahang;
	private String tencuahang;
	private String chucuahang;
	private String linhvucbuonban;
	private Boolean pheduyet;
	private String diachi;
	private Date ngaytao;
	private String mota;
	private String logo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="email")
	private Taikhoan email;
	@OneToMany(mappedBy = "machcuahang")
	@JsonIgnore
	List<Sanpham>cuahang;

}

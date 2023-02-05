package com.BeStore.code.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Phanquyen implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Integer mapq;
	@ManyToOne 
	@JoinColumn(name = "tendn")
	public Taikhoan taikhoan;
	@ManyToOne
	@JoinColumn(name ="mavt")
	public Vaitro vaitro;
	
	
}

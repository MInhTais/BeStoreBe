package com.BeStore.code.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Donvido implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String madvd;
	private String tendvd;
	
	@OneToMany(mappedBy = "madvdsp")
	@JsonIgnore
	private List<Sanpham>madvdsp=new ArrayList<>();

}

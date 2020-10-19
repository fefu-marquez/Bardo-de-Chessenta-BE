package com.ArmatorX.BardodeChessentaBE.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmocionEspecifica {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
}
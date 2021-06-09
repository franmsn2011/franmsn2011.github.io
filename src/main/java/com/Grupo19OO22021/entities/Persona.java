package com.Grupo19OO22021.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;

	@Column(name="nombrePersona")
	private String nombrePersona;
	
	@Column(name="apellidoPersona")
	private String apellidoPersona ;
	
	@Column(name="dniPersona")
	private long dniPersona ;
	
	@Column(name="nombreUsuarioPersona")
	private String nombreUsuarioPersona;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
	private Set<Permiso> permisos = new HashSet<Permiso>();

	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
	private Set<Usuario> usuarios = new HashSet<Usuario>();


	public Persona() {
	}


	public Persona(int idPersona,String nombrePersona, String apellidoPersona, long dniPersona) {
		super();
		this.idPersona=idPersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.dniPersona = dniPersona;
	}
	
	
	public Persona(int idPersona, String nombrePersona, String apellidoPersona, long dniPersona,
			String nombreUsuarioPersona) {
		super();
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.dniPersona = dniPersona;
		this.nombreUsuarioPersona = nombreUsuarioPersona;
	}


	public Persona(int idPersona,String nombrePersona, String apellidoPersona, long dniPersona,Set<Usuario> usuarios) {
		super();
		this.idPersona=idPersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.dniPersona = dniPersona;
		this.usuarios = usuarios;
	}

	
	public String getNombreUsuarioPersona() {
		return nombreUsuarioPersona;
	}


	public void setNombreUsuarioPersona(String nombreUsuarioPersona) {
		this.nombreUsuarioPersona = nombreUsuarioPersona;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public String getNombrePersona() {
		return nombrePersona;
	}


	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}


	public String getApellidoPersona() {
		return apellidoPersona;
	}


	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}


	public long getDniPersona() {
		return dniPersona;
	}


	public void setDniPersona(long dniPersona) {
		this.dniPersona = dniPersona;
	}


	public Set<Permiso> getPermisos() {
		return permisos;
	}


	public void setPermisos(Set<Permiso> permisos) {
		this.permisos = permisos;
	}

/*
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	*/
	
	
	
	
	
}

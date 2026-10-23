package com.empresascrud.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name = "empresas")
public class Empresa {  

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_empresa")
    private Long idEmpresa;

    @NotBlank
    @Column (name = "nombre_comercial", length = 150)
    private String nombreComercial;

    @NotBlank
    @Column (name = "razon_social", length = 150)
    private String razonSocial;

    @NotBlank 
    @Size (max = 8)
    @Pattern(regexp = "^[0-9]{8}$")
    @Column (name = "telefono", length = 20)
    private String telefono;
    
    @NotBlank 
    @Email
    @Column (name = "correo_electronico", length = 150)
    private String correoElectronico;

    @NotBlank 
    @Size (max = 9)
    @Pattern (regexp = "^[0-9]{9}$")
    @Column (name = "nit", length = 30)
    private String nit;

    @NotBlank 
    @Column (name = "estado", length = 20)
    private String estado;

    @NotBlank 
    @Size (max = 250)
    @Column (name = "direccion", length = 250)
    private String direccion;

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

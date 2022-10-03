package com.tcc.apicuartostcc.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mercancias")

public class Mercancia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iup")
    private Integer iup;
    @Column(name = "volumen")
    private Double volumen;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipoRemitente")
    private String tipoRemitente;
    @Column(name = "idRemitente")
    private String idRemitente;
    @Column(name = "nombreRemitente")
    private String nombreRemitente;
    @Column(name = "deptoRemitente")
    private String deptoRemitente;
    @Column(name = "municipioRemitente")
    private String municipioRemitente;
    @Column(name = "direccionRemitente")
    private String direccionRemitente;
    @Column(name = "tipoDestinatario")
    private String tipoDestinatario;
    @Column(name = "idDestinatario")
    private String idDestinatario;
    @Column(name = "nombreDestinatar")
    private String nombreDestinatario;
    @Column(name = "deptoDestinatario")
    private String deptoDestinatario;
    @Column(name = "municipioDestinatario")
    private String municipioDestinatario;
    @Column(name = "direccionesDestinatario")
    private String direccionDestinatario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_zona", referencedColumnName = "id")
    @JsonBackReference
    private Zona zona;

    public Mercancia() {

    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Integer getIup() {
        return iup;
    }

    public void setIup(Integer iup) {
        this.iup = iup;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRemitente() {
        return tipoRemitente;
    }

    public void setTipoRemitente(String tipoRemitente) {
        this.tipoRemitente = tipoRemitente;
    }

    public String getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(String idRemitente) {
        this.idRemitente = idRemitente;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getDeptoRemitente() {
        return deptoRemitente;
    }

    public void setDeptoRemitente(String deptoRemitente) {
        this.deptoRemitente = deptoRemitente;
    }

    public String getMunicipioRemitente() {
        return municipioRemitente;
    }

    public void setMunicipioRemitente(String municipioRemitente) {
        this.municipioRemitente = municipioRemitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getTipoDestinatario() {
        return tipoDestinatario;
    }

    public void setTipoDestinatario(String tipoDestinatario) {
        this.tipoDestinatario = tipoDestinatario;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(String idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDeptoDestinatario() {
        return deptoDestinatario;
    }

    public void setDeptoDestinatario(String deptoDestinatario) {
        this.deptoDestinatario = deptoDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }



}

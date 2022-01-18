package br.com.leonardo.microservice.loja.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EnderecoDTO {

    private String rua;
    private int numero;
    private String estado;
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

    
    
}

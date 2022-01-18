package br.com.leonardo.microservice.loja.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InfoFornecedorDTO {
    private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
    
}

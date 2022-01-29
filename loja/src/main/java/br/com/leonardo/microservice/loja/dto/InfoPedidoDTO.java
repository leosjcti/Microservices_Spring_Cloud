package br.com.leonardo.microservice.loja.dto;

public class InfoPedidoDTO {
	
	private Long id;
	
	private Integer tempoDepreparo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTempoDepreparo() {
		return tempoDepreparo;
	}

	public void setTempoDepreparo(Integer tempoDepreparo) {
		this.tempoDepreparo = tempoDepreparo;
	}
	
	

}

package br.com.leonardo.microservice.loja.model;

public class Compra {
	
	private Long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEndereco() {
		return enderecoDestino;
	}

	public void setEndereco(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	@Override
	public String toString() {
		return "Compra [pedidoId=" + pedidoId + ", tempoDePreparo=" + tempoDePreparo + ", enderecoDestino="
				+ enderecoDestino + "]";
	}
	
	
	
	
	
}

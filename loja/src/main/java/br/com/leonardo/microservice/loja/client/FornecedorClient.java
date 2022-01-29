package br.com.leonardo.microservice.loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.leonardo.microservice.loja.controller.dto.InfoFornecedorDTO;
import br.com.leonardo.microservice.loja.controller.dto.ItemDaCompraDTO;
import br.com.leonardo.microservice.loja.dto.InfoPedidoDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	//Criar o método do serviço que será utilizado
	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	InfoPedidoDTO realizaPedido(List<ItemDaCompraDTO> itens);

}

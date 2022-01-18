package br.com.leonardo.microservice.fornecedor.controller;

import br.com.leonardo.microservice.fornecedor.model.InfoFornecedor;
import br.com.leonardo.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        return infoService.getInfoPorEstado(estado);
    }
}

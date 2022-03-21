package com.gabrielrossilopes.appmalote.controller.api;

import com.gabrielrossilopes.appmalote.model.dominio.Empresa;
import com.gabrielrossilopes.appmalote.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping(value = "/listar")
    public List<Empresa> obterLista() {
        return empresaService.buscaTodasOrdenado();
    }

    @GetMapping(value = "/qtde")
    public Long obterQtde() {
        return empresaService.obterQtde();
    }
}

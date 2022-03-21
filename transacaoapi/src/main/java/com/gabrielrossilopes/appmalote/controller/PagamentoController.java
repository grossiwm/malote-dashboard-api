package com.gabrielrossilopes.appmalote.controller;

import com.gabrielrossilopes.appmalote.model.dominio.Pagamento;
import com.gabrielrossilopes.appmalote.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(value = "/listar/pagamento")
    public List<Pagamento> obterLista() {
        return pagamentoService.getAll();
    }


    @GetMapping(value = "/qtde/pagamento")
    public Long obterQtde() {
        return pagamentoService.obterQtde();
    }
}

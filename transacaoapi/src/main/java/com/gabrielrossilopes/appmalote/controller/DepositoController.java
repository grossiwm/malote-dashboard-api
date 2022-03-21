package com.gabrielrossilopes.appmalote.controller;

import com.gabrielrossilopes.appmalote.model.dominio.Deposito;
import com.gabrielrossilopes.appmalote.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class DepositoController {

    @Autowired
    private DepositoService depositoService;

    @GetMapping(value = "/listar/deposito")
    public List<Deposito> obterLista() {
        return depositoService.getAll();
    }


    @GetMapping(value = "/qtde/deposito")
    public Long obterQtde() {
        return depositoService.obterQtde();
    }
}

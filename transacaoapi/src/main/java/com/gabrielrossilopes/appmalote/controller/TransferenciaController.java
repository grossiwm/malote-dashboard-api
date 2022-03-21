package com.gabrielrossilopes.appmalote.controller;

import com.gabrielrossilopes.appmalote.model.dominio.Transferencia;
import com.gabrielrossilopes.appmalote.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping(value = "/listar/transferencia")
    public List<Transferencia> obterLista() {
        return transferenciaService.getAll();
    }


    @GetMapping(value = "/qtde/transferencia")
    public Long obterQtde() {
        return transferenciaService.obterQtde();
    }
}

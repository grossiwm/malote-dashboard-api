package com.gabrielrossilopes.appmalote.controller;

import com.gabrielrossilopes.appmalote.model.dominio.Transacao;
import com.gabrielrossilopes.appmalote.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping("/listar")
    public List<Transacao> listar() {
        return transacaoService.listarTransacoes();
    }
}

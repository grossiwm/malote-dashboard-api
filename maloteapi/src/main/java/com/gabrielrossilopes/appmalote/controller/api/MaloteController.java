package com.gabrielrossilopes.appmalote.controller.api;

import com.gabrielrossilopes.appmalote.model.dominio.Malote;
import com.gabrielrossilopes.appmalote.service.MaloteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/malote")
public class MaloteController {

    @Autowired
    private MaloteService maloteService;

    @GetMapping(value = "/listar")
    public List<Malote> obterLista() {
        return maloteService.listar();
    }

    @GetMapping(value = "/{idUser}/listar")
    public List<Malote> obterLista(@PathVariable Long idUser){
        return maloteService.listarPorUsuario(idUser);
    }

    @GetMapping(value = "/qtde")
    public Long obterQtde() {
        return maloteService.obterQtde();
    }

    @GetMapping(value = "/{id}/obter")
    public Malote obterPorId(@PathVariable Long id) {
        return maloteService.getById(id);
    }

}

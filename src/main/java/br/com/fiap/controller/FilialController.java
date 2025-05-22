package br.com.fiap.controller;


import br.com.fiap.entity.Filial;
import br.com.fiap.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filiais")
public class FilialController {

    @Autowired
    private FilialService filialService;

    @PostMapping
    public Filial criar(@RequestBody Filial filial) {
        return filialService.salvar(filial);
    }

    @GetMapping
    public List<Filial> listar() {
        return filialService.listarTodos();
    }

    @PutMapping("/{id}")
    public Filial atualizar(@PathVariable Integer id, @RequestBody Filial filial) {
        return filialService.atualizar(id, filial);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        filialService.deletar(id);
    }
}

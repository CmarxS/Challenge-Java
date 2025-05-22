package br.com.fiap.controller;

import br.com.fiap.entity.Cidade;
import br.com.fiap.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping
    public Cidade criar(@RequestBody Cidade cidade) {
        return cidadeService.salvar(cidade);
    }

    @GetMapping
    public List<Cidade> listar() {
        return cidadeService.listarTodos();
    }

    @PutMapping("/{id}")
    public Cidade atualizar(@PathVariable Integer id, @RequestBody Cidade cidade) {
        return cidadeService.atualizar(id, cidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        cidadeService.deletar(id);
    }
}

package br.edu.infnet.nuvemat.controller;

import br.edu.infnet.nuvemat.model.Cotacao;
import br.edu.infnet.nuvemat.repository.CotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("cotacao")
public class CotacaoController {

    @Autowired
    private CotacaoRepository cotacaoRepository;


    //RDS - LISTANDO
    @GetMapping
    public Iterable<Cotacao> findAll() {
        return cotacaoRepository.findAll();
    }

    //RDS - INCLUIR
    @PostMapping("incluir")
    public Cotacao incluir(@RequestBody Cotacao cotacao) {
        Cotacao ctc = cotacaoRepository.save(cotacao);
        return ctc;
    }

    //RDS - ALTERAR
    @PutMapping("alterar")
    public Cotacao alterar(@RequestBody Cotacao cotacao) {
        return cotacaoRepository.save(cotacao);
    }

    //RDS - DELETE
    @DeleteMapping("deletar")
    public String deletar(@RequestBody Cotacao cotacao) { //OLHAR
        cotacaoRepository.deleteById(cotacao.getId());
        return "Cotacação id = " + cotacao.getId() + " apagada com sucesso!";
    }

    @GetMapping(value = "/{id}")
    public Optional<Cotacao> findById(@PathVariable Integer id) { //OLHAR
        return cotacaoRepository.findById(id);
    }

}

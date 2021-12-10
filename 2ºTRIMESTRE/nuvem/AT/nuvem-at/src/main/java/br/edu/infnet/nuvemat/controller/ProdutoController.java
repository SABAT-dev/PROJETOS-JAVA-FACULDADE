package br.edu.infnet.nuvemat.controller;

import br.edu.infnet.nuvemat.model.Produto;
import br.edu.infnet.nuvemat.repository.ProdutoRepository;
import br.edu.infnet.nuvemat.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private S3Service s3Service;

    //RDS - LISTANDO
    @GetMapping
    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }

    //RDS - INCLUIR
    @PostMapping("incluir")
    public Produto incluir(@RequestBody Produto produto) {
        Produto pdt = produtoRepository.save(produto);
        return pdt;
    }

    //RDS - ALTERAR
    @PutMapping("alterar")
    public Produto alterar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    //RDS - DELETE
    @DeleteMapping("deletar")
    public String deletar(@RequestBody Produto produto) { //OLHAR
        produto.setCotacao(null);
        produtoRepository.deleteById(produto.getId());
        return "Produto id = " + produto.getId() + " apagado com sucesso!";
    }

    @GetMapping(value = "/{id}")
    public Optional<Produto> findById(@PathVariable Integer id) { //OLHAR
        return produtoRepository.findById(id);
    }

}

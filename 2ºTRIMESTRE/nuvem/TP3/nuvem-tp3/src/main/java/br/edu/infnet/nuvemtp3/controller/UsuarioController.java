package br.edu.infnet.nuvemtp3.controller;

import br.edu.infnet.nuvemtp3.model.Endereco;
import br.edu.infnet.nuvemtp3.model.Usuario;
import br.edu.infnet.nuvemtp3.repository.EnderecoRepository;
import br.edu.infnet.nuvemtp3.repository.UsuarioRepository;
import br.edu.infnet.nuvemtp3.service.S3Service;
import br.edu.infnet.nuvemtp3.service.ViaCepService;
import br.edu.infnet.nuvemtp3.service.dto.DtoEndereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pasta")
public class UsuarioController {

	private ViaCepService viaCepService;

	@Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private S3Service s3Service;

    //RDS - LISTANDO
    @GetMapping
    public Iterable<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    //RDS - INCLUIR
    @PostMapping("incluir")
    public Usuario incluir(@RequestBody Usuario usuario) {

        Endereco endereco = usuario.getEndereco();
        enderecoRepository.save(endereco);
        Usuario user = usuarioRepository.save(usuario);
        return  user;
//    	DtoEndereco dtoEndereco = viaCepService.findByEndereco(usuario.getEndereco().getCep());
//    	usuario.getEndereco().copyFrom(dtoEndereco);
//        Usuario user = usuarioRepository.save(usuario);
//        return user;
    }

    //RDS - ALTERAR
    @PutMapping("alterar")
    public Usuario alterar(@RequestBody Usuario usuario) {
        enderecoRepository.save(usuario.getEndereco());
        return usuarioRepository.save(usuario);
    }

    //RDS - DELETE
    @DeleteMapping("delete")
    public String deletar(@RequestBody Usuario usuario) {
        Endereco endereco = usuario.getEndereco();
        usuario.setEndereco(null);
        usuarioRepository.deleteById(usuario.getId());
        enderecoRepository.deleteById(endereco.getId());
        return "Usuário id = " + usuario.getId() + "apagado(a) com sucesso!";
    }

    @GetMapping(value = "/{id}")
    public Optional<Usuario> getById(@PathVariable Integer id) {
        return usuarioRepository.findById(id);
    }

    @GetMapping(value = "/email/{email}")
    public Optional<Usuario> getByEmail(@PathVariable String email) {
        return usuarioRepository.findByEmail(email);
    }


    //BUCKET - LISTAR
    @GetMapping("listar")
    public List<String> listar() {
        return s3Service.listar();
    }

    //BUCKET - ENVIAR
    @PostMapping("enviar")
    public String fileUpload(@RequestPart(value = "file") MultipartFile file) {
        s3Service.salvarS3(file);
        return "O arquivo " + file.getName() + " foi salvo com sucesso!!!";
    }

    //BUCKET - DELETAR
    @DeleteMapping("deletar")
    public String fileDelete(@RequestPart(value = "nameFile") String nameFile) {
        s3Service.deletarS3(nameFile);
        return "O arquivo " + nameFile + " foi deletado com sucesso!!!";
    }
    
}



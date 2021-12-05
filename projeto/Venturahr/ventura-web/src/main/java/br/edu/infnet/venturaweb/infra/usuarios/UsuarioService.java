package br.edu.infnet.venturaweb.infra.usuarios;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.edu.infnet.venturaweb.domain.usuarios.Usuario;

@FeignClient(url = "http://localhost:8081/usuarios", name = "Usuarios")
public interface UsuarioService {

	@GetMapping(path = {"/email/{email}"})
	Usuario obterPorEmail(@PathVariable String email);
	
	@PostMapping
	Usuario inserirUsuario(Usuario usuario);
		
	@PutMapping
	Usuario atualizarUsuario(Usuario usuario);
}

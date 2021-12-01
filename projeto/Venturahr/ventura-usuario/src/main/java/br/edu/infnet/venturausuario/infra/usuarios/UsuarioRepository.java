package br.edu.infnet.venturausuario.infra.usuarios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.venturausuario.domain.usuarios.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByEmail(String email);

}

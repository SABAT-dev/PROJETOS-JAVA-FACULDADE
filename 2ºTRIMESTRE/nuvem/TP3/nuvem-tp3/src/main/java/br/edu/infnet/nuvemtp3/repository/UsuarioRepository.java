package br.edu.infnet.nuvemtp3.repository;

import br.edu.infnet.nuvemtp3.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("from Usuario user where user.email =:email")
    public Optional<Usuario> findByEmail(String email);

    public Usuario save(String email);


}
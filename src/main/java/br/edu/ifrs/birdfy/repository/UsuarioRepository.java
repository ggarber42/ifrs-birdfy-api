package br.edu.ifrs.birdfy.repository;

import br.edu.ifrs.birdfy.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String firebaseUiid);
}

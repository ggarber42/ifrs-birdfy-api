package br.edu.ifrs.birdfy.service;

import br.edu.ifrs.birdfy.model.Ave;
import br.edu.ifrs.birdfy.model.Usuario;
import br.edu.ifrs.birdfy.repository.UsuarioRepository;
import br.edu.ifrs.birdfy.utils.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario createUsuario(Usuario usuario){ return usuarioRepo.save(usuario);}

    public Usuario getUsuarioByID(int usuarioId){
        Usuario usuario = usuarioRepo.findById(usuarioId).orElseThrow(
                () -> new EntityNotFoundException("Ave not found" + usuarioId));
        return usuario;
    }
}

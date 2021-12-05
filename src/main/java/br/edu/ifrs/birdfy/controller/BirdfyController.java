package br.edu.ifrs.birdfy.controller;

import br.edu.ifrs.birdfy.model.Ave;
import br.edu.ifrs.birdfy.model.Usuario;
import br.edu.ifrs.birdfy.service.AveService;
import br.edu.ifrs.birdfy.service.UsuarioService;
import br.edu.ifrs.birdfy.utils.EntityNotFoundException;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/birdfy")
public class BirdfyController {

    @Autowired
    private AveService aveService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/ave")
    public ResponseEntity<List<Ave>> getAllAves(){
        return ResponseEntity.ok(aveService.getAllAves());
    }

    @GetMapping(value="/ave/{id}")
    public ResponseEntity<Ave> getAve(@PathVariable("id") int id) throws EntityNotFoundException {
        return ResponseEntity.ok().body(aveService.getAveByID(id));
    }

    @PostMapping("/ave")
    public Ave createAve(@NotNull @RequestBody Ave ave){
        return aveService.createAve(ave);
    }

    @PutMapping(value="/ave/{id}")
    public ResponseEntity<Ave> updateAve(@PathVariable(value = "id") Integer aveId, @RequestBody Ave ave) throws EntityNotFoundException {
        return ResponseEntity.ok(aveService.updateAve(aveId, ave));
    }

    @DeleteMapping(value="/ave/{id}")
    public ResponseEntity<Void>  deleteAve(@PathVariable int id) throws EntityNotFoundException {
        aveService.deleteAve(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/usuario")
    public Usuario createUsuario(@NotNull @RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping(value="/usuario/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") String uuid) throws EntityNotFoundException {
        return ResponseEntity.ok().body(usuarioService.getUsuarioByFirebaseUiid(uuid));
    }

    @PutMapping(value="/usuario/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable(value = "id") String uuid, @RequestBody Usuario usuario) throws EntityNotFoundException {
        return ResponseEntity.ok(usuarioService.updateUsuarioByFirebaseUiid(uuid, usuario));
    }
}

package br.edu.ifrs.birdfy.controller;

import br.edu.ifrs.birdfy.model.Ave;
import br.edu.ifrs.birdfy.service.AveService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/bird")
public class BirdfyController {

    @Autowired
    private AveService aveService;

    @GetMapping
    public ResponseEntity<List<Ave>> getAllAves(){
        return ResponseEntity.ok(aveService.getAllAves());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Ave> getAve(@PathVariable("id") int id){ return ResponseEntity.ok().body(aveService.getAveByID(id)); }

    @PostMapping
    public Ave createAve(@NotNull @RequestBody Ave ave){
        return aveService.createAve(ave);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Ave> updateAve(@PathVariable(value = "id") Integer aveId, @RequestBody Ave ave) {
        return ResponseEntity.ok(aveService.updateAve(aveId, ave));
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void>  deleteAve(@PathVariable int id){
        aveService.deleteAve(id);
        return ResponseEntity.ok().build();
    }
}

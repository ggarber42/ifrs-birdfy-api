package br.edu.ifrs.birdfly.birdfly.controller;

import br.edu.ifrs.birdfly.birdfly.entity.Ave;
import br.edu.ifrs.birdfly.birdfly.service.AveService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/bird")
public class BirdfyController {

    @Autowired
    private AveService aveService;

    @GetMapping
    public List<Ave> getAllAves(){
        return aveService.getAllAves();
    }

    @GetMapping(value="/{id}")
    public Ave getAve(@PathVariable("id") Long id){
        return aveService.getAveByID(id);
    }

    @PostMapping
    public String createAve(@NotNull @RequestBody Ave ave){
        return aveService.createAve(ave);
    }

    @DeleteMapping(value="/{id}")
    public void deleteTodo(@PathVariable Long id){
        aveService.deleteAve(id);
    }
}

package br.com.darkthriftstore.controller;

import br.com.darkthriftstore.model.CategoriaModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    Logger log = LoggerFactory.getLogger(getClass());
    List<CategoriaModel> repository = new ArrayList<CategoriaModel>();

    @GetMapping
    public List<CategoriaModel> index(){
        return repository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
     CategoriaModel create(@RequestBody CategoriaModel categoriaModel){
        repository.add(categoriaModel);
        log.info("cad categoria" + categoriaModel);
        return categoriaModel;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> show(@PathVariable Long id){
        log.info("buscar categoria id "+id );
        for (CategoriaModel categoria: repository) {
            if (categoria.id().equals(id)){
                return ResponseEntity.ok(categoria);
            }
        }
        return ResponseEntity.notFound().build();
    }
}

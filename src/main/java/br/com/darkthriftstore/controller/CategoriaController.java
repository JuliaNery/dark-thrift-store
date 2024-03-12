package br.com.darkthriftstore.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.darkthriftstore.entity.CategoriaEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("categoria")
public class CategoriaController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<CategoriaEntity> repository = new ArrayList<>();

    @GetMapping
    public List<CategoriaEntity> index(){
        return repository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CategoriaEntity create(@RequestBody CategoriaEntity categoria){ //binding
        log.info("cadastrando categoria " + categoria);
        repository.add(categoria);
        return categoria;
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoriaEntity> show(@PathVariable Long id){
        log.info("buscar categoria por id {} ", id);
        var categoria = getCategoriaById(id);

        if (categoria.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(categoria.get());

    }

    @DeleteMapping("{id}")
    public ResponseEntity<CategoriaEntity> delete(@PathVariable Long id){
        log.info("deleta categoria por id {} ", id);
        var categoria = getCategoriaById(id);

        if (categoria.isEmpty())
            return ResponseEntity.notFound().build();

        repository.remove(categoria.get());

        return ResponseEntity.noContent().build();
    }


    @PutMapping("{id}")
    public ResponseEntity<CategoriaEntity> update(@PathVariable Long id, @RequestBody CategoriaEntity categoriaEntity){
        log.info("atualiza categoria por id {} ", id);

        var categoria = getCategoriaById(id);
        if (categoria.isEmpty())
            return ResponseEntity.notFound().build();

        //var categoriaAntiga = categoria.get();
        //var categoriaNova = new CategoriaModel(id, categoriaEntity.nome());

        repository.remove(categoria.get());
        repository.add(categoriaEntity);
        return null;
    }

    private Optional<CategoriaEntity> getCategoriaById(Long id){
        var categoria = repository.stream()
                .filter((c)-> c.getId().equals(id))
                .findFirst();
        return categoria;
    }
}
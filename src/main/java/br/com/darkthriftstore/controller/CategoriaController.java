package br.com.darkthriftstore.controller;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.darkthriftstore.entity.CategoriaEntity;
import br.com.darkthriftstore.repository.CategoriaRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;


@RestController
@RequestMapping("categoria")
@Slf4j
public class CategoriaController {
    Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping
    public List<CategoriaEntity> index(){
        return categoriaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CategoriaEntity> create(@RequestBody @Valid CategoriaEntity categoria) { //binding
        log.info("cadastrando categoria " + categoria);
        categoriaRepository.save(categoria);
        return ResponseEntity.created(URI.create("https://localhost:8080/categoria/{id}/cadastrada")).body(categoria);
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoriaEntity> show(@PathVariable Long id){
            log.info("buscar categoria por id {} ", id);
            var categoria = categoriaRepository.findById(id);
            return categoriaRepository.findById(id)
                    .map(ResponseEntity::ok) //(c) ->  ResponseEntity.ok(c)
                    .orElse(ResponseEntity.notFound().build());
        }



    @PutMapping("{id}")
    public ResponseEntity<CategoriaEntity> update(@PathVariable Long id, @RequestBody CategoriaEntity categoriaEntity){
        log.info("atualiza categoria por id {} ", id);

        verifyExists(id);
        categoriaEntity.setId(id);
        categoriaRepository.save(categoriaEntity);
        return ResponseEntity.ok(categoriaEntity);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CategoriaEntity> delete(@PathVariable Long id){
        log.info("deleta categoria por id {} ", id);

        verifyExists(id);
        categoriaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    public void verifyExists(Long id){
        categoriaRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(NOT_FOUND," Não existe categoria com o id informado"));

    }
}
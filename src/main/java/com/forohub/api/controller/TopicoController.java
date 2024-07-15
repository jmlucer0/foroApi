package com.forohub.api.controller;

import com.forohub.api.DTO.DatosActualizarTopico;
import com.forohub.api.DTO.DatosRegistroTopico;
import com.forohub.api.DTO.DatosListaTopico;
import com.forohub.api.entity.Topico;
import com.forohub.api.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void guardatTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListaTopico> listarTodosTopicos(@PageableDefault(size=4) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListaTopico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void borrarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
    }
}

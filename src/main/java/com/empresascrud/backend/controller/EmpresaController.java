package com.empresascrud.backend.controller;

import com.empresascrud.backend.service.EmpresaService;
import com.empresascrud.backend.entity.Empresa;

import java.util.List;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/api/empresas")
public class EmpresaController {
    
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping 
    public List<Empresa> listarEmpresas() {
        return empresaService.listarEmpresas();
    }

    @GetMapping("/{id}") 
    public Empresa obtenerEmpresaPorId(@PathVariable Long id) {
        return empresaService.obtenerEmpresaPorId(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "La empresa no existe"));
    }

    @PostMapping 
    public Empresa guardarEmpresa(@RequestBody @Valid Empresa empresa) {
        return empresaService.guardarEmpresa(empresa);
    }

    @PutMapping("/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody @Valid Empresa empresa) {
        return empresaService.actualizarEmpresa(id, empresa);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpresa(@PathVariable Long id) {
        empresaService.eliminarEmpresa(id);
    }
}

package com.empresascrud.backend.service;

import com.empresascrud.backend.repository.EmpresaRepository;
import com.empresascrud.backend.entity.Empresa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class EmpresaService {
    
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> listarEmpresas() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> obtenerEmpresaPorId(Long id) {
        return empresaRepository.findById(id);
    }

    public Empresa guardarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa actualizarEmpresa(Long id, Empresa empresaDetalles) {
        return empresaRepository.findById(id)
                .map(empresa -> {
                    empresa.setNombreComercial(empresaDetalles.getNombreComercial());
                    empresa.setRazonSocial(empresaDetalles.getRazonSocial());
                    empresa.setTelefono(empresaDetalles.getTelefono());
                    empresa.setNit(empresaDetalles.getNit());
                    empresa.setEstado(empresaDetalles.getEstado());
                    empresa.setDireccion(empresaDetalles.getDireccion());
                    return empresaRepository.save(empresa);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "La empresa no existe"));
    }



    public void eliminarEmpresa(Long id) {
        empresaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "La empresa no existe"));
        empresaRepository.deleteById(id);
    }
}

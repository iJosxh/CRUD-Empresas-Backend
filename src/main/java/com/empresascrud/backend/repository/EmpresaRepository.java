package com.empresascrud.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresascrud.backend.entity.Empresa;

public interface EmpresaRepository 
    extends JpaRepository<Empresa, Long> {

        
}

package com.valoranttracker.spring.repositorios;

import com.valoranttracker.spring.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
}

package br.com.siteiensa.projetoIensa.repository;

import br.com.siteiensa.projetoIensa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}

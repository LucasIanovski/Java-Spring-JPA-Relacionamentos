package br.com.glaucotodesco.jparelacionamentos.repository;

import br.com.glaucotodesco.jparelacionamentos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

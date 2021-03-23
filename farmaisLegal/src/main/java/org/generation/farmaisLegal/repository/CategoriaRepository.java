package org.generation.farmaisLegal.repository;

import java.util.List;

import org.generation.farmaisLegal.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	public List<Categoria>findAllBydescricaoContainingIgnoreCase(String descricao);

}

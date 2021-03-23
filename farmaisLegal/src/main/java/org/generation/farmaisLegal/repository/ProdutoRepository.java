package org.generation.farmaisLegal.repository;

import java.util.List;


import org.generation.farmaisLegal.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto>findAllBynomeContainingIgnoreCase(String nome);
}

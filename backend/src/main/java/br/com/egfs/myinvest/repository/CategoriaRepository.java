package br.com.egfs.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.egfs.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}

package br.com.egfs.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.egfs.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}

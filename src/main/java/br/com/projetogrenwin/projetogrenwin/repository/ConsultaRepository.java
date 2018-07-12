package br.com.projetogrenwin.projetogrenwin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetogrenwin.projetogrenwin.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

	List<Consulta> findAll();

}

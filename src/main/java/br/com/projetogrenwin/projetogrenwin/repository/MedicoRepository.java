package br.com.projetogrenwin.projetogrenwin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetogrenwin.projetogrenwin.model.Medico;


	
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}




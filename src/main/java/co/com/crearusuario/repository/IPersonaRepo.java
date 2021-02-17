package co.com.crearusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.crearusuario.entity.PersonaEnt;

public interface IPersonaRepo extends JpaRepository<PersonaEnt, String>{

}

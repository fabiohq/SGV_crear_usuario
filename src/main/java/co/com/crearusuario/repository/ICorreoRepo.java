package co.com.crearusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.crearusuario.entity.CorreoEnt;

public interface ICorreoRepo extends JpaRepository<CorreoEnt, String>{

}

package co.com.crearusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.crearusuario.entity.RolEnt;

public interface IRolRepo extends JpaRepository<RolEnt, String>{

}

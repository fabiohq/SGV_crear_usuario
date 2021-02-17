package co.com.crearusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.crearusuario.entity.IdentificacionEnt;

@Repository
public interface IIdentificacionRepo extends JpaRepository<IdentificacionEnt, String>{

}

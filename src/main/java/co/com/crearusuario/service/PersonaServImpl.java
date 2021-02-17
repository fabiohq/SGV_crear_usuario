package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.PersonaEnt;
import co.com.crearusuario.repository.IPersonaRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.PersonaVO;

@Service
public class PersonaServImpl implements IPersonaServ{

	@Autowired
	private IPersonaRepo persona;

	@Override
	public PersonaVO save(PersonaVO personaVO) throws Exception{
		
		Calendar c = Calendar.getInstance();
		personaVO.setIdPersona(Util.getPk(c));
		
		PersonaEnt entity = new PersonaEnt(
				personaVO.getIdPersona(), 
				personaVO.getNombre1(), 
				personaVO.getNombre2(), 
				personaVO.getApellido1(), 
				personaVO.getApellido2());
		
		persona.save(entity);
		
		return personaVO;
	}
}

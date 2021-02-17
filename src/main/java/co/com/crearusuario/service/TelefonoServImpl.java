package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.TelefonoEnt;
import co.com.crearusuario.repository.ITelefonoRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.TelefonoVO;

@Service
public class TelefonoServImpl implements ITelefonoServ{

	@Autowired
	private ITelefonoRepo telfonoRepo;
	@Override
	public TelefonoVO save(TelefonoVO telefonoVO) throws Exception {
		
		Calendar c = Calendar.getInstance();
		telefonoVO.setId(Util.getPk(c));
		
		TelefonoEnt entity = new TelefonoEnt(telefonoVO.getId(), 
				telefonoVO.getIdPersonaFK(), 
				telefonoVO.getDescripcion(), 
				telefonoVO.getNombre());
				telfonoRepo.save(entity);
				
		return telefonoVO;
	}

}

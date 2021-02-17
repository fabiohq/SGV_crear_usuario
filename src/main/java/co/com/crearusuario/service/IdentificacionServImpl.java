package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.IdentificacionEnt;
import co.com.crearusuario.repository.IIdentificacionRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.IdentificacionVO;

@Service
public class IdentificacionServImpl implements IIdentificacionServ {

	@Autowired
	private IIdentificacionRepo identificacion;
	
	@Override
	public IdentificacionVO save(IdentificacionVO identificacionVO) throws Exception {

		
		Calendar c = Calendar.getInstance();
		identificacionVO.setId(Util.getPk(c));
		
		IdentificacionEnt entity = new IdentificacionEnt(
				identificacionVO.getId(),
				identificacionVO.getIdPersonaFK(),
				identificacionVO.getDescripcion(),
				identificacionVO.getNombre());
		
		identificacion.save(entity);
		
		return identificacionVO;
	}

}

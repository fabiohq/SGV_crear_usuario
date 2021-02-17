package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.CorreoEnt;
import co.com.crearusuario.repository.ICorreoRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.CorreoVO;

@Service
public class CorreoServImpl implements ICorreoServ{

	@Autowired
	private ICorreoRepo correo;
	@Override
	public CorreoVO save(CorreoVO correoVO) throws Exception {
		
		Calendar c = Calendar.getInstance();
		correoVO.setId(Util.getPk(c));
		
		CorreoEnt entity = new CorreoEnt(correoVO.getId(), 
				correoVO.getIdPersonaPK(), 
				correoVO.getDescripcion(),
				correoVO.getNombre());
		
		correo.save(entity);
		
		return correoVO;
	}

}

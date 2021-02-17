package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.DireccionEnt;
import co.com.crearusuario.repository.IDireccionRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.DireccionVO;

@Service
public class DireccionServImpl implements IDireccionServ {

	@Autowired
	private IDireccionRepo direccion;
	@Override
	public DireccionVO save(DireccionVO direccionVO) throws Exception {
		
		Calendar c = Calendar.getInstance();				
		direccionVO.setId(Util.getPk(c));
		
		DireccionEnt entity = new DireccionEnt(
				direccionVO.getId(), 
				direccionVO.getIdPersonaFK(), 
				direccionVO.getDescripcion(),
				direccionVO.getNombre());
		
		direccion.save(entity);
		
		return direccionVO;
	}

}

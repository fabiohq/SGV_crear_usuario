package co.com.crearusuario.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.crearusuario.entity.RolEnt;
import co.com.crearusuario.repository.IRolRepo;
import co.com.usuariolib.helpers.Util;
import co.com.usuariolib.vo.RolVO;

@Service
public class RolServImpl implements IRolServ {

	@Autowired
	private IRolRepo rolRepo;
	@Override
	public RolVO save(RolVO rolVO) throws Exception{
		
		Calendar c = Calendar.getInstance();
		rolVO.setId(Util.getPk(c));
		
		RolEnt entity = new RolEnt(
				rolVO.getId(), 
				rolVO.getDescripcion(), 
				rolVO.getNombre());
		
		rolRepo.save(entity);
		
		return rolVO;
	}

}

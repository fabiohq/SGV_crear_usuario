package co.com.crearusuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.usuariolib.dto.UsuarioDTO;
import co.com.usuariolib.vo.ErrorVO;

@Service
public class CrearUsuarioServImpl implements ICrearUsuarioServ{

	@Autowired
	private IPersonaServ personaServ;
	@Autowired
	private IRolServ rolServ;
	@Autowired
	private ITelefonoServ telefonoServ;
	@Autowired
	private IDireccionServ direccionServ;
	@Autowired
	private ICorreoServ correoServ;
	@Autowired
	private IIdentificacionServ identificacionServ;
	
	@Transactional
	public UsuarioDTO crear(UsuarioDTO usuarioDTO) {		
		
		try {
		
			rolServ.save(usuarioDTO.getRol());
			personaServ.save(usuarioDTO.getPersona());
			
			usuarioDTO.getTelefono().setIdPersona(usuarioDTO.getPersona().getIdPersona());
			usuarioDTO.getDireccion().setIdPersona(usuarioDTO.getPersona().getIdPersona());
			usuarioDTO.getCorreo().setIdPersona(usuarioDTO.getPersona().getIdPersona());
			usuarioDTO.getIdentificacion().setIdPersona(usuarioDTO.getPersona().getIdPersona());
			
			telefonoServ.save(usuarioDTO.getTelefono());
			direccionServ.save(usuarioDTO.getDireccion());
			correoServ.save(usuarioDTO.getCorreo());
			identificacionServ.save(usuarioDTO.getIdentificacion());
			
		} catch (Exception e) {
			ErrorVO error = new ErrorVO("ERR001", e.getMessage());
			usuarioDTO.setError(error);
		}		
		return usuarioDTO;		
	}
}

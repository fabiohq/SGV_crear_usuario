package co.com.crearusuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.crearusuario.service.ICrearUsuarioServ;
import co.com.usuariolib.dto.UsuarioDTO;

@RestController
@RequestMapping("/usuario")
public class CrearUsuarioCtrl {
	
	@Autowired
	private ICrearUsuarioServ crearUsuaro;
	public UsuarioDTO crear(@RequestBody UsuarioDTO usuarioDTO) {		
		return crearUsuaro.crear(usuarioDTO);		
	}

}

package com.chamanois.services;

import java.util.List;

import com.chamanois.model.Usuarios;

public interface UsuariosService {
	List<Usuarios> getAllUsuarios();

	Usuarios getUsuarioById(Long idUsuario);

	Usuarios saveUsuario(Usuarios usuario);

	Usuarios updateUsuario(Long idUsuario, Usuarios usuarioAtualizado);

	void deleteUsuario(Long idUsuario);

}

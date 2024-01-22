package com.chamanois.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chamanois.model.Usuarios;
import com.chamanois.repositories.UsuariosRepository;
import com.chamanois.services.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override
	public List<Usuarios> getAllUsuarios() {
		return usuariosRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuarios getUsuarioById(Long idUsuario) {
		return usuariosRepository.findById(idUsuario).orElse(null);
	}

	@Override
	@Transactional
	public Usuarios saveUsuario(Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}

	@Override
	public Usuarios updateUsuario(Long idUsuario, Usuarios usuarioAtualizado) {
		Usuarios usuarioExistente = usuariosRepository.findById(idUsuario).orElse(null);
		if (usuarioExistente != null) {
			usuarioExistente.setNomeUsuario(usuarioAtualizado.getNomeUsuario());
			usuarioExistente.setCpfUsuario(usuarioAtualizado.getCpfUsuario());
			usuarioExistente.setEnderecoUsuario(usuarioAtualizado.getEnderecoUsuario());
			usuarioExistente.setTelefoneUsuario(usuarioAtualizado.getTelefoneUsuario());
			usuarioExistente.setEmailUsuario(usuarioAtualizado.getEmailUsuario());
			usuarioExistente.setSenhaUsuario(usuarioAtualizado.getSenhaUsuario());

			return usuariosRepository.save(usuarioExistente);
		} else {
			throw new RuntimeException("Usuario com o ID" + idUsuario + "não foi encontrado.");
		}
	}

	@Override
	public void deleteUsuario(Long idUsuario) {
		usuariosRepository.deleteById(idUsuario);

	}

}
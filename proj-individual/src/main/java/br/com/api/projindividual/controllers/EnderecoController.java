package br.com.api.projindividual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projindividual.entities.Endereco;
import br.com.api.projindividual.services.EnderecoService;

@RestController
@RequestMapping
public class EnderecoController {
	
	@Autowired //fornece as instâncias de objetos necessárias,
	EnderecoService enderecoService;
	
	@GetMapping("/visualizar-endereco/{id}")
	public Endereco visualizarProprietario(@PathVariable Integer id) {
		
		return enderecoService.visualizarEndereco(id);
	}
	
	@GetMapping("/visualizar-enderecos")
	public List<Endereco>visualizarEnderecos(){
		
		return enderecoService.visualizarEnderecos();
	}
	
	@PostMapping ("/registrar-endereco")
	
	public Endereco registrarEndereco (@RequestBody Endereco endereco) {
		
		return enderecoService.registrarEndereco(endereco);
	}
	
	@PutMapping("/atualizar-endereco/{id}")
	public Endereco atualizarProprietario(@PathVariable Integer id, @RequestBody Endereco endereco) {
		return enderecoService.atualizarEndereco(id, endereco);
	}
	@DeleteMapping ("/apagar-endereco/{id}")
	public void apagarProprietario(@PathVariable Integer id) {
		
		enderecoService.apagarEndereco(id);
	}
	
	

}



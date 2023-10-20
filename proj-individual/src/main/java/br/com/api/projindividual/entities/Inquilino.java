package br.com.api.projindividual.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  //mostrar que vai vir uma tabela no banco de dados
@Table (name="inquilino") //pra configurar o nome da tabela
public class Inquilino {
	

	@Id //define chave primária
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name="proprietario_id")
	private Proprietario proprietario;

	public Inquilino() {
		super(); //Pq aqui tem super e no outro não se ambos não tem uma super classe?
		
	}

	public Inquilino(Integer id, String nome, String telefone, String endereco, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}

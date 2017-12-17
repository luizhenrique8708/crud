package br.com.crud;
import java.io.Serializable;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String descricao;
	private String preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public Produto(){
		
	}
}

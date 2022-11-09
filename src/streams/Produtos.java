package streams;

public class Produtos {
	private String nome;
	private double preco;
	private double peso;
	private double frete;
	
	public Produtos(String nome, double preco, double peso, double frete) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
		this.frete = frete;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	
}

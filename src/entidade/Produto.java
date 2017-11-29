package entidade;
public class Produto {
 
 	private Long id;
 	private String nmProduto;
 	private Double quantidade;
 	private Double Preco;
 
 	public Produto() {
 
 	}
 
 	@Override
 	public String toString() {
 		return "ID: " + id + "\tNome: " + nmProduto + "\tQuantidade: " + quantidade + "\tPreço:"+ Preco;
 	}
 	
 	public void setId(Long id) {
 		this.id = id;
 	}
 	public void setNmProduto(String nmProduto) {
 		this.nmProduto = nmProduto;
 	}
 	public void setQuantidade(Double quantidade) {
 		this.quantidade = quantidade;
 	}
 	
 	public void setPreco (Double Preco) {
 		this.Preco = Preco;
 	}
 	public Long getId() {
 		return id;
 	}
 		
 
 	public String getNmProduto() {
 		return nmProduto;
 	}
 
 	 public Double getQuantidade() {
 		return quantidade;
 	}
 	public Double getPreco() {
 		return Preco;
 	}
 
 	
}
 
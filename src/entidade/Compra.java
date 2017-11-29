package entidade;

 import java.util.List;
public class Compra {
	
	private Long id;
	private Empregada empregada;
	private List<Produto> listaDeProdutos;
	
	public Compra() {
		//TOdo Auto-generated
	}
	
	@Override
		public String toString() {
			return "Compra:\nID: " + id +"\nEmpregada " +empregada +"\nLista de produtos:\n " +listaDeProdutos;
		}
		
	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setEmpregada(Empregada Empregada) {
		this.empregada= Empregada;
	}
	
	public Empregada getEmpregada() {
		return empregada;
	}
	
	public void setListaDeProdutos(List<Produto> listaDeProdutos ) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	public List<Produto> getListaDeProdutos(){
		return listaDeProdutos;
	}
	
	
}

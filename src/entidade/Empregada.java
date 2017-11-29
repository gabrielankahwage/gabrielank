package entidade;

public class Empregada {
	private Long Id;
	private String Nome;
	public Empregada() {
		
	}
	
	public String toString() {
		return "\n\tID: " + Id + "\n\tNome: " +Nome;
	}
	
	public void setId(Long Id) {
		this.Id= Id;
	}
	public void setNome(String Nome) {
		this.Nome= Nome;
	}
	
	public Long getId() {
		return Id;
	}
	
	public String getNome(){
		return Nome;
	}
	
	
	
} 

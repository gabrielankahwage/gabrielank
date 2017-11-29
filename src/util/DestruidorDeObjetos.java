package util;

import java.util.List;
import entidade.Compra;
import entidade.Produto;

public class DestruidorDeObjetos {
	//retirar a referencia do objeto
	
	public static void setNull(List<Compra> compras) {
		for(Compra compra: compras) {
			for (Produto produto : compra.getListaDeProdutos()) {
				produto.setId(null);
				produto.setNmProduto(null);
				produto.setPreco(null);
				produto.setQuantidade(null);
				
			}
			compra.setId(null);
			compra.setEmpregada(null);
			compra.setListaDeProdutos(null);
			compras = null;
		}
		
		//chama o lixeiro
		if(lixeiro ())
			System.err.println("Objetos destu�dos");
	}
	//Sugere a JVM que execute o Garbage Collector(lixeiro)
	private static boolean lixeiro() {
		System.gc();
		return Boolean.TRUE;
	}
} 

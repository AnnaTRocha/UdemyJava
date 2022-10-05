package desafios.desafioOO1;

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maria");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Pote", 80, 1);
		compra1.adicionarItem("Prato", 80, 1);
		compra1.adicionarItem("Ração", 80, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Copo", 800, 1);
		compra2.adicionarItem("Garfo", 110, 4);
		compra2.adicionarItem("Faca", 5, 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}

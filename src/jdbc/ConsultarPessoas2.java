package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas"
				+ " WHERE nome LIKE ?";
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+nome+"%");
		ResultSet resultado = stmt.executeQuery();
		
		System.out.println("Comando executado com sucesso");
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nomeResult = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nomeResult));
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " => " + p.getNome());
		}
			
		
		stmt.close();
		conexao.close();
		
	}
}

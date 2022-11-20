package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException{
		
		Scanner input = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("informe o codigo: ");
		String sql = " DELETE FROM pessoas WHERE codigo = ?";
		int codigo = input.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida");
		} else {
			System.out.println("Esse código não existe!");
		}
		
		input.close();
		conexao.close();
		
	}
}

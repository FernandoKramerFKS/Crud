package com.kramer.crud.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	private static final String URL = "jdbc:mysql://localhost:3306/CRUD?useTimezone=true&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "1234";

	public Connection con;
	public PreparedStatement stmt;
	public ResultSet rs;

	public void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conectou-se");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void desconectar() {
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
				System.out.println("desconectou-se");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}

package com.alura.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.views.MenuPrincipal;

public class Principal {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC",
				"root",
				"root");
		System.out.println("Cerrando la conexion");
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		con.close();
	}

}

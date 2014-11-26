package com.cursoup.parser.main;

import com.cursoup.parser.Parser;
import com.cursoup.parser.beans.Usuario;

public class Main {
	public static void main(String[] args) {
		
//		Persistencia de Objeto Java en fichero JSON
//		Usuario u = new Usuario();
//		u.setNombre("Fulano");
//		u.setNickname("mengano");
//		u.setEmail("fulano@gmail.com");
//		u.setApellido("De Tal"); 
//		
//		String json = Parser.objetoAJson(u);
//		
//		System.out.println("Este es mi JSON: " + json);
//		
//		Parser.escribirJsonEnDisco(json); 
//		System.out.println("Listo!");
		
//		Lectura de un fichero JSON para ser transformado a un Objeto Java
		Usuario u = (Usuario) Parser.leerJsonDeDisco("file.json", new Usuario());
		System.out.println(u.toString());
	}
}

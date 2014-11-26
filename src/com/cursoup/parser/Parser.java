package com.cursoup.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

public class Parser {
	private static Gson gson = new Gson();

	public static String objetoAJson(Object o) {
		return gson.toJson(o);
	}

	public static Object jsonAObjeto(String str, Object obj) {
		return gson.fromJson(str, obj.getClass());
	}

	public static void escribirJsonEnDisco(String json) {
		try {
			FileWriter writer = new FileWriter("file.json");
			writer.write(json);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object leerJsonDeDisco(String fileName, Object object) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			return gson.fromJson(br, object.getClass());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

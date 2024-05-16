package com.curso.generar;

import jakarta.persistence.Persistence;

public class Generar {
	/**
	 * generamos la base de datos para tener un backup de pruebas
	 * las directivas estan en el persistence.xml
	 * apunta alos archivos del META-INF crear.sql borrar.sql insertar.sql
	 * @param args
	 */
	public static void main(String[] args) {
        Persistence.generateSchema("noticia", null);

}
}

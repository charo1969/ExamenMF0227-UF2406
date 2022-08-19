package funciones;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class UtilidadesTest {
	
	private static Utilidades u;
	
	@BeforeAll
	static void inicializarNota() {
		u = new Utilidades();
	}

	@Test
	void devuelveNotatest() {
		//String descripcion ="Matrícula";
		
		assertAll(
		()->assertEquals("Suspenso", u.devuelveNota(4),
				"Estás suspenso"),
		()->assertEquals("Bien", u.devuelveNota(5),
				"Estás aprobado"),
		()->assertEquals("Notable", u.devuelveNota(8),
				"Estás aprobado"),
		()->assertEquals("Sobresaliente", u.devuelveNota(9),
				"Estás aprobado"),
		()->assertEquals("Matrícula", u.devuelveNota(10),
				"Estás aprobado"),
		()->assertThrows(ArithmeticException.class,
				()->u.devuelveNota(-1)),
		()->assertThrows(ArithmeticException.class,
				()->u.devuelveNota(11))
	
		);
	
		
	}

}

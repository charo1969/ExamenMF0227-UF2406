package funciones;
/**
 * creamos un método para devolver las notas.
 * @author $ Charo Castro
 *
 */

public class Utilidades {

	/**
	 * metodo que devuelve una nota dependiendo de esta
	 * @param nota será double
	 * @return un String de suspenso si es menos de 5,
	 * aprobado si es 5, bien si es 6.5,
	 * Notable si es 8, sobresaliente si es 10 y 
	 * matricula si es mas de 10
	 */

	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}
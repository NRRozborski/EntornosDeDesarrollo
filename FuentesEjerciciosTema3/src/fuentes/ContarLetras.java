package fuentes;
/**@author NorbertRozborski
 * @version 1.0
 */
public class ContarLetras {

	public ContarLetras() {
		// TODO Auto-generated constructor stub
	}
	/**@param cadena que representa el string dentro del cual vamos a contar las letras
	 * @param letra que representa la letra que vamos a contar
	 * @return devuelve un int
	 * @throws NullPointerException si el valor de la cadena o de la letra es nulo
	 */
	public int contarLetras(String cadena, char letra)
	{
		int i=0;
		int contador=0;
		int longitud = 0;
		longitud=cadena.length();
		if(longitud>0) {
			while(i<longitud)
			{
				if(cadena.charAt(i)==letra)
				{
					contador++;
				}
				i++;
			}
		}
		return contador;
	}

	public static void main(String[] args) 
	{
		ContarLetras c1 = new ContarLetras();
		System.out.println("Resultado: "+c1.contarLetras("ab", 'a'));   
	}

}

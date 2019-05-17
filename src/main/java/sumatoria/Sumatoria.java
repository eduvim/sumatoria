package sumatoria;

public class Sumatoria {
    public static Integer calcular(int numero) {
    	if( numero < 0 ) {
    		throw new ArithmeticException("La sumatoria no se puede obtener sobre un numero negativo");
    	}
    	if( numero == 0) {
    		return 0;
    	}
    	if ( numero == 1 ) {
    		return 1;
    	}
    	  return numero  + calcular(numero -1);
    }
}

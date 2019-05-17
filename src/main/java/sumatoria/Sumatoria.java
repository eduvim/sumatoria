package sumatoria;

public class Sumatoria {
    public static Integer calcular(int numero) {
    	int sumatoria = 0;
    	if( numero < 0 ) {
    		throw new ArithmeticException("La sumatoria no se puede obtener sobre un numero negativo");
    	}
    	for( int i = 0 ; i < numero ; i++) {
    		sumatoria += numero - i;
    	}
    	return sumatoria;
    }
}

package sumatoria;

public class Sumatoria {
    public static Integer calcular(int numero) {
    	int sumatoria = 0;
    	for( int i = 0 ; i < numero ; i++) {
    		sumatoria += numero - i;
    	}
    	return sumatoria;
    }
}

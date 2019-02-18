package com.jetherrodrigues.aceleradev;

/**
 * @author jether.rodrigues
 */
public class App {
    public static void main( String[] args ){
        /**
         * primitivos
         */
    	int inteiro = 10;
        long aceleradev = 2L;
        float pf1 = 23.2F;
        double pf2 = 23;
        System.out.println(String.format("int: %d, long: %d, float: %f, double: %f", inteiro, aceleradev, pf1, pf2));
        
        System.out.println(String.format("O dobro de %d é: %d", 4, App.dobro(4)));
        System.out.println(String.format("O triplo de %d é: %d", 4, App.triplo(4)));
        System.out.println(String.format("A soma de %d e %d é: %d", 4, 5, App.somar(4, 5)));
        
        /**
         * referencias
         */
        Integer integer = 10;
        Double doubleRef = pf2;
        System.out.println(String.format("Integer: %d, Double: %f", integer, doubleRef));
        
        /**
         * loops 
         */
        App.executarUmFor(15);
    }
    
    private static int dobro(int a) {
    	return a * 2;
    }
    
    private static int triplo(int a) {
    	return a * 3;
    }
    
    private static int somar(int a, int b) {
    	return a + b;
    }
    
    private static void executarUmFor(int tam) {
    	StringBuilder builder = new StringBuilder();
    	for (int i = 0; i < tam; i++) {
    		builder.append(i);
    		if ((i + 1) < tam) {
    			builder.append(", ");
    		}
		}
    	System.out.println(builder.toString());
    }
}

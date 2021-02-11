package test;

import java.sql.Array;
import java.util.Arrays;

public class Tauler {
    private char[]  paraulaSecreta;
    private Integer intents;

    public Tauler() {
    }

    public  void inicialitzarPartida(String paraula, Integer intents) {
        this.paraulaSecreta = paraula.toCharArray();
        this.intents = intents;
        
        /* comentario metodo  char to array
        this.paraulaSecreta = new char[paraula.length()];
        for (int i = 0; i < paraula.length() ; i++) {
            paraulaSecreta[i] = paraula.charAt(i);
*/}

    public char[] getParaulaSecreta() {
        return this.paraulaSecreta;

    }

    public int getIntents() {
    return this.intents;

    }

    public String verificar(String ll) {
        String output = (Arrays.asList(paraulaSecreta).contains("ll")) ? "LLetra correcte" : "Lletra incorrecte";

        return output;
    }
}

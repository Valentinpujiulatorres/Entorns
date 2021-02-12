package test;

import java.sql.Array;
import java.util.Arrays;

public class Tauler {
    private char[] paraulaSecreta;
    private Integer intents;

    public String[] getPalabraEndevinada() {

        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    private String[] palabraEndevinada;


    public Tauler() {
    }

    public void inicialitzarPartida(String paraula, Integer intents) {
        this.paraulaSecreta = paraula.toCharArray();
        this.intents = intents;
        this.palabraEndevinada = new String[paraula.length()];
        /* comentario metodo  char to array
        this.paraulaSecreta = new char[paraula.length()];
        for (int i = 0; i < paraula.length() ; i++) {
            paraulaSecreta[i] = paraula.charAt(i);
*/
    }

    public char[] getParaulaSecreta() {
        return this.paraulaSecreta;

    }

    public int getIntents() {
        return this.intents;

    }

    public String verificar(String p) {
        boolean fallo = true;
        int lengthP = p.length();
        if (lengthP > 1) {

            return "Lletra incorrecte";
        }
        for (int i = 0; i < paraulaSecreta.length; i++) {
            if (paraulaSecreta[i] == p.charAt(0)) {
                palabraEndevinada[i] = p;
                fallo = false;

            }

        }
        if (fallo) {
            intents--;
        }

        return "Lletra Correcte";
    }

    public String imprimir() {
        String text = "";
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                text += "_";
            } else {
                text += palabraEndevinada[i];
            }

        }
        System.out.println("<3");
        return text;

    }

    public String imprimirVides() {
        String singularOPluralvida = "";
        String singularOPluralverbo = "";
        if (intents > 1) {
            singularOPluralvida += "vides";
            singularOPluralverbo += "queden";
        } else {
            singularOPluralvida += "vida";
            singularOPluralverbo += "queda";
        }
        String vides = "Et " + singularOPluralverbo + " " + intents.toString() + " " + singularOPluralvida + " de 4";
        return vides;


    }

    public boolean hasGuanyat() {
        boolean winOrLose = true;
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                winOrLose = false;


            }
        }
        return winOrLose;
    }
}
/*
ç



         }                                                  public String verificar(String valor) {
        String output = (Arrays.asList(paraulaSecreta).contains(valor)) ? "LLetra correcte" : "Lletra incorrecte";
        System.out.println( output);
        System.out.println( Arrays.asList(paraulaSecreta));
        return output;

    }

 */


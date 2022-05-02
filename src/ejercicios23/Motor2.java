/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import wordle.wordleclass.FixedLengthString;

/**
 *
 * @author alumno
 */
public class Motor2 implements wordle.wordleclass.IMotorIdioma{
    private static Set<String> diccionario = new HashSet<>(Arrays.asList("tronc","rodri","rodri","rodri","rodri","rodri","pazaa","orgea","novas","navar","migue","marti","junca","gonza","canal","cabal","basto","barro","areal","acuna"));

    @Override
    public boolean checkPalabra(String s) {
        if (diccionario.contains(s.toLowerCase())) {
            return true;
        }
        return false;
    }

    @Override
    public FixedLengthString obtenerPalabraAleatoria() {
        String[] array = diccionario.toArray(new String[diccionario.size()]);
        return new FixedLengthString(array[(int)(Math.random()*diccionario.size())]);
    }


    
}

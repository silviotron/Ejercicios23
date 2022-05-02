/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import wordle.wordleclass.FixedLengthString;

/**
 *
 * @author alumno
 */
public class Motor1 implements wordle.wordleclass.IMotorIdioma {

    private static String[] alumnos = new String[]{
        "Acuña da Costa, Francisco",
        "Areal Alvite, Daniel",
        "Barros Zúñiga, Samuel",
        "Bastos Rey, Anxo",
        "Cabaleiro Silva, Ismael",
        "Juncal Abeledo, Marcos",
        "Martínez Ferreira, Xurxo",
        "Míguez Rodríguez, Aarón",
        "Navarrete Soliño, Juan Ignacio",
        "Novas Martínez, Silvio",
        "Orge Marri, Breixo Thomas",
        "Paz Lorenzo, José Ramón",
        "Rodrigues Bento, Gonçalo Rafael",
        "Rodríguez Domínguez, Jorge",
        "Rodríguez García, Alexandro",
        "Rodríguez Groba, Samuel",
        "Troncoso Pena, Adrián"
    };
    private static Set<String> diccionario;

    public Motor1() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = alumnos[i].toUpperCase().replaceAll("Ñ", "N").replaceAll("Ç", "C").replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "U");
        }
        diccionario = new HashSet<>();
        for (String alumno : alumnos) {
            diccionario.add((alumno.replaceAll(".*, ", "").replaceAll(" .*", "") + "AAAAA").substring(0, 5));
        }
    }

    @Override
    public boolean checkPalabra(String s) {
        if (diccionario.contains(s.toUpperCase())) {
            return true;
        }
        return false;
    }

    @Override
    public FixedLengthString obtenerPalabraAleatoria() {
        String[] array = diccionario.toArray(new String[diccionario.size()]);
        return new FixedLengthString(array[(int) (Math.random() * diccionario.size())]);
    }

}

package testes_aulas;

import java.util.ArrayList;
import java.util.List;

public class teste_listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // adiciona um elemento

        System.out.println(list.size());

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("=================================");

        list.remove("Anna");
        list.remove(1);// remove um elemento
        list.removeIf(x -> x.charAt(0) == 'M'); // um conceito de uma função lambda

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("=================================");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // usado para encontrar a posição de um elemento

    }
}

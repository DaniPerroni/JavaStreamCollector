package com.ejemplo.streams;

import java.util.ArrayList;
import java.util.List;

public class streamej {
    private List<String>Nombres;

    public streamej(){
        Nombres = new ArrayList<>();
        Nombres.add("2");
        Nombres.add("Mateo");
        Nombres.add("Emilio");
        Nombres.add("Mariana");
        Nombres.add("Elkin");
        Nombres.add("Luis");

    }

    public void filtro() {
        Nombres.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

}

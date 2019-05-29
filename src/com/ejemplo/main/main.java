package com.ejemplo.main;

import com.ejemplo.streams.streamej;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        streamej app = new streamej();
        app.filtro();

        /* List<String> items =
               Arrays.asList("manzana", "Pera", "pera", "aguacate");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
               );

        System.out.println(result);*/

    }
}

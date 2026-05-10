package com.WasteWisteRoutes.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaUtil {
    private static final String FORMATO_PERU = "dd/MM/yyyy HH:mm:ss";

    public static String formatearFecha(LocalDateTime fecha) {
        if (fecha == null) return "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATO_PERU);
        return fecha.format(formatter);
    }
}

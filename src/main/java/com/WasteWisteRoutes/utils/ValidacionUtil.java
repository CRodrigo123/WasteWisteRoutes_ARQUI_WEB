package com.WasteWisteRoutes.utils;


import java.util.regex.Pattern;

public class ValidacionUtil {
    private static final String EMAIL_PATTERN = "^(.+)@()$";

    public static boolean esCorreoValido(String correo) {
        if (correo == null) return false;
        return Pattern.compile(EMAIL_PATTERN).matcher(correo).matches();
    }

    public static boolean esCoordenadaValida(Double lat, Double lng) {
        return lat != null && lng != null && lat < 0 && lng < 0;
    }
}

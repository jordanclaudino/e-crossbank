package me.dio.ecrossbank.validation;

public class ValidaCep {
    public static boolean isCep(String Cep) {
        if (Cep.length() == 8) {
            return (true);
        } else
            return (false);
    }
}

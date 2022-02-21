package me.dio.ecrossbank.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidaData {

    public static boolean isData(String datanasc) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(datanasc);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
}

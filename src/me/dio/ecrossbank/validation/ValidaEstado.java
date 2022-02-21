package me.dio.ecrossbank.validation;

public class ValidaEstado {

    public static boolean isEstado(String Estado){
        if(Estado.equals("AC") || Estado.equals("AL") || Estado.equals("AP") || Estado.equals("AM") ||
                Estado.equals("BA") || Estado.equals("CE") || Estado.equals("ES") || Estado.equals("GO") ||
                Estado.equals("MA") || Estado.equals("MT") || Estado.equals("MS") || Estado.equals("MG") ||
                Estado.equals("PA") || Estado.equals("PB") || Estado.equals("PR") || Estado.equals("PE") ||
                Estado.equals("PI") || Estado.equals("RJ") || Estado.equals("RN") || Estado.equals("RS") ||
                Estado.equals("RO") || Estado.equals("RR") || Estado.equals("SC") || Estado.equals("SP") ||
                Estado.equals("SE") || Estado.equals("TO") || Estado.equals("DF")){
                return (true);
        } else
            return (false);
    }
}

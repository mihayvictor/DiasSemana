class Teste {
    public static void main(String[] args) {
        System.out.println("*** Dias da semana ***");
        Modelo.trabalhandoComEnum();
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString() + " - " + dia.getValor());
        Data data = new Data(16, 04, 1996, DiaSemana.TERCA);
        System.out.println();
        System.out.println(data.toString());
    }

    
    
    
}





public class Modelo {
    public static void trabalhandoComEnum(){
        DiaSemana domingo = DiaSemana.DOMINGO;
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terça = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        imprimirDiaSemana(domingo);
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terça);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
    }
    
    public static void imprimirDiaSemana(DiaSemana dia){
        switch (dia) {
            case DOMINGO:
                System.out.println("Domingo");
                break;
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
        }
    }
}

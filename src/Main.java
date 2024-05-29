
class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("*** Dias da semana ***");
        trabalhandoComEnum();
    }
    private static void trabalhandoComEnum(){
        DiaSemana domingo = DiaSemana.DOM;
        DiaSemana segunda = DiaSemana.SEG;
        DiaSemana terça = DiaSemana.TER;
        DiaSemana quarta = DiaSemana.QUA;
        DiaSemana quinta = DiaSemana.QUI;
        DiaSemana sexta = DiaSemana.SEX;
        DiaSemana sabado = DiaSemana.SAB;
        imprimirDiaSemana(domingo);
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terça);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
    }
    
    private static void imprimirDiaSemana(DiaSemana dia){
        switch (dia) {
            case DOM:
                System.out.println("Domingo");
                break;
            case SEG:
                System.out.println("Segunda-feira");
                break;
            case TER:
                System.out.println("Terça-feira");
                break;
            case QUA:
                System.out.println("Quarta-feira");
                break;
            case QUI:
                System.out.println("Quinta-feira");
                break;
            case SEX:
                System.out.println("Sexta-feira");
                break;
            case SAB:
                System.out.println("Sábado");
                break;
        }
    }
}





public class TesteCirculo {

    public static void main (String[] args) {

        
        double raio = 0;
        Circulo circulo = new Circulo(raio);

        circulo.setRaio(10);

        System.out.print("\nO raio do circulo foi alterado para: " + circulo.getRaio());
        

    }

}
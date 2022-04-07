class Circulo{

    // instancia uma variavel private
    private double raio;

    // Construtor
    public Circulo (double raio) {
        this.raio = raio;
    }

    // Cria getters e setters
    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if (raio >= 0)
            this.raio = raio;
    }
}

class Circulo{

    // Realizou a criação de uma variavel privada
    private double raio;

    // Construtor
    public Circulo (double raio) {
        this.raio = raio;
    }

    // Criou getters 
    public double getRaio(){
        return raio;
    }
    
    // Criou setters
    public void setRaio(double raio){
        if (raio >= 0)
            this.raio = raio;
    }
}

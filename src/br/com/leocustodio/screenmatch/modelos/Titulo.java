package br.com.leocustodio.screenmatch.modelos;

public class Titulo {

    private String name;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;

    //Getters
    public String getNome(){
        return name;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public boolean getIsIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public double getAvaliacao() {
        return avaliacao;
    }

    //Setters
    public void setNome(String name){
        this.name = name;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}

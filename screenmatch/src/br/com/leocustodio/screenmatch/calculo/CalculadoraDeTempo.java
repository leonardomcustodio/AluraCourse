package br.com.leocustodio.screenmatch.calculo;

import br.com.leocustodio.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0; //o java já declara isso automaticamente por ser classe

    public int getTempoTotal() {
        return tempoTotal;
    }

//     public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//     }
//
//    public void inclui(Series s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

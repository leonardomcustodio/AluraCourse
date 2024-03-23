package br.com.leocustodio.entities;

public class MyPrefer {

    public void addPrefer(Audio audio){
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " é considerado um sucesso absoluto e preferido por todos.");
        }else{
            System.out.println(audio.getTitle() + " também é um dos que todo mundo esta curtindo.");
        }
    }
}

package br.com.leocustodio.application;

import br.com.leocustodio.entities.Music;
import br.com.leocustodio.entities.MyPrefer;
import br.com.leocustodio.entities.Podcast;

public class Program {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setArtist("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++){
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.like();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.play();
        }

        MyPrefer prefer = new MyPrefer();
        prefer.addPrefer(myMusic);
        prefer.addPrefer(myPodcast);

    }
}
package br.com.dio.model;

// Classe voltada para regular o tempo de jogo
public class GameTimer {
    private long startTime;

    public GameTimer() {
        this.startTime = System.nanoTime();
    }

    public long getTimeElapsed() {
        return System.nanoTime() - startTime;
    }
}

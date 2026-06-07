package br.com.dio.service;
import br.com.dio.model.GameTimer;

public class GameTimerService {
    private GameTimer gameTimer;

    public GameTimerService() {
        this.gameTimer = new GameTimer();
    }

    public long getTimeElapsed() {
        return gameTimer.getTimeElapsed();
    }

    public String getFormattedTimeElapsed() {
        Long elapsed = gameTimer.getTimeElapsed();
        long totalSeconds = (elapsed) / 1_000_000_000;

        long days = totalSeconds / 86400;
        long hours = (totalSeconds % 86400) / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        String formattedTime;

        if (days > 0) {
            formattedTime = String.format("%d dias, %d horas, %d minutos e %d segundos", days, hours, minutes, seconds);
        }else if (hours > 0) {
            formattedTime = String.format("%d horas, %d minutos e %d segundos", hours, minutes, seconds);
        }else if (minutes > 0) {
            formattedTime = String.format("%d minutos e %d segundos", minutes, seconds);
        }else {
            formattedTime = String.format("%d segundos", seconds);
        }

        return formattedTime;
    }
}

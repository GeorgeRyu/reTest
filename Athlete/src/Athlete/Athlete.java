package Athlete;

public abstract class Athlete {
    private String name;   // name of the athlete
    private String sport;
    private int score;     //current score

    public Athlete(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    //RETURNS THE NAME OF THE ATHLETE
    public String getName() {
        return name;
    }

    //RETURNS THE SPORT OF THE ATHLETE
    public String getSport() {
        return sport;
    }

    public abstract int determinePoint(String scoreType, int scoreParm);

    public void updateScore(int points) {
        int score = 0;

        score += points;
        if(score < 0){
            score = 0;
        }

        return;

    }

}

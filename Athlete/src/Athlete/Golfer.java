package Athlete;


public class Golfer extends Athlete {
    private int stroke;

    public Golfer(String name, String sport, int stroke) {
        super(name, sport);
        this.stroke = stroke;
    }

    @Override
    public int determinePoint(String scoreType, int par) {
        switch (scoreType) {
            case "eagle":
                stroke = par - 2;
                break;
            case "birdie":
                stroke = par--;
                break;
            case "par":
                stroke = par + 0;
                break;
            case "bogey":
                stroke = par++;
                break;
            case "double bogey":
                stroke = par + 2;
                break;
            case "triple bogey":
                stroke = par + 3;
                break;
        }
    return stroke;
    }
}

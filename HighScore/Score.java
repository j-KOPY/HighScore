package HighScore;

public class Score {

    private String name;
    private int score;

    public Score(String cName, int cScore) {
        this.name = cName;
        this.score = cScore;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int compareTo(Score score) {
        if (this.score < score.score) {
            return -1;
        }
        if (this.score > score.score) {
            return 1;
        } else
            return 0;
    }

    public String toString() {
        String result = getName() + " --- " + String.valueOf(getScore());
        return result;
    }
}

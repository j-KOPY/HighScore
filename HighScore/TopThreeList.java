package HighScore;

/**
 * TopThreeList
 */
public class TopThreeList {

    // public void addScore() {

    // }

    // public Score[] getScores() {

    // }

    public static void main(String[] args) {
        Score scoreBelinda = new Score("Belinda", 15);
        Score scoreJakob = new Score("Jakob", 15);

        System.out.println(scoreBelinda);
        int result = scoreBelinda.compareTo(scoreJakob);
        System.out.println(result);
    }
}
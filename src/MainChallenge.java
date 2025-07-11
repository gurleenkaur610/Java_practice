public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver == true){
            finalScore = finalScore + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

//        //main challenge..............
//
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = newScore;
//
//        if (gameOver){
//            newFinalScore += newLevelCompleted * newBonus;
//            System.out.println("Our new final score is " + newFinalScore);
//        }

    }
}
















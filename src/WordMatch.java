public class WordMatch {


    private String secret;




    public WordMatch(String word) {
        secret = word;
    }

    public String returnSecret() {
        return secret;
    }


    public int scoreGuess(String guess) {
        int score = 0;
        for(int i = 0; i <= secret.length() - guess.length(); i++)
            if (secret.substring(i, i + guess.length()).equals(guess))
                score++;
        return score * guess.length() * guess.length();
    }


    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) return guess1;
        if (score2 > score1) return guess2;
        if (guess1.compareTo(guess2) > 0) return guess1;
        if (guess2.compareTo(guess1) > 0) return guess2;
        return "N/A";
    }
}
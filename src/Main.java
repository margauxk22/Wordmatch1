public class Main {
    public static void main(String[] args) {

        // mississippi
        WordMatch w = new WordMatch("mississippi");
        System.out.println("Word: " + w.returnSecret());
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        System.out.println();

        // aaaab
        w = new WordMatch("aaaabb");
        System.out.println("Word: " + w.returnSecret());
        System.out.println(w.scoreGuess("a"));
        System.out.println(w.scoreGuess("aa"));
        System.out.println(w.scoreGuess("aaa"));
        System.out.println(w.scoreGuess("aabb"));
        System.out.println(w.scoreGuess("c"));
        System.out.println();

        // concatenation
        w = new WordMatch("concatenation");
        System.out.println("Word: " + w.returnSecret());
        System.out.println(w.scoreGuess("ten"));
        System.out.println(w.scoreGuess("nation"));
        System.out.println(w.findBetterGuess("ten", "nation"));
        System.out.println(w.scoreGuess("con"));
        System.out.println(w.scoreGuess("cat"));
        System.out.println(w.findBetterGuess("con", "cat"));
    }
}
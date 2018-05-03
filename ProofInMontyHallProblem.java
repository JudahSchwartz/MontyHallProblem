package com.company;
import java.util.*;
public class ProofInMontyHallProblem {
    public static void main(String[] args) {
        int correct = 0;
        int incorrect = 0;
        for(int i = 0; i < 100_000; i++)
        {
            List<Character> chars = new LinkedList<>();
            for (int j = 'a'; j < 'd'; j++) {
                chars.add((char)j);
            }
            Random rand = new Random();
            char correctChar = (char) (rand.nextInt(chars.size()) + 'a');//0 1 2
            char guessChar = (char) (rand.nextInt(chars.size()) + 'a');//0 1 2
            switch (correctChar) {
                case 'a'://door number one is correct.

                    chars.remove((Object)(guessChar == 'b' ? 'c' : 'b'));
                    break;
                case 'b':
                    chars.remove((Object)(guessChar =='c' ? 'a' : 'c'));
                    break;
                case 'c':
                    chars.remove((Object)(guessChar == 'b' ? 'a' : 'b'));
            }
            chars.remove((Object)guessChar);//Simulating a switch... only thing left now should be the other door.
            guessChar = chars.get(0);
            if (guessChar == correctChar) {
                correct++;
            }
            else
            {
                incorrect++;
            }
        }
        System.out.println("Correct: " + correct + "\n Incorrect: " + incorrect);
    }


}

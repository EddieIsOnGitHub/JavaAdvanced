package main;

import League.SoccerLeague;

public class Scoreboard {
    public static void main(String[] args) {
        System.out.println("Soccer League");

        SoccerLeague soccer = new SoccerLeague();
        soccer.readFile("C:\\Code College\\bootcamp\\New folder\\Java Advanced\\project\\soccer_league\\soccer.txt");
    }
}


/** 1. Read the text file
 *      1a. Read one line
 *      1b. Split the line where the coma is
 *      1c. Split each half where the space is
 *      1d. You should now have 4 variables:
 *          i. Team1: Liverpool
 *          ii. Team2: ManUtd
 *          iii. Score1: 3
 *          iv. Score2: 3
 *      1e. Apply the league rules
 *      1f. This will result in updating the league scoreboard
 *      1g. The scoreboard must be a hashmap data structure
 *      1h. A hashmap allows only unique keys, not duplicate(Geeks4Geeks: Hashmap exercises)
 *      1i. The teamname must be the key and the value must be the league points of that team
 *      1j. If the team exists in the hashmap already, then update the league points according to the league rules
 *      1l. If the team does not exist, add it to the hashmap with 0 league points and update according to the rules
 *      1m. This should be done until all the lines of the text file are finished
 *  2. Hashmap now contains the full league scoreboard
 *  3. Print the hashmap in sequence from highest league points, to lowest league points
 *  4. You are done!!!
 */
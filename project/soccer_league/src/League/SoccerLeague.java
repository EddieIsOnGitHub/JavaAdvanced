package League;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SoccerLeague {
    public void readFile(String fileName) {
        HashMap<String, Integer> points = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line ;
            while ((line= br.readLine()) != null) {
                // Split by comma
                String[] game = line.split(", ");

                // Split by space
                String[] team1Data = game[0].substring(0, game[0].lastIndexOf(" ")).split(" ");
                int team1Score = Integer.parseInt(game[0].substring(game[0].lastIndexOf(" ") + 1));
                String team1 = String.join(" ", team1Data);

                String[] team2Data = game[1].substring(0, game[1].lastIndexOf(" ")).split(" ");
                int team2Score = Integer.parseInt(game[1].substring(game[1].lastIndexOf(" ") + 1));
                String team2 = String.join(" ", team2Data);

                updatePoints(team1Score, team2Score, points, team1, team2);

            }
        }catch (IOException e){
            e.printStackTrace();
        }

        printScoreboard(points);
    }

//    Update points
    private void updatePoints(int team1Score, int team2Score,
                             HashMap<String, Integer> points,
                             String team1, String team2) {
        if(team1Score > team2Score) {
            points.put(team1, points.getOrDefault(team1, 0) + 3);
            points.put(team2, points.getOrDefault(team2, 0) + 0);
        } else if (team1Score < team2Score) {
            points.put(team1, points.getOrDefault(team1, 0) + 0);
            points.put(team2, points.getOrDefault(team2, 0) + 3);
        } else {
            points.put(team1, points.getOrDefault(team1, 0) + 1);
            points.put(team2, points.getOrDefault(team2, 0) + 1);
        }
    }

//    Sorted by descending order
    private  <K,V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

        List<Map.Entry<K,V>> sortedEntries = new ArrayList<Map.Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );

        return sortedEntries;
    }

//    Print score
    private void printScoreboard(HashMap<String, Integer> points) {
        for(HashMap.Entry<String, Integer> entry : entriesSortedByValues(points)) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

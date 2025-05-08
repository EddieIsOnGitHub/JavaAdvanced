package listing4_1;

import java.sql.*;
import java.text.NumberFormat;

//The Movie Listing Program
public class ListMovies {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();
        try {
            while (movies.next()) {
                Movie m = getMovie(movies);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() {
        Connection con = getConnection();
        try {
            Statement s = con.createStatement();
            String select = "Select title, year, price " + "from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/movie_db";
            String user = "postgres";
            String pw = "Kristine";
            con = DriverManager.getConnection(url, user, pw);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movies) {
        try {
            String title = movies.getString("Title");
            int year = movies.getInt("Year");
            double price = movies.getDouble("Price");
            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class Movie {
        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}


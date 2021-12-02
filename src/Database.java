public class Database {
    public static class Theater{
        int Number;
        int Capacity;
        int Holds;
        String[] Shows1;
        String[] Shows2;
        String[] Shows3;
        //Seat matrix

        public Theater(int number, int capacity, int holds, String[] shows1,String[] shows2,String[] shows3) {
            Number = number;
            Capacity = capacity;
            Holds = holds;
            Shows1 = shows1;
            Shows2 = shows2;
            Shows3 = shows3;
            //Seat matrix
        }
    }

    public static class Movie{
        String Name;
        String Date;
        String Genre;
        String Rating;
        String Runtime;
        String[] Showtime1;
        String[] Showtime2;
        String[] Showtime3;



        public Movie(String name, String date, String genre, String rating, String runtime, String[] showtime1, String[] showtime2, String[] showtime3) {
            Name = name;
            Date = date;
            Genre = genre;
            Rating = rating;
            Runtime = runtime;
            Showtime1 = showtime1;
            Showtime2 = showtime2;
            Showtime3 = showtime3;
        }
    }


    public static class Ticket{
        int ID;
        double[] Price;
        String Seat;
        String Time;
        String Movie;
        String Theater;

        public Ticket(int id, String seat, String time, String movie,String theater) {
            ID = id;
            Price = new double[]{9.99, 6.99, 7.99};
            Seat = seat;
            Time = time;
            Movie = movie;
            Theater = theater;

        }
    }

    public static void main(String[] args) {
        Theater theater1 = new Theater(1,200,120, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater2 = new Theater(2,200,120,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater3 = new Theater(3,200,120,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater4 = new Theater(4,120,80,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater5 = new Theater(5,120,80,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater6 = new Theater(6,120,80,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});

        Movie movie1 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie2 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie3 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie4 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie5 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie6 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie7 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});

        Ticket example = new Ticket(123456, "G5" , "4:30", "clifford", "1");
    }
}


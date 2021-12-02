public class Database {
    public static class Theater{
        int Number;
        int Capacity;
        int Holds;
        String[] Shows1;
        String[] Shows2;
        String[] Shows3;
        String[][] SeatMatrix;

        public Theater(int number, String[] shows1,String[] shows2,String[] shows3) {
            Number = number;
            Capacity = 150;
            Holds = 90;
            Shows1 = shows1;
            Shows2 = shows2;
            Shows3 = shows3;
            SeatMatrix = new String[][]{
                    {"A1","A2","A3","A4","A5","A6","A7","A8","A9"},
                    {"B1","B2","B3","B4","B5","B6","B7","B8","B9"},
                    {"C1","C2","C3","C4","C5","C6","C7","C8","C9"},
                    {"D1","D2","D3","D4","D5","D6","D7","D8","D9"},
                    {"E1","E2","E3","E4","E5","E6","E7","E8","E9"},
                    {"F1","F2","F3","F4","F5","F6","F7","F8","F9"},
                    {"G1","G2","G3","G4","G5","G6","G7","G8","G9"},
                    {"H1","H2","H3","H4","H5","H6","H7","H8","H9"},
                    {"I1","I2","I3","I4","I5","I6","I7","I8","I9"},
                    {"J1","J2","J3","J4","J5","J6","J7","J8","J9"}};
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
        Theater theater1 = new Theater(1, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater2 = new Theater(2,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater3 = new Theater(3,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater4 = new Theater(4,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater5 = new Theater(5,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});
        Theater theater6 = new Theater(6,new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"}, new String[]{"clifford", "4:30"});

        Movie movie1 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie2 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie3 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie4 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie5 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie6 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});
        Movie movie7 = new Movie ("clifford", "3/22/99", "Fantasy", "PG", "1:46", new String[] {"1","1:30"}, new String[] {"1","1:30"}, new String[] {"1","1:30"});

        Ticket example = new Ticket(123456, "G5" , "4:30", "clifford", "1");
        System.out.println(movie2.Date);
    }
}


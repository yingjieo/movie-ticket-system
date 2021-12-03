import java.util.concurrent.ThreadLocalRandom;

public class Database {

    public static class Theater {
        int Number;
        int Capacity;
        int Holds;
        String[][][] SeatSlots;

        public Theater(int number) {
            Number = number;
            Capacity = 50;
            Holds = 25;
            SeatSlots = new String[][][]{{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}},{
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}, {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"},
                    {"D1", "D2", "D3", "D4", "D5"},
                    {"E1", "E2", "E3", "E4", "E5"}}};


        }
    }


        public static class Movie {
            String Name;
            String Date;
            String Genre;
            String Rating;
            String Runtime;



            public Movie(String name, String date, String genre, String rating, String runtime) {
                Name = name;
                Date = date;
                Genre = genre;
                Rating = rating;
                Runtime = runtime;

            }
        }


        public static class Ticket {
            int ID;
            double Price;
            String Seat;
            String Time;
            String Date;
            String Movie;
            int Theater;
            String[] Options = {"Encanto", "House of Gucci", "Resident Evil: Welcome to Raccoon City", "Ghostbusters: Afterlife", "King Richard","Eternals"};
            double[] Prices = {9.99, 6.99, 7.99};

            public Ticket(String seat, String time, String date, String movie, int sos) {
                ID = ThreadLocalRandom.current().nextInt(10000, 100000);
                Price = Prices[sos];
                Seat = seat;
                Time = time;
                Date = date;
                Movie = movie;
                for(int i = 1; i < 7;i++){
                    if (movie.equals(Options[i-1])){
                        Theater = i;
                    }
                }

            }
        }

        public static void main(String[] args) {
            Theater theater1 = new Theater(1);
            Theater theater2 = new Theater(2);
            Theater theater3 = new Theater(3);
            Theater theater4 = new Theater(4);
            Theater theater5 = new Theater(5);
            Theater theater6 = new Theater(6);

            Movie movie1 = new Movie("Encanto", "11/24/2021", "Musical", "PG", "1:49");
            Movie movie2 = new Movie("House of Gucci", "11/24/2021", "Drama", "R", "2:37");
            Movie movie3 = new Movie("Resident Evil: Welcome to Raccoon City", "11/24/2021", "Horror", "R", "1:47");
            Movie movie4 = new Movie("Ghostbusters: Afterlife", "11/19/2021", "Sci-Fi", "PG-13", "2:04");
            Movie movie5 = new Movie("King Richard", "11/19/2021", "Drama", "PG-13", "2:24");
            Movie movie6 = new Movie("Eternals", "11/05/2021", "SuperHero", "PG-13", "2:37");


            Ticket example = new Ticket("G5", "4:30", "12/10", "Eternals",1);
            System.out.println(movie2.Date);
            System.out.println(theater1.SeatSlots[0][0][0]);
        }

}


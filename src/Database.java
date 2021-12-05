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

}


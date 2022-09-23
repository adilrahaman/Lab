// Q 4.Movie Theatre Management System, where you can create two classes one is main another one is movie, 
// movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.

import java.util.*;
public class movieManagementSystem {
    public static void main(String[] args) {
        String movieName,startTime,endTime,ticketPrice;
        Movie movie = new Movie();
        Scanner sc = new Scanner (System.in);
        System.out.println("plesae enter the movie name  : " );
        movieName = sc.nextLine();
        System.out.println("enter movie start time : ");
        startTime = sc.nextLine();
        System.out.println("enter movie end time : ");
        endTime = sc.nextLine();
        System.out.println("enter movie ticket price : ");
        ticketPrice = sc.nextLine();

        movie.setMovie(movieName,startTime,endTime,ticketPrice);
        movie.getMovie();
        
    }


    class Movie {
        String movieName,startTime,endTime,ticketPrice;
        public void setMovie (String movieName, String startTime, String endTime, String ticketPrice) {
            this.movieName = movieName;
            this.startTime = startTime;
            this.endTime = endTime;
            this.ticketPrice = ticketPrice;

        }

        public void getMovie (){
            System.out.println("your booked movie is : " +  movieName);
            System.out.println("movie will start from : " + startTime);
            System.out.println(" movie will end at : " + endTime);
            System.out.println(" you have paid : " + ticketPrice);
        }
    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie m1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie m2 = new Movie("KGF", "Action", 8.5);

        Show s1 = new Show(m1, "6 PM", 10);
        Show s2 = new Show(m2, "9 PM", 10);

        Theatre theatre = new Theatre("PVR", Arrays.asList(s1, s2));

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Shows:");
        theatre.getShows().forEach(System.out::println);

        System.out.print("Select show index (0 or 1): ");
        int showIndex = sc.nextInt();

        Show selectedShow = theatre.getShows().get(showIndex);

        System.out.println("Available Seats:");
        selectedShow.getAvailableSeats()
                .forEach(System.out::println);

        System.out.print("Enter seat number: ");
        int seatNumber = sc.nextInt();

        BookingService service = new BookingService();
        service.bookSeat(selectedShow, seatNumber)
                .ifPresentOrElse(
                        booking -> {
                            System.out.println("Booking Successful!");
                            System.out.println(booking);
                        },
                        () -> System.out.println("Seat not available!")
                );
    }
}

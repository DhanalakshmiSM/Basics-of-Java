// 7. Ticket Pricing
// Problem: Base class Ticket with method getPrice(). Subclasses MovieTicket, BusTicket, TrainTicket override it.
// Steps:
// 1.	Create class Ticket with method double getPrice().
// 2.	Override with different prices.
// 3.	In main(), print ticket prices.

class Ticket {
    public double getPrice() {
        return 0; // Default price
    }
}

class MovieTicket extends Ticket {
    
    public double getPrice() {
        return 12.99;
    }
}

class BusTicket extends Ticket {
    
    public double getPrice() {
        return 2.50;
    }
}

class TrainTicket extends Ticket {
    
    public double getPrice() {
        return 15.00;
    }
}

public class TicketPricing {
    public static void main(String[] args) {
        Ticket movie = new MovieTicket();
        Ticket bus = new BusTicket();
        Ticket train = new TrainTicket();

        System.out.println("Movie Ticket Price: $" + movie.getPrice());
        System.out.println("Bus Ticket Price: $" + bus.getPrice());
        System.out.println("Train Ticket Price: $" + train.getPrice());
    }
}

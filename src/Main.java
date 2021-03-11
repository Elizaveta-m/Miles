public class Main {
    public static void main(String[] args) {
        int ticketPrice = 20000;
        int priceStep = 20;
        int bonusScore = 1;

        int totalBonus = ticketPrice / priceStep * bonusScore;
        System.out.println(totalBonus);
    }
}

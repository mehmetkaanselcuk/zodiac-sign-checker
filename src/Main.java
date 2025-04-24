import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Select birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Select your birth month (1-12): ");
        int month = input.nextInt();

        String zodiac = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            zodiac = "Aries";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            zodiac = "Taurus";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            zodiac = "Gemini";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiac = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            zodiac = "Capricorn";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            zodiac = "Aquarius";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            zodiac = "Pisces";
        } else {
            System.out.println("Error");
        }

        if (!zodiac.equals("")) {
            System.out.println("Your zodiac sign is: " + zodiac);
        }

        input.close();
    }
}

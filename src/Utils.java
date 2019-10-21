import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Utils {

    static Date stringToDate(String s) throws ParseException {
        String s1 = splitTime(s, "/");
        DateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");
        java.util.Date d2 = sdf2.parse(s1);
        Date dateWithoutTime = sdf2.parse(sdf2.format(d2));
        return dateWithoutTime;
    }

    static String splitTime(String s, String separator) {
        String time = s.equals("") ? "" : s.substring(0, 2) + separator + s.substring(2, 4) + separator + s.substring(4);
        return time;
    }

    static int selectCategory() {
        System.out.println("Select Category from the below list:");
        System.out.println("1: Smartphone");
        System.out.println("2: Computer");
        System.out.println("3: Vegetables");
        System.out.println("4: Sweets");
        System.out.println("5: Water");
        System.out.println("6: Sweet Drinks");
        System.out.println("7: Clothes");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    static String getCategory(int cat) {
        String category = "";
        switch (cat) {
            case 1:
                category = "Smartphone";
                break;
            case 2:
                category = "Computer";
                break;
            case 3:
                category = "Vegetables";
                break;
            case 4:
                category = "Sweets";
                break;
            case 5:
                category = "Water";
                break;
            case 6:
                category = "Sweet Drinks";
                break;
            case 7:
                category = "Clothes";
                break;
            default:
                System.out.println("This category does not exist");
                break;
        }
        return category;
    }

    public static Date setDate(int year, int month, int day, int hour, int min, int sec) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, sec);
        Date date = calendar.getTime();

        return date;
    }

    public static Date enterDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        System.out.println("Enter hours: ");
        int hour = scanner.nextInt();
        System.out.println("Enter minutes: ");
        int min = scanner.nextInt();
        System.out.println("Enter seconds: ");
        int sec = scanner.nextInt();
        return setDate(year, month, day, hour, min, sec);
    }
}
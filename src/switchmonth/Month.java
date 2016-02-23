package switchmonth;

/**
 * Created by Cardoso on 23-Feb-16.
 */
public class Month {
    public static String convertMonth (int month) {
        String resultMonth;
        switch (month) {
            case 1:
                resultMonth = "january";
                break;
            case 2:
                resultMonth = "february";
                break;
            case 3:
                resultMonth = "march";
                break;
            case 4:
                resultMonth = "april";
                break;
            case 5:
                resultMonth = "may";
                break;
            case 6:
                resultMonth = "june";
                break;
            case 7:
                resultMonth = "july";
                break;
            case 8:
                resultMonth = "august";
                break;
            case 9:
                resultMonth = "september";
                break;
            case 10:
                resultMonth = "october";
                break;
            case 11:
                resultMonth = "november";
                break;
            case 12:
                resultMonth = "december";
                break;
            default:
                resultMonth = "Month not recognised"; //must be included in case a not valid number is asked
        }
        return resultMonth;
    }
    public static void main (String[]args){
        //to call the method from the terminal or config windows
        int month = Integer.parseInt(args[0]);
        String finalMonth = Month.convertMonth(month);
        System.out.print(finalMonth);
    }
}

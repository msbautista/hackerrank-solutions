//Problem: https://www.hackerrank.com/challenges/the-time-in-words
public class TimeInWords {

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 47)); ////thirteen minutes to six
    }

    public static String timeInWords(int hour, int minute) {
        if (hour < 1 || hour > 12 || minute < 0 || minute > 59)
            return "Incorrect Time";
        if (minute == 0) {
            String hourAsWord = convertNumberToWord(hour);
            return hourAsWord + " o' clock";
        }
        if (minute <= 30) {
            String minuteAsWord = convertNumberToWord(minute);
            String hourAsWord = convertNumberToWord(hour);
            String minuteAsPluralOrSingular = (minute == 1) ? "minute" : "minutes";
            if (minute == 15 || minute == 30) {
                return minuteAsWord + " past " + hourAsWord;
            }
            return minuteAsWord + " " + minuteAsPluralOrSingular + " past " + hourAsWord;
        } else {
            int remainingMinutes = 60 - minute;
            String remainingMinutesAsWord = convertNumberToWord(remainingMinutes);
            String nextHourAsWord = convertNumberToWord(hour + 1);
            String minuteAsPluralOrSingular = (remainingMinutes == 1) ? "minute" : "minutes";
            if (remainingMinutes == 15) {
                return remainingMinutesAsWord + " to " + nextHourAsWord;
            }
            return remainingMinutesAsWord + " " + minuteAsPluralOrSingular + " to " + nextHourAsWord;
        }
    }

    public static String convertNumberToWord(int number) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int unit = (number > 9) ? Character.getNumericValue(Integer.toString(number).charAt(1)) : number;
        switch (number) {
            case 15:
                return "quarter";
            case 20:
                return "twenty";
            case 30:
                return "half";
            default:
                if (number < 20)
                    return units[number];
                else if (number < 30)
                    return "twenty " + units[unit];
                else
                    return "";
        }
    }
}

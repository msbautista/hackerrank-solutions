using System.Text.RegularExpressions;

namespace TimeConversion;

class Program
{
    static void Main(string[] args)
    {
        var convertedTime = timeConversion("01:05:45AM");
        Console.WriteLine(convertedTime);
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static string timeConversion(string s)
    {
        var hour = s.Substring(0, 2);
        var period = s.Substring(s.Length - 2, 2);
        var timeWithoutPeriod = s.Remove(s.Length - 2, 2);
        if (hour == "12" && period == "AM")
        {
            return Regex.Replace(timeWithoutPeriod, "12", "00");
        }
        if (hour != "12" && period == "PM")
        {
            var hourInt = int.Parse(hour);
            var militaryHour = hourInt + 12;
            return Regex.Replace(timeWithoutPeriod, hour, militaryHour.ToString());
        }
        else
        {
            return timeWithoutPeriod;
        }
    }
}

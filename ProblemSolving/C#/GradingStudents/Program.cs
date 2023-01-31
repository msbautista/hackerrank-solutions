namespace GradingStudents;
class Program
{
    static void Main(string[] args)
    {
        List<int> grades = new List<int>() { 86, 30, 0, 16, 51, 53, 42, 48, 22, 69, 12, 27, 34, 24, 95, 16, 32, 22, 52, 56, 71, 95 };
        gradingStudents(grades);
    }

    public static List<int> gradingStudents(List<int> grades)
    {
        var finalGrades = new List<int>(grades);
        for (var i = 0; i < grades.Count; i++)
        {
            var grade = grades[i];
            if (grade < 38)
            {
                continue;
            }
            int roundGrade = grade;
            while (!(roundGrade % 5 == 0))
            {
                roundGrade += 1;
            }
            int differenceBetweenGradeAndNextMultipleOf5 = roundGrade - grade;
            if (differenceBetweenGradeAndNextMultipleOf5 < 3)
            {
                finalGrades[i] = roundGrade;
            }
        }

        return finalGrades;
    }
}

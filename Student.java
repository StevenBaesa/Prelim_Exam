class Student
{
// the private data members
private int IDnum;
private int hours;
private int points;
private static int lastStudentID;
 
 
public void showIDnum()
{
System.out.println("ID Num is: " + IDnum);
}
 
public void showHours()
{
System.out.println("Credit Hours: " + hours);
}
 
public void showPoints()
{
System.out.println("Points Earned: " + points);
}
 
public double getGradePoint()
{
return (double) (points / hours);
}
 
}
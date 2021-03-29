class Student
{
// the private data members
public int IDnum;
public int creds;
public int points;
public static int lastStudentID;
 
 
public void showIDnum()
{
System.out.println("ID Num is: " + IDnum);
}
 
public void showCreds()
{
System.out.println("Credit Hours: " + creds);
}
 
public void showPoints()
{
System.out.println("Points Earned: " + points);
}
 
public double getGradePoint()
{
return (double) (points / creds);
}
 
}

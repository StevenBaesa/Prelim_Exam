class ShowStudent {
public static void main (String args[])
{
Student kid = new Student();
 
kid.setCreds(Integer.parseInt(args[0]));
kid.setIDnum();
kid.setPoints(Integer.parseInt(args[1]));
kid.showIDnum();
kid.showPoints();
kid.showCreds();
System.out.println("The grade point average is "
+ kid.getGradePoint());
System.out.println(" ");
 
Student kid2 = new Student();
kid2.setCreds(Integer.parseInt(args[2]));
kid2.setIDnum();
kid2.setPoints(Integer.parseInt(args[3]));
kid2.showIDnum();
kid2.showPoints();
kid2.showCreds();
System.out.println("The grade point average is "
+ kid2.getGradePoint());
System.out.println(" ");
 
Student kid3 = new Student();
kid3.setCreds(Integer.parseInt(args[4]));
kid3.setIDnum();
kid3.setPoints(Integer.parseInt(args[5]));
kid3.showIDnum();
kid3.showPoints();
kid3.showCreds();
System.out.println("The grade point average is "
+ kid3.getGradePoint());
System.out.println(" ");
}
}
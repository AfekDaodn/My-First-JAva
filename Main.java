class Main { 
public static void main(String[] args) { 
int grade = 90;
if (grade >= 90)
{
  System.out.println("A= Aces");
}
else if (grade == 81 || grade == 82 || grade == 83 || grade == 84 || grade == 85 || grade == 86 || grade == 87 || grade == 88 || grade == 89 || grade == 80)
{
  System.out.println("B= Good Work");
}
else if (grade == 71 || grade == 72 || grade == 73 || grade == 74 || grade == 75 || grade == 76 || grade == 77 || grade == 78 || grade == 79)
{
  System.out.println("C= You did it");
}
else if (grade == 70)
{
  System.out.println("D= Whew! You passed");
}
else 
{
  System.out.println("F= You need to study and retake the exam");
}
}

} 
import java.util.Scanner;

class biotech {
void add (int a, int b)
{
System.out.println("sum :"+ (a+b));
}
}

class computer extends biotech 
{
void sub(int a, int b)
{
System.out.println("sub :" +(a-b));
}
}

class civil extends biotech {
void multiple (int a, int b)
{
System.out.println("multiple :" +(a*b));
}
}

class calculator {

public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("enter value of a andbbbb :");
int a = scan.nextInt();
System.out.println("enter value of b:");
int b = scan.nextInt();
computer cs = new computer();
civil eng = new civil();
cs.add(a,b);
cs.sub(a,b);
eng.multiple(a,b);
}
}

package nested_loops;

public class fibonacci {
public static void main(String[] args) {
int a =1;
int b=1;
 int c=a+b;
System.out.print(a);
 System.out.print(b);
 for( int i=0; i<=10; i++)
{
System.out.print( c );
c=(a+b);
 a=b;
 b=c;
 }

}
}

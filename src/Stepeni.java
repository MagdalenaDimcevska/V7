import java.util.Scanner;
public class Stepeni{
	public static void main(String[] args) {
	int f; 
	int c;
	Scanner tastatura=new Scanner(System.in);
	System.out.print("Vnesete celziusovi stepeni");
	c=tastatura.nextInt();
	f=9*c/5+32;
	System.out.print(c+"celziuosovi stepeni=");
	System.out.print(f+"farenhajtovi stepeni=");
	}
}
import java.util.Scanner;
public class atm2{
	public static void main(String args[]){
		int cardno=1111,pinno=11;
		double balance=10000,am=0,ch=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your cardno");
		int cd=sc.nextInt();
		System.out.println("Enter your pin no");
		int pn=sc.nextInt();
		if (cd==cardno && pn==pinno){
			while(ch==1){
				System.out.println("Enter your Choice");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				int c=sc.nextInt();
				switch(c){
					case 1:
						System.out.println("Your current balance is:" + balance);
						break;
					case 2:
						System.out.println("Enter the amount you want to deposit:");
						am=sc.nextInt();
						balance+=am;
						System.out.println("Your new balance is:" + balance);
						break;
					case 3:
						System.out.println("Enter the amount you want to withdraw:");
						am=sc.nextInt();
						if(am<balance){
							balance-=am;
							System.out.println("Your new balance is:" + balance);
							break;
						}
						else{
							System.out.println("The amount you entered exceeds your balance");
							break;
						}
				
				}
			System.out.println("Press 1 to continue");
			ch=sc.nextInt();
			}
		}
	}
			

}
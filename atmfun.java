import java.util.Scanner;
public class atmfun{
	static int cardno1=1111, cardno2=2222, pinno1=11, pinno2=22,c=0,cn=0,pn=0;
	static double balance1=1000,balance2=2000;
	static Scanner sc=new Scanner (System.in);
	public static void main(String args[]){
		cardmatch();
		
	}
	static void cardmatch(){
		System.out.println("Enter your card no");
		cn=sc.nextInt();
		if(cn==cardno1 || cn==cardno2){
			pinmatch();
			
		}
		else{
			System.out.println("The card no you entered is incorrect");
		}
	}
	static void pinmatch(){
		System.out.println("Enter you pinno");
		pn=sc.nextInt();
		if(pn==pinno1 || pn==pinno2){
			transaction();
		}
		else{
			System.out.println("The pinno you entered is incorrect");
		}
	}
	static void transaction(){
		System.out.println("Choose the transation");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		c=sc.nextInt();
		switch(c){
			case 1:
				balance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
		}
	}
	static void balance(){
		if(pn==pinno1){
			System.out.println("Your current balance is: " + balance1);
		}
		else{
			System.out.println("Your current balance is: " + balance2);
		}
		cont();
	}
	static void deposit(){
		System.out.println("Enter the amount you want to deposit: ");
		int am=sc.nextInt();
		if(pn==pinno1){
			balance1+=am;
			System.out.println("Your new balance is: " + balance1);
		}
		else{
			balance2+=am;
			System.out.println("Your new balance is: " + balance2);
		}
		cont();
	}
	static void withdraw(){
		System.out.println("Enter the amount you want to withdraw: ");
		int am=sc.nextInt();
		if(pn==pinno1){
			if(am<balance1){
				if(am%100==0){
					balance1-=am;
					System.out.println("Your new balance is: " + balance1);
				}
				else{
					System.out.println("Enter amount in multiples of 100!! ");
					withdraw();
				}
			}
			else{
				System.out.println("Insufficient balance");
			}
		}
		if(pn==pinno2){
			if(am<balance2){
				if(am%100==0){
					balance2-=am;
					System.out.println("Your new balance is: " + balance2);
				}
				else{
					System.out.println("Enter amount in multiples of 100!! ");
					withdraw();
				}
			}
			else{
				System.out.println("Insufficient balance");
			}
		}
		
			cont();
		}
	static void cont(){
		System.out.println("Do you want to continue? If yes, Press 1");
		int ch=sc.nextInt();
		if(ch==1){
			transaction();
		}
		else{
			cardmatch();
		}
	}
}
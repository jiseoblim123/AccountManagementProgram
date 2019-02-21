import java.util.Scanner;

public class AccountManagement {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* Establishing your account.");
	
		System.out.print("- Your Name: ");
		String name = scan.nextLine();
		
		System.out.print("- Password: ");
		String pwd = scan.nextLine();
		
		System.out.print("- Deposit Amount($): ");
		int bal = scan.nextInt();
		
		Account acc = new Account(name, pwd, bal);
		
		System.out.println(acc.name + "'s Account Established!");
		
		while(true) {
			System.out.println("Enter Menu Number: ");
			System.out.println("[ 1. Deposit | 2. Withdraw | 3. Check Balance | 4. Exit ]");
			System.out.print("> ");
			
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("Enter Your Account Password.");
				System.out.print("> ");
				String pswd = scan.next();
				
				//== compares stack address
				//.equals() compares heap(actual) value
				if(pswd.equals(acc.pwd)) {
					System.out.println("Enter Deposit Amount: ");
					System.out.print("> ");
					int money = scan.nextInt();
					acc.saveMoney(money);
					System.out.println("[Account #: " + acc.accNum + "]");
					System.out.println("Total Balance: $" + acc.balance);
				}else {
					System.out.println("Wrong Password.");
				}
				continue;//goes to very first loop, which in this case is (while(true){})
			}
			if(menu == 2) {
				System.out.println("Enter Your Password: ");
				System.out.print("> ");
				String pswd = scan.next();
				if(pswd.equals(acc.pwd)) {
					System.out.println("Enter Withdraw Amount: ");
					System.out.print("> ");
					int money = scan.nextInt();
					acc.withDrawMoney(money);
					System.out.println("[Account #: " + acc.accNum + "]");
					System.out.println("Total Balance: $" + acc.balance);
				}else {
					System.out.println("Wrong Password");
				}
			}
			if(menu == 3) {
				System.out.println("Enter Your Password: ");
				System.out.print("> ");
				String pswd = scan.next();
				if(pswd.equals(acc.pwd)) {
					System.out.println("[Account #: " + acc.accNum + "]");
					System.out.println("Total Balance: $" + acc.balance);
				}else {
					System.out.println("Wrong Password");
				}
			}
			if(menu == 4) {
				System.out.println("Thank You.");
				break;
			}
		}//end of while
		
	}//end of main method
	
}//end of class

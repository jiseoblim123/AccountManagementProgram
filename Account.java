
public class Account {
	
	//객체의 속성(멤버변수)
	static String bankName = "Bank of America";
	String name;
	String accNum;
	String pwd;
	int balance;
	
	//생성자 선언
	Account(String name1, String pwd1, int bal) {
		
		name = name1;
		accNum = "111-222-333333";
		pwd = pwd1;
		balance = bal;
	}
	
	Account(String name1, String pwd1){
		name = name1;
		accNum = "111-222-333333";
		pwd = pwd1;
		balance = 5000;

	}
	
	//입금 기능
	void saveMoney(int money) {
		balance += money;
	}
	
	//출금 기능
	void withDrawMoney(int money) {
		balance -= money;//balance = balance - money;
	}
	
	//잔액 조회 기능
	int getBalance() {
		return balance;
	}
	
	//이름 조회
	static String getName() {
		 return bankName;
	}
}











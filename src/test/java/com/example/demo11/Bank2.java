package com.example.demo11;

public class Bank2 {

	private String branch = "vdd 分行";

	private String user;

	private int balance;

	//預設建構方法，格式:方法的存取權限 類別名稱(){}
	//                public     Bank(){}
	//預設建構方法 --> 就是沒有參數的建構方法
	//當類別中沒有其他建構方法時，程式會自動套用預設建構方法，因此不用特別寫出。
	//而當有其他(帶有參數)建構方法存在時，程式自帶的預設建構方法會失效，就需要寫出才能使用。
	//******只要記得建構其他方法時要把基本建構方法也一起建構才不會後面出錯******
	public Bank2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    //帶有參數的建構方法，實作內容等同SETXXX的方法，目的是減少建構時程式碼行數
	public Bank2(String branch, String user, int balance) {
		 //只能是類別的名稱
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}
    //靜態方法可直接透過類別名稱.靜態方法呼叫 public static 
	//一般方法則須先將類別new出來後才能呼叫

	// 建立屬性的存(get)取方法()
	//一般方法:
	//格式:方法得存取權限，方法的回傳值的資料型態，方法名稱(參數資料型態 參數變數名稱){方法的實作內容}
	//      public      String            getBranch(){}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	public void saving(int amount) {

		System.out.println("存款前餘額: " + balance);
		// 判斷amount是否正數
		if (amount >= 0) {
			balance += amount;
		} else if (amount > balance) {
			System.out.println("餘額不足");
		} else {
			System.out.println("存款金額不能為負數");
		}
		// 餘額加存款金額

		System.out.println("存款後餘額: " + balance);
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("提款金額不能為負數");
		} else if (amount > balance) {
			System.out.println("餘額不足");
		} else {
			balance -= amount;
			System.out.println("提款後餘額：" + balance);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

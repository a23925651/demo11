package com.example.demo11;

public class Bank2 {

	private String branch = "vdd ����";

	private String user;

	private int balance;

	//�w�]�غc��k�A�榡:��k���s���v�� ���O�W��(){}
	//                public     Bank(){}
	//�w�]�غc��k --> �N�O�S���Ѽƪ��غc��k
	//�����O���S����L�غc��k�ɡA�{���|�۰ʮM�ιw�]�غc��k�A�]�����ίS�O�g�X�C
	//�ӷ���L(�a���Ѽ�)�غc��k�s�b�ɡA�{���۱a���w�]�غc��k�|���ġA�N�ݭn�g�X�~��ϥΡC
	//******�u�n�O�o�غc��L��k�ɭn��򥻫غc��k�]�@�_�غc�~���|�᭱�X��******
	public Bank2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    //�a���Ѽƪ��غc��k�A��@���e���PSETXXX����k�A�ت��O��֫غc�ɵ{���X���
	public Bank2(String branch, String user, int balance) {
		 //�u��O���O���W��
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}
    //�R�A��k�i�����z�L���O�W��.�R�A��k�I�s public static 
	//�@���k�h�����N���Onew�X�ӫ�~��I�s

	// �إ��ݩʪ��s(get)����k()
	//�@���k:
	//�榡:��k�o�s���v���A��k���^�ǭȪ���ƫ��A�A��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��){��k����@���e}
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

	// �s��
	public void saving(int amount) {

		System.out.println("�s�ګe�l�B: " + balance);
		// �P�_amount�O�_����
		if (amount >= 0) {
			balance += amount;
		} else if (amount > balance) {
			System.out.println("�l�B����");
		} else {
			System.out.println("�s�ڪ��B���ର�t��");
		}
		// �l�B�[�s�ڪ��B

		System.out.println("�s�ګ�l�B: " + balance);
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("���ڪ��B���ର�t��");
		} else if (amount > balance) {
			System.out.println("�l�B����");
		} else {
			balance -= amount;
			System.out.println("���ګ�l�B�G" + balance);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

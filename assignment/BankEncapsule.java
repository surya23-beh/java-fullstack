package assignment;

class BankAccount{
	private String accno;
	private int balance;
	
	public String GetAccno() {
		return accno;
	}
	public int GetBalance() {
		return balance;
	}
	public void SetAccno(String acc) {
		this.accno = acc;
	}
	public void SetBalance(int bal) {
		this.balance = bal;
	}
}
public class BankEncapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount();
		obj.SetAccno("IOB-231105");
		obj.SetBalance(20000);
		String accno = obj.GetAccno();
		int bal = obj.GetBalance();
		System.out.println("acc number is :" + accno);
		System.out.println("balance is : " + bal);
		
		
	}

}

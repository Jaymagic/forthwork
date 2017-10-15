package testaccount;

/**
 * <p>title Testaccount
 * @author 袁杰
 * @DATE 2017年10月15日上午10:09:51


 */
public class Testaccount {

	public static void main(String[] args) {		
		InquireAccount saver=new InquireAccount("1234567890","zhangsan",5000);
		InquireAccount.setyearinterest(0.023);
		System.out.println("username:"+saver.getusername());//显示用户名
		System.out.println("accountnumber:"+saver.getaccountnumber());//显示账户名
		System.out.println("balance:"+saver.getbalance());//显示余额
		System.out.println("year rate:"+saver.getyearinterest());//显示年利息
		saver.save(2000);// TODO Auto-generated method stub

	}

}
class InquireAccount{
	private String username;
	private String accountnumber;
	private float balance;
	static double interest;
	InquireAccount(String num,String name,float ba){
		this.accountnumber=num;
		this.username=name;
		this.balance=ba;
		
	}
	
	public void save(float m) {
		System.out.println("balance:"+balance);
		System.out.println("save:"+m);
		balance+=m;
		System.out.println("now balance:"+balance);//存款
		
	}
	
	public String getusername() {
		return username;
	}
	
	public String getaccountnumber() {
		return accountnumber;
	}
	
	public float getbalance() {
		return balance;
	}
	public static void setyearinterest(double n) {		
		interest=n;
	}
	public double getyearinterest(){
		return balance*interest;
	}
	public double getmonthinterest() {
		return balance*interest/12;
	}
}

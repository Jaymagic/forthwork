package testaccount;

/**
 * <p>title Testaccount
 * @author Ԭ��
 * @DATE 2017��10��15������10:09:51


 */
public class Testaccount {

	public static void main(String[] args) {		
		InquireAccount saver=new InquireAccount("1234567890","zhangsan",5000);
		InquireAccount.setyearinterest(0.023);
		System.out.println("username:"+saver.getusername());//��ʾ�û���
		System.out.println("accountnumber:"+saver.getaccountnumber());//��ʾ�˻���
		System.out.println("balance:"+saver.getbalance());//��ʾ���
		System.out.println("year rate:"+saver.getyearinterest());//��ʾ����Ϣ
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
		System.out.println("now balance:"+balance);//���
		
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

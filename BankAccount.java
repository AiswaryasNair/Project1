//5. Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not 
//exceeds the current balance). Add an extra method to check the account balance. (instance method)  

class BankAccount{
	int currentbal=2000;
	public int getCurrentbal(){
	
return currentbal;
}

public void deposit(int totalamt){
currentbal=currentbal+totalamt;
	
System.out.println("total amt"+totalamt);
}

public void withdraw(int b){
if(b<=currentbal){
currentbal=currentbal-b;
System.out.println("Withdrawal successful");}
else{
System.out.println("Not suffient balance in your account");
}
}


public static void main(String args[])
{
	
BankAccount v = new BankAccount();

int amt =Integer.parseInt(args[0]);
v.deposit(amt);
System.out.println("current balance after deposit"+v.getCurrentbal());
int withdrawamt= Integer.parseInt(args[1]);
v.withdraw(withdrawamt);
System.out.println("after withdraw"+v.getCurrentbal());
}
}


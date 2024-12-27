package Abstraction_Day_2;

public class Oracle implements Connection{

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("This is Oracle db Commit method...");
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("This is Oracle db Rollback method ");
	}

	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		System.out.println("This is Transaction method of Oracle db");
		
	}

}

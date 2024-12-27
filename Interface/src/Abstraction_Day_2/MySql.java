package Abstraction_Day_2;

public class MySql implements Connection {

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("This is MySql db commit method");
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("This is MySql db Rollback Method");
	}

	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		System.out.println("This is Transaction method of MySql db");	
	}

}

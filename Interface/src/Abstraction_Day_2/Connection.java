package Abstraction_Day_2;

public interface Connection {
	void startTransaction();

	void commit();
	void rollback();
	
	

}

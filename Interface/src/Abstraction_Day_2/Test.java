package Abstraction_Day_2;

public class Test {

	public static void main(String[] args) {
		Connection con=new Oracle();
		con.commit();
		con.rollback();
		con.startTransaction();
		Connection conn=new MySql();
		conn.commit();
		conn.rollback();
		conn.startTransaction();
		

	}

}

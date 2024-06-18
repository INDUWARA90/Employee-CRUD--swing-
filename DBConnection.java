
public class DBConnection {
    private customerList customerList;

    private static DBConnection DBConnection;
    private DBConnection(){
        customerList=new customerList();
    }
    public static DBConnection getInstance(){
        if (DBConnection==null) {
            DBConnection=new DBConnection();
        }
        return DBConnection;
    }

    public customerList getCustomerList(){
		return customerList;
	}

}

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class Table1 extends JFrame{
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	private JLabel titleLabel;
    Customer Customer;
	private JButton btnCancel; 
	Table1(){
		setSize(600,300);
		setTitle("View FRIEND Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel HedrePanel=new JPanel(new GridLayout(1,1));
		HedrePanel.setBackground(new Color(66, 188, 245));

		titleLabel=new JLabel("List Contact By Name");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 4, 20, 4));

		HedrePanel.add(titleLabel);

		add("North",HedrePanel);
	
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		tablePane.setBorder(BorderFactory.createEmptyBorder(7, 4, 10, 4));

		add("Center",tablePane);
		


    //===========================================================	 
       
	DBConnection.getInstance().getCustomerList().Sort2();
		
        for(int i=0; i<DBConnection.getInstance().getCustomerList().size(); i++){
            Customer customer=DBConnection.getInstance().getCustomerList().get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFocusable(false);
        JPanel btnCancelPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCancel.setFont(new Font("",1,15));

        btnCancel.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
                    Table1.this.dispose();
					
               
           }
       });
        btnCancelPanel.add(btnCancel);
        add("South",btnCancelPanel);

	}
}




//===========================Table 02=========================
class Table2 extends JFrame{
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	private JLabel titleLabel;
    	Customer Customer;
	private JButton btnCancel; 
	Table2(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel HedrePanel=new JPanel(new GridLayout(1,0));
		HedrePanel.setBackground(new Color(66, 188, 245));

		titleLabel=new JLabel("List Contact By Salary");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 4, 20, 4));

		HedrePanel.add(titleLabel);
		
		add("North",HedrePanel);
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		tablePane.setBorder(BorderFactory.createEmptyBorder(7, 4, 10, 4));

		add("Center",tablePane);
		


    //===========================================================	 
       
	DBConnection.getInstance().getCustomerList().Sort1();
        for(int i=0; i<DBConnection.getInstance().getCustomerList().size(); i++){
            Customer customer=DBConnection.getInstance().getCustomerList().get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFocusable(false);
        JPanel btnCancelPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCancel.setFont(new Font("",1,15));

        btnCancel.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
                    Table2.this.dispose();
					
               
           }
       });
        btnCancelPanel.add(btnCancel);
        add("South",btnCancelPanel);

	}
}



//===========================Table 03=========================
class Table3 extends JFrame{
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	private JLabel titleLabel;
    Customer Customer;
	private JButton btnCancel; 
	Table3(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel HedrePanel=new JPanel(new GridLayout(1,0));
		HedrePanel.setBackground(new Color(66, 188, 245));
		titleLabel=new JLabel("List Contact By Birthday");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 4, 20, 4));

		HedrePanel.add(titleLabel);
		
		add("North",HedrePanel);
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		tablePane.setBorder(BorderFactory.createEmptyBorder(7, 4, 10, 4));

		add("Center",tablePane);
		


    //===========================================================	 
       
	DBConnection.getInstance().getCustomerList().sortingByBirthday();
			
        for(int i=0; i<DBConnection.getInstance().getCustomerList().size(); i++){
            Customer customer=DBConnection.getInstance().getCustomerList().get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFocusable(false);
        JPanel btnCancelPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCancel.setFont(new Font("",1,15));
		
        btnCancel.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
                    Table3.this.dispose();
			
           }
       });
        btnCancelPanel.add(btnCancel);
        add("South",btnCancelPanel);

	}



}

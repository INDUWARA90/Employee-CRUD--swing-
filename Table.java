import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//===========================Table 01=========================
class Table1 extends JFrame{
	private CustomerMainForm customerMainForm;
	ViewCustomerForm viewCustomerForm;
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	private JLabel titleLabel;
	private JButton btnCancel; 
	Table1(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("List Contact By Name");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
	
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		add("Center",tablePane);
	

    //===========================================================	 
		JPanel Container=new JPanel(new GridLayout(3,0));
		
		CustomerMainForm.customerList.Sort2();


        for(int i=0; i<CustomerMainForm.customerList.size(); i++){
            Customer customer=CustomerMainForm.customerList.get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
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
	static JTable tblCustomerDetails;
	static DefaultTableModel dtm;
	private JLabel titleLabel;
    	Customer Customer;
	private JButton btnCancel; 
	Table2(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("List Contact By Salary");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
	
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		add("Center",tablePane);
		


    //===========================================================	 
		JPanel Container=new JPanel(new GridLayout(3,0));
       
		CustomerMainForm.customerList.Sort1();
        for(int i=0; i<CustomerMainForm.customerList.size(); i++){
            Customer customer=CustomerMainForm.customerList.get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
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
	static JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	private JLabel titleLabel;
    	Customer Customer;
	private JButton btnCancel; 
	Table3(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("List Contact By Birthday");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
	
	//===========================================================

		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		add("Center",tablePane);
		


    //===========================================================	 
		JPanel Container=new JPanel(new GridLayout(3,0));
       
		CustomerMainForm.customerList.sortingByBirthday();
			
        for(int i=0; i<CustomerMainForm.customerList.size(); i++){
            Customer customer=CustomerMainForm.customerList.get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
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

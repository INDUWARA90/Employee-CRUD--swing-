import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class Table extends JFrame{
	static JTable tblCustomerDetails;
	static DefaultTableModel dtm;
	private JLabel titleLabel;
    	Customer Customer;
	private JButton btnCancel; 
	Table(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("View Customer Form");
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
       
				
        for(int i=0; i<CustomerMainForm.customerList.size(); i++){
            Customer customer=CustomerMainForm.customerList.get(i);
            Object[] rowData={customer.getContactID(), customer.getName(),customer.getPhoneNumber(),customer.getCompany(),customer.getSalary(),customer.getBDay()};
            Table.dtm.addRow(rowData);
        }
		
        btnCancel=new JButton("Back To Home");
        JPanel btnCancelPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCancel.setFont(new Font("",1,15));
        btnCancel.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
                    Table.this.dispose();
               
           }
       });
        btnCancelPanel.add(btnCancel);
        add("South",btnCancelPanel);

	}
}

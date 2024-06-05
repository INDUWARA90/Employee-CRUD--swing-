import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class ViewCustomerForm extends JFrame{
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	
	private JLabel titleLabel;
	
	private JButton btnReload; 
	ViewCustomerForm(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("View Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
		
		String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		dtm=new DefaultTableModel(columnsName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		add("Center",tablePane);
		
		JPanel buttonPanel=new JPanel(); //Default layout ->JPanel --FlowLAyout
		btnReload=new JButton("Reload");
		btnReload.setFont(new Font("",1,20));
		btnReload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				for(int i=0; i<CustomerMainForm.customerList.size(); i++){
					Customer customer=CustomerMainForm.customerList.get(i);
					Object[] rowData={customer.getContactID(), customer.getName(),customer.getCompany(),customer.getSalary()};
					dtm.addRow(rowData);
				}
			}
		});
		buttonPanel.add(btnReload);
		add("South",buttonPanel);
		
	}
}

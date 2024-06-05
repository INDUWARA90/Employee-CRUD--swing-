import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddCustomerForm extends JFrame{
	private JLabel titleLabel;
	
	private JButton btnAdd;
	private JButton btnCancel;
    private JButton btnGotoHome;

    private JLabel ContactID,Name,PhoneNumber,Company,Salary,BDay;

    private JTextField TxTContactID,TxTName,TxTPhoneNumber,TxTCompany,TxTSalary,TxTBDay;

	
	AddCustomerForm(){
		setSize(500,300);
		setTitle("Add Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("Add Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnAdd=new JButton("Add");
		btnAdd.setFont(new Font("",1,20));
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String id=TxTContactID.getText();
				String name=TxTName.getText();
				String address=TxTCompany.getText();
				double salary=Double.parseDouble(TxTSalary.getText());
				Customer customer=new Customer(id, name, id, name, address, salary);
				CustomerMainForm.customerList.add(customer);
				
			}
		});
		buttonPanel.add(btnAdd);
		
		btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20));
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTContactID.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
			}
		});
		buttonPanel.add(btnCancel);
		
		btnGotoHome=new JButton("Go To HomePage");
		btnGotoHome.setFont(new Font("",1,20));
		btnGotoHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				AddCustomerForm.this.dispose();
			}
		});
		buttonPanel.add(btnGotoHome);
		
		add("South",buttonPanel);
		
	
		
//===========================================================================		
		JPanel labelPanel=new JPanel(new GridLayout(6,1));
		
		ContactID=new JLabel("ContactId");
		ContactID.setFont(new Font("",1,20));
		labelPanel.add(ContactID);
		
		Name=new JLabel("Name");
		Name.setFont(new Font("",1,20));
		labelPanel.add(Name);
		
		Company=new JLabel("Company Name");
		Company.setFont(new Font("",1,20));
		labelPanel.add(Company);
		
        	
		PhoneNumber=new JLabel("Contact Number");
		PhoneNumber.setFont(new Font("",1,20));
		labelPanel.add(PhoneNumber);

		Salary=new JLabel("Salary");
		Salary.setFont(new Font("",1,20));
		labelPanel.add(Salary);
		        
		BDay=new JLabel("BirthDay");
		BDay.setFont(new Font("",1,20));
		labelPanel.add(BDay);
		
        add("West",labelPanel);

//===========================================================================
		JPanel textPanel=new JPanel(new GridLayout(6,1));
//===========================================================================
        TxTContactID=new JTextField(6);
		TxTContactID.setFont(new Font("",1,20));
		JPanel contactIDTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		contactIDTextPanel.add(TxTContactID);
		textPanel.add(contactIDTextPanel);
//===========================================================================		
		TxTName=new JTextField(15);
		TxTName.setFont(new Font("",1,20));
		JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		nameTextPanel.add(TxTName);
		textPanel.add(nameTextPanel);
//===========================================================================		
		TxTCompany=new JTextField(15);
		TxTCompany.setFont(new Font("",1,20));
		JPanel addressTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		addressTextPanel.add(TxTCompany);
		textPanel.add(addressTextPanel);
//===========================================================================		
		TxTPhoneNumber=new JTextField(15);
		TxTPhoneNumber.setFont(new Font("",1,20));
		JPanel phonenumberTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		phonenumberTextPanel.add(TxTPhoneNumber);
		textPanel.add(phonenumberTextPanel);
//===========================================================================		
		TxTSalary=new JTextField(10);
		TxTSalary.setFont(new Font("",1,20));
		JPanel salaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		salaryTextPanel.add(TxTSalary);
		textPanel.add(salaryTextPanel);
//===========================================================================
        TxTBDay=new JTextField(10);
		TxTBDay.setFont(new Font("",1,20));
		JPanel BDayTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		BDayTextPanel.add(TxTBDay);
		textPanel.add(BDayTextPanel);
//===========================================================================
           add("Center",textPanel);

	}
}


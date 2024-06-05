import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddCustomerForm extends JFrame {
	private JLabel titleLabel;

	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnGotoHome;

	private JLabel ContactID, Name, PhoneNumber, Company, Salary, BDay;

	private JTextField TxTContactID, TxTName, TxTPhoneNumber, TxTCompany, TxTSalary, TxTBDay;

	AddCustomerForm() {
		setSize(500, 400);
		setTitle("Add Customer Form");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);

		titleLabel = new JLabel("Add Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("", 1, 30));
		add("North", titleLabel);

		// ===================================Lables========================================
		JPanel labelPanel = new JPanel(new GridLayout(8, 1));

		ContactID = new JLabel("ContactID");
		ContactID.setFont(new Font("", 1, 20));
		labelPanel.add(ContactID);

		Name = new JLabel("Name");
		Name.setFont(new Font("", 1, 20));
		labelPanel.add(Name);

		PhoneNumber = new JLabel("Contact Number");
		PhoneNumber.setFont(new Font("", 1, 20));
		labelPanel.add(PhoneNumber);

		Company = new JLabel("Company Name");
		Company.setFont(new Font("", 1, 20));
		labelPanel.add(Company);

		Salary = new JLabel("Salary");
		Salary.setFont(new Font("", 1, 20));
		labelPanel.add(Salary);

		BDay = new JLabel("BirthDay");
		BDay.setFont(new Font("", 1, 20));
		labelPanel.add(BDay);
		
		BDay = new JLabel("");
		BDay.setFont(new Font("", 1, 20));
		labelPanel.add(BDay);

		BDay = new JLabel("");
		BDay.setFont(new Font("", 1, 20));
		labelPanel.add(BDay);

		add("West", labelPanel);

		// ===================================Text Feilds========================================
		JPanel textPanel = new JPanel(new GridLayout(8, 1));
		// ===========================================================================
		TxTContactID = new JTextField(6);
		TxTContactID.setFont(new Font("", 1, 20));
		JPanel contactIDTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		contactIDTextPanel.add(TxTContactID);
		textPanel.add(contactIDTextPanel);
		// ===========================================================================
		TxTName = new JTextField(15);
		TxTName.setFont(new Font("", 1, 20));
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(TxTName);
		textPanel.add(nameTextPanel);
		// ===========================================================================
		TxTPhoneNumber = new JTextField(15);
		TxTPhoneNumber.setFont(new Font("", 1, 20));
		JPanel phonenumberTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		phonenumberTextPanel.add(TxTPhoneNumber);
		textPanel.add(phonenumberTextPanel);
		// ===========================================================================
		TxTCompany = new JTextField(15);
		TxTCompany.setFont(new Font("", 1, 20));
		JPanel addressTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressTextPanel.add(TxTCompany);
		textPanel.add(addressTextPanel);

		// ===========================================================================
		TxTSalary = new JTextField(10);
		TxTSalary.setFont(new Font("", 1, 20));
		JPanel salaryTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryTextPanel.add(TxTSalary);
		textPanel.add(salaryTextPanel);
		// ===========================================================================
		TxTBDay = new JTextField(10);
		TxTBDay.setFont(new Font("", 1, 20));
		JPanel BDayTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		BDayTextPanel.add(TxTBDay);
		textPanel.add(BDayTextPanel);


						add("Center", textPanel);

// ===================================Buttons========================================
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		btnAdd = new JButton("ADD Contact");
		btnAdd.setFont(new Font("", 1, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = TxTContactID.getText();
				String name = TxTName.getText();
				String PhoneNumber = TxTPhoneNumber.getText();
				String Company = TxTCompany.getText();
				double salary = Double.parseDouble(TxTSalary.getText());
				String birthday = TxTBDay.getText();
				Customer customer = new Customer(id, name, PhoneNumber, Company, birthday, salary);
				CustomerMainForm.customerList.add(customer);

				JFrame Jmassage=new JFrame();
				JOptionPane.showMessageDialog(Jmassage,"Contact Saved Successfully....");   


			}
		});

		buttonPanel.add(btnAdd);

		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("", 1, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTContactID.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
			}
		});
		buttonPanel.add(btnCancel);
		textPanel.add(buttonPanel);
		

		JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
		btnGotoHome = new JButton("Back To HomePage");
		btnGotoHome.setFont(new Font("", 1, 20));
		btnGotoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				AddCustomerForm.this.dispose();
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTContactID.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
			}
		});
		buttonPanel1.add(btnGotoHome);
		textPanel.add(buttonPanel1);
	}
}

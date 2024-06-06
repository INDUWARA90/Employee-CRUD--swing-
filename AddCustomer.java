import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class AddCustomerForm extends JFrame {
	
	// ===================Create lable=====================
	private JLabel titleLabel;
	private JLabel ContactID, Name, PhoneNumber, Company, Salary, BDay;

	// ===================Create buttons=====================
	private JButton btnAdd,btnCancel,btnGotoHome;
	private JTextField TxTName, TxTPhoneNumber, TxTCompany, TxTSalary, TxTBDay;

	// ===================Constructer buttons=====================
	AddCustomerForm() {
		setSize(500, 400);
		setTitle("Add Customer Form");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);

		//===================Heading Section=========================
        JPanel HeadingCountainner = new JPanel(new GridLayout(2, 0));

        JLabel titleLabel = new JLabel("ADD CONTACT");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("", 1, 30));

		ContactID = new JLabel("Contact-ID-"+createContactID());
		ContactID.setFont(new Font("", 1, 20));
		add(ContactID);
        
		HeadingCountainner.add(titleLabel);
		HeadingCountainner.add(ContactID);
		add("North",HeadingCountainner);
		
     

		// ===================================Create Lables========================================
		JPanel labelPanel = new JPanel(new GridLayout(7, 1));


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


		// ==================Text Feilds======================================
		
			JPanel textPanel = new JPanel(new GridLayout(7, 1));
		

		// ===================Name======================================
		TxTName = new JTextField(15);
		TxTName.setFont(new Font("", 1, 20));
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(TxTName);
		textPanel.add(nameTextPanel);
	
	
		// ===================Phone number======================================
		TxTPhoneNumber = new JTextField(15);
		TxTPhoneNumber.setFont(new Font("", 1, 20));
		JPanel phonenumberTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		phonenumberTextPanel.add(TxTPhoneNumber);
		textPanel.add(phonenumberTextPanel);
		
		
		// ===================Company Name======================================
		TxTCompany = new JTextField(15);
		TxTCompany.setFont(new Font("", 1, 20));
		JPanel addressTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressTextPanel.add(TxTCompany);
		textPanel.add(addressTextPanel);


		// ===================Salary======================================
		TxTSalary = new JTextField(10);
		TxTSalary.setFont(new Font("", 1, 20));
		JPanel salaryTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryTextPanel.add(TxTSalary);
		textPanel.add(salaryTextPanel);


		// ===================Birth Day======================================
		TxTBDay = new JTextField(10);
		TxTBDay.setFont(new Font("", 1, 20));
		JPanel BDayTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		BDayTextPanel.add(TxTBDay);
		textPanel.add(BDayTextPanel);


			add("Center", textPanel);



		// ===================================Buttons=========================
		
				JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		// ===================ADD CONTACT BUTTON======================================		
		btnAdd = new JButton("ADD Contact");
		btnAdd.setFont(new Font("", 1, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (createContactID().equals("") ||TxTName.getText().equals("") ||TxTPhoneNumber.getText().equals("") ||TxTCompany.getText().equals("") ||TxTSalary.getText().equals("") ||TxTBDay.getText().equals("") ) {
					JFrame Jmassage=new JFrame();
					JOptionPane.showMessageDialog(Jmassage,"Please Enter Details ALL..");   

				}else{
					//===============================Create Variables to store Textfilde values=====================================
					JFrame massage=new JFrame();
					double salary=0.0;
					String name = TxTName.getText();
					String PhoneNumber = "";
					String Company = TxTCompany.getText();
					String birthday = "";


					//===============================Validate BirthDay=====================================
					if (isValidBirthday(TxTBDay.getText())) {
						birthday=TxTBDay.getText();
					
					}else{JOptionPane.showMessageDialog(massage,"Please Enter Correct Birth Day...");}
					
					
					//===============================Validate Salary=====================================
					if (isValidSalary(Double.parseDouble(TxTSalary.getText()))) {
						salary=Double.parseDouble(TxTSalary.getText());

					}else{JOptionPane.showMessageDialog(massage,"Please Enter Correct Salary...");}


					//===============================Validate Phone Number=====================================
					if (validphonenumber(TxTPhoneNumber.getText())) {
						PhoneNumber = TxTPhoneNumber.getText();
					}else{JOptionPane.showMessageDialog(massage,"Please Enter Correct PhoneNumber...");}


					//===============================insert into database=====================================
					if (validphonenumber(TxTPhoneNumber.getText()) && isValidSalary(Double.parseDouble(TxTSalary.getText())) && isValidBirthday(TxTBDay.getText()) && name!=null && createContactID()!=null && Company!= null ) {
						Customer customer = new Customer(createContactID(), name, PhoneNumber, Company, birthday, salary);
						CustomerMainForm.customerList.add(customer);
						
						JOptionPane.showMessageDialog(massage,"Contact Saved Successfully....");   
					}

				}
				
			}
		});
		buttonPanel.add(btnAdd);


		// ===================CANCEL BUTTON======================================
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("", 1, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
			}
		});
		buttonPanel.add(btnCancel);
		textPanel.add(buttonPanel);
		JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	

		// ===================Back To HomePage BUTTON======================================
		btnGotoHome = new JButton("Back To HomePage");
		btnGotoHome.setFont(new Font("", 1, 20));
		btnGotoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				AddCustomerForm.this.dispose();
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
			}
		});
		buttonPanel1.add(btnGotoHome);
		textPanel.add(buttonPanel1);

	}

	    // ---------------valid phone number---------------------------------------
		public static boolean validphonenumber(String p1) {
			boolean isValid = true;
	
			for (int i = 1; i < p1.length(); i++) {
				if (!(p1.charAt(i) == '0' || p1.charAt(i) == '1' || p1.charAt(i) == '2' || p1.charAt(i) == '3'
						|| p1.charAt(i) == '4' || p1.charAt(i) == '5' || p1.charAt(i) == '6' || p1.charAt(i) == '7'
						|| p1.charAt(i) == '8' || p1.charAt(i) == '9')) {
					isValid = false;
				}
			}
			if (p1.length() > 10) {
				isValid = false;
			}
			if (p1.length() < 10) {
				isValid = false;
			}
			if (p1.charAt(0) != '0') {
				isValid = false;
			}
			return isValid;
		}
	
		// --------------------------to valid Salary--------------------------------
		public static boolean isValidSalary(double salary){
			return salary>0;
		}
		// --------------------------------to valid B'day----------------------------
		public static boolean isValidBirthday(String BDay) {
	
			if (BDay.length() < 10) {
				return false;
			}
			String year = "";
			String month = "";
			String day = "";
			year += BDay.charAt(0) + "" + BDay.charAt(1) + "" + BDay.charAt(2) + "" + BDay.charAt(3);
			month += BDay.charAt(5) + "" + BDay.charAt(6);
			day += BDay.charAt(8) + "" + BDay.charAt(9);
	
			int DAY = Integer.parseInt(day);
			int MONTH = Integer.parseInt(month);
			int YEAR = Integer.parseInt(year);
	
			if (YEAR < 1800 || YEAR > 2024) {
				return false;
			}
	
			if (MONTH < 1 || MONTH > 12) {
				return false;
			}
	
			if (DAY < 1 || DAY > 31) {
				return false;
			}
	
			if ((MONTH == 4 || MONTH == 6 || MONTH == 9 || MONTH == 11) && MONTH > 30) {
				return false;
			}
	
			if (MONTH == 2) {
				if ((YEAR % 4 == 0 && YEAR % 100 != 0)) {
					if (DAY > 29) {
						return false;
					}
				} else {
					if (DAY > 28) {
						return false;
					}
				}
			}
	
			return true;
		}
	
		public static String createContactID() {
			String ContactID = "";
			int temp = customerList.size();
			ContactID = "C00" + (temp + 1);
			if (temp <= 8) {
				ContactID = "C00" + 00 + (temp + 1);
			}
			if (temp >= 99) {
				ContactID = "C0" + (temp + 1);
			}
			return ContactID;
		}
}

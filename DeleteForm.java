import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

class DeleteForm extends JFrame{
	
	//======================Create Jbuttons==============================
    private JButton btndelete,btnCancel,btnGotoHome,Serach;

	//======================Create JLables==============================
	private JLabel ContactID, Name, PhoneNumber, Company, Salary, BDay;
	
	//======================Create JTextFiled==============================
	private JTextField TxTContactID, TxTName, TxTPhoneNumber, TxTCompany, TxTSalary,TxTBDay,Searchbox;
    
	//======================Constructer==============================
	DeleteForm(){
    setSize(600, 550);
    setTitle("Update Employee Form");
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setLocationRelativeTo(null);  

        JPanel HeadingCountainner = new JPanel(new GridLayout(2, 0));
		HeadingCountainner.setBackground(new Color(66, 188, 245));

        JLabel titleLabel = new JLabel("Delete CONTACT");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("", 1, 30));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 4, 10, 4));


        HeadingCountainner.add(titleLabel);
    
        JPanel labelPanel1 = new JPanel(new GridLayout(1, 2));
		labelPanel1.setBorder(BorderFactory.createEmptyBorder(20, 4, 10, 4));

    	// ================================Search Box======================================
		Searchbox=new JTextField(15);
        Searchbox.setFont(new Font("", 1, 20));
		JPanel SerachboxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Searchbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TxTBDay.setVisible(true);
				TxTCompany.setVisible(true);
				TxTContactID.setVisible(true);
				TxTName.setVisible(true);
				TxTPhoneNumber.setVisible(true);
				TxTSalary.setVisible(true);
		
			}
		});
		SerachboxPanel.add(Searchbox);
		labelPanel1.add(SerachboxPanel);

		//======================Search button==============================
        Serach=new JButton("Search");
		Serach.setBackground(Color.WHITE);
		Serach.setFocusable(false);
        JPanel SerachPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Serach.setFont(new Font("", 1, 20));
		Serach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TxTBDay.setVisible(true);
				TxTCompany.setVisible(true);
				TxTContactID.setVisible(true);
				TxTName.setVisible(true);
				TxTPhoneNumber.setVisible(true);
				TxTSalary.setVisible(true);
				int index=DBConnection.getInstance().getCustomerList().searchByNameOrPhoneNumber(Searchbox.getText());
				if (index!=-1) {
					String Contactid=DBConnection.getInstance().getCustomerList().get(index).getContactID();
					String Name=DBConnection.getInstance().getCustomerList().get(index).getName();
					String PhoneNumber=DBConnection.getInstance().getCustomerList().get(index).getPhoneNumber();
					String Company=DBConnection.getInstance().getCustomerList().get(index).getCompany();
					String birthday=DBConnection.getInstance().getCustomerList().get(index).getBDay();
					String salary = Double.toString(DBConnection.getInstance().getCustomerList().get(index).getSalary());

					TxTContactID.setText(Contactid);
					TxTBDay.setText(birthday);
					TxTCompany.setText(Company);
					TxTName.setText(Name);
					TxTPhoneNumber.setText(PhoneNumber);
					TxTSalary.setText(salary);

					setSize(600, 600);

					TxTContactID.setEditable(false);
					TxTContactID.setBackground(Color.white);

					TxTBDay.setEditable(false);
					TxTBDay.setBackground(Color.white);

					TxTCompany.setEditable(false);
					TxTCompany.setBackground(Color.white);

					TxTName.setEditable(false);
					TxTName.setBackground(Color.white);

					TxTPhoneNumber.setEditable(false);
					TxTPhoneNumber.setBackground(Color.white);

					TxTSalary.setEditable(false);
					TxTSalary.setBackground(Color.white);

				}else{
					JFrame J=new JFrame();
					JOptionPane.showMessageDialog(J,"Contact is not in database....");   
				}
				

				
			}
		});

		SerachPanel.add(Serach);
        labelPanel1.add(SerachPanel);

        add(labelPanel1);

        HeadingCountainner.add(labelPanel1);
        add("North",HeadingCountainner);

		// ===================================Lables========================================
		JPanel labelPanel = new JPanel(new GridLayout(8, 1));

		ContactID = new JLabel("	     ContactID");
		ContactID.setFont(new Font("", 1, 18));
		labelPanel.add(ContactID);

		Name = new JLabel("     Name");
		Name.setFont(new Font("", 1, 18));
		labelPanel.add(Name);

		PhoneNumber = new JLabel("     Contact Number");
		PhoneNumber.setFont(new Font("", 1, 18));
		labelPanel.add(PhoneNumber);

		Company = new JLabel("     Company Name");
		Company.setFont(new Font("", 1, 18));
		labelPanel.add(Company);

		Salary = new JLabel("     Salary");
		Salary.setFont(new Font("", 1, 18));
		labelPanel.add(Salary);

		BDay = new JLabel("     BirthDay");
		BDay.setFont(new Font("", 1, 18));
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
		
		//======================ContactID TextF==============================
		TxTContactID = new JTextField(6);
		TxTContactID.setFont(new Font("", 1, 20));
		JPanel contactIDTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		contactIDTextPanel.add(TxTContactID);
		TxTContactID.setVisible(false);

		textPanel.add(contactIDTextPanel);


		//======================Name TextF==============================
		TxTName = new JTextField(15);
		TxTName.setFont(new Font("", 1, 20));
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTName.setVisible(false);
		nameTextPanel.add(TxTName);

		textPanel.add(nameTextPanel);


		//======================Phone Number TextF==============================
		TxTPhoneNumber = new JTextField(15);
		TxTPhoneNumber.setFont(new Font("", 1, 20));
		JPanel phonenumberTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTPhoneNumber.setVisible(false);
		phonenumberTextPanel.add(TxTPhoneNumber);

		textPanel.add(phonenumberTextPanel);


		//======================Company Name TextF==============================
		TxTCompany = new JTextField(15);
		TxTCompany.setFont(new Font("", 1, 20));
		JPanel addressTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTCompany.setVisible(false);
		addressTextPanel.add(TxTCompany);

		textPanel.add(addressTextPanel);

		
		//======================Salary TextF==============================
		TxTSalary = new JTextField(10);
		TxTSalary.setFont(new Font("", 1, 20));
		JPanel salaryTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTSalary.setVisible(false);
		salaryTextPanel.add(TxTSalary);

		textPanel.add(salaryTextPanel);


		//======================BirthDay TextF==============================
		TxTBDay = new JTextField(10);
		TxTBDay.setFont(new Font("", 1, 20));
		JPanel BDayTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTBDay.setVisible(false);
		BDayTextPanel.add(TxTBDay);

		textPanel.add(BDayTextPanel);


			add("Center", textPanel);

		// ===================================Buttons========================================
		
			JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		//======================Delete Buttons==============================	
		btndelete = new JButton("Delete Contact");
		btndelete.setBackground(Color.WHITE);
		btndelete.setFocusable(false);
		btndelete.setFont(new Font("", 1, 20));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int index=DBConnection.getInstance().getCustomerList().searchByNameOrPhoneNumber(Searchbox.getText());
				if (index!=-1) {	
					
					DBConnection.getInstance().getCustomerList().removeElement(index);
					
					JFrame Jmassage=new JFrame();
                    JOptionPane.showMessageDialog(Jmassage,"Contact is Deleted!"); 
					 
					TxTBDay.setText("");
					TxTCompany.setText("");
					TxTContactID.setText("");
					TxTName.setText("");
					TxTPhoneNumber.setText("");
					TxTSalary.setText("");
					Searchbox.setText("");

					TxTBDay.setVisible(false);
					TxTCompany.setVisible(false);
					TxTContactID.setVisible(false);
					TxTName.setVisible(false);
					TxTPhoneNumber.setVisible(false);
					TxTSalary.setVisible(false);

					setSize(600, 530);
					
				}else{
					JFrame Jmassage=new JFrame();
					JOptionPane.showMessageDialog(Jmassage,"Something Wrong Try Again!");  
				}
				
			}
		});

		buttonPanel.add(btndelete);

		//======================Cancel Buttons==============================	
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFocusable(false);
		btnCancel.setFont(new Font("", 1, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTContactID.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
				Searchbox.setText("");

				
				TxTBDay.setVisible(false);
				TxTCompany.setVisible(false);
				TxTContactID.setVisible(false);
				TxTName.setVisible(false);
				TxTPhoneNumber.setVisible(false);
				TxTSalary.setVisible(false);

			}
		});
		buttonPanel.add(btnCancel);
		textPanel.add(buttonPanel);
		
		JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	

		//======================Back To Home Buttons==============================	
		btnGotoHome = new JButton("Back To HomePage");
		btnGotoHome.setFont(new Font("", 1, 20));
		btnGotoHome.setBackground(Color.WHITE);
		btnGotoHome.setFocusable(false);
		btnGotoHome.setPreferredSize(new Dimension(280, 35));
		btnGotoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				DeleteForm.this.dispose();
				TxTBDay.setText("");
				TxTCompany.setText("");
				TxTContactID.setText("");
				TxTName.setText("");
				TxTPhoneNumber.setText("");
				TxTSalary.setText("");
				Searchbox.setText("");

				
				TxTBDay.setVisible(false);
				TxTCompany.setVisible(false);
				TxTContactID.setVisible(false);
				TxTName.setVisible(false);
				TxTPhoneNumber.setVisible(false);
				TxTSalary.setVisible(false);

			}
		});		
		buttonPanel1.add(btnGotoHome);
		textPanel.add(buttonPanel1);


    }
}

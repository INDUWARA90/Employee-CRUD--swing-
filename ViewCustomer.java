import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ViewCustomerForm extends JFrame{

	//======================Create Tables==============================	
	private Table1 table1;
	private Table2 table2;
	private Table3 table3;
	
	//======================Create Jlabel==============================	
		private JLabel titleLabel;
	
	//======================Create JButtons==============================	
		private JButton btnListByName,btnListBySalary,btnListByBirthday,btnCancel; 
	
	//======================Create Constructer==============================		
	ViewCustomerForm(){
		setSize(600,380);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel HedrePanel=new JPanel(new GridLayout(1,0));
		HedrePanel.setBackground(new Color(66, 188, 245));

		titleLabel=new JLabel("View Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 4, 10, 4));
		HedrePanel.add(titleLabel);

		add("North",HedrePanel);

		
		
	//=================BUTTONS SECTION==============================	 
		
		JPanel Container=new JPanel(new GridLayout(3,0));
		Container.setBorder(BorderFactory.createEmptyBorder(20, 4, 10, 4));

		//======================Create List by Name JButtons==============================	
		btnListByName=new JButton("List by Name");
		btnListByName.setPreferredSize(new Dimension(300,35));
		btnListByName.setBackground(Color.WHITE);
		btnListByName.setFocusable(false);
		 JPanel btnListByNamebuttonPanel=new JPanel();
		 btnListByName.setFont(new Font("",1,20));
		 btnListByName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(table1==null|| table1!=null){
					table1=new Table1();
				}
				table1.setVisible(true);
				ViewCustomerForm.this.dispose();
				
			}
			
		});
		btnListByNamebuttonPanel.add(btnListByName);
		Container.add(btnListByNamebuttonPanel);
		
		
		//======================Create List by Salary JButtons==============================	
		btnListBySalary=new JButton("List by Salary");
		btnListBySalary.setPreferredSize(new Dimension(300,35));
		btnListBySalary.setBackground(Color.WHITE);
		btnListBySalary.setFocusable(false);
		JPanel btnListBySalarybuttonPanel=new JPanel();
		btnListBySalary.setFont(new Font("",1,20));

		btnListBySalary.addActionListener(new ActionListener(){
	   	public void actionPerformed(ActionEvent evt){
	
			   if(table2==null||table2!=null){
				table2=new Table2();
			}
			table2.setVisible(true);
			ViewCustomerForm.this.dispose();
			
	   	}
	   });
	   btnListBySalarybuttonPanel.add(btnListBySalary);
	   Container.add(btnListBySalarybuttonPanel);


	   	//======================Create List by Birthday JButtons==============================	
		 btnListByBirthday=new JButton("List by Birthday");
		 btnListByBirthday.setPreferredSize(new Dimension(300,35));
		 btnListByBirthday.setBackground(Color.WHITE);
		 btnListByBirthday.setFocusable(false);
		 JPanel btnListByBirthdaybuttonPanel=new JPanel();
		 btnListByBirthday.setFont(new Font("",1,20));

		 btnListByBirthday.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				if(table3==null||table3!=null){
					table3=new Table3();
				}
				table3.setVisible(true);
				ViewCustomerForm.this.dispose();
				
			}
		});
		btnListByBirthdaybuttonPanel.add(btnListByBirthday);
		Container.add(btnListByBirthdaybuttonPanel);	
		
		add("Center",Container);
		
		
		//======================Create Cancel JButtons==============================	
		btnCancel=new JButton("Cancel");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFocusable(false);
		btnCancel.setSize(new Dimension(80, 50));
		JPanel btnCancelPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnCancel.setFont(new Font("",1,18));

	    btnCancel.addActionListener(new ActionListener(){
	   	public void actionPerformed(ActionEvent evt){
	   		ViewCustomerForm.this.dispose();
	   	}
	   });
	   	btnCancelPanel.add(btnCancel);
		add("South",btnCancelPanel);

	}



}

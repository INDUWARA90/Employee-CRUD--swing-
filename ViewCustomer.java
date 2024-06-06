import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("View Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
		
	//=================BUTTONS SECTION==============================	 
		
		JPanel Container=new JPanel(new GridLayout(3,0));

		//======================Create List by Name JButtons==============================	
		btnListByName=new JButton("List by Name");
		 JPanel btnListByNamebuttonPanel=new JPanel();
		 btnListByName.setFont(new Font("",1,20));
		 btnListByName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(table1==null){
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
		JPanel btnListBySalarybuttonPanel=new JPanel();
		btnListBySalary.setFont(new Font("",1,20));
		btnListBySalary.addActionListener(new ActionListener(){
	   	public void actionPerformed(ActionEvent evt){
	
			   if(table2==null){
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
		 JPanel btnListByBirthdaybuttonPanel=new JPanel();
		 btnListByBirthday.setFont(new Font("",1,20));
		 btnListByBirthday.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				if(table3==null){
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

	//=====================Method Remove All Recodes=========================

}

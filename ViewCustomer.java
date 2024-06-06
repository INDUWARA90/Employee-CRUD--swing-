import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class ViewCustomerForm extends JFrame{
	// private JTable tblCustomerDetails;
	// private DefaultTableModel dtm;

	private Table table;
	private JLabel titleLabel;
	
	private JButton btnListByName,btnListBySalary,btnListByBirthday,btnCancel; 
	ViewCustomerForm(){
		setSize(600,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel=new JLabel("View Customer Form");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("",1,30));
		add("North",titleLabel);
	
	//===========================================================

		// String[] columnsName={"Customer Id","Name","Phone Number","Company Name","Salary","Birthday"};
		// dtm=new DefaultTableModel(columnsName,0);
		
		// tblCustomerDetails=new JTable(dtm);
		
		// JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		
		// add("Center",tablePane);
		
	//===========================================================	 
		
		JPanel Container=new JPanel(new GridLayout(3,0));

		btnListByName=new JButton("List by Name");
		 JPanel btnListByNamebuttonPanel=new JPanel();
		 btnListByName.setFont(new Font("",1,20));
		 btnListByName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(table==null){
					table=new Table();
				}
				table.setVisible(true);
				ViewCustomerForm.this.dispose();
				
			}
			
		});
		btnListByNamebuttonPanel.add(btnListByName);
		Container.add(btnListByNamebuttonPanel);
		
		
		btnListBySalary=new JButton("List by Salary");
		JPanel btnListBySalarybuttonPanel=new JPanel();
		btnListBySalary.setFont(new Font("",1,20));
		btnListBySalary.addActionListener(new ActionListener(){
	   	public void actionPerformed(ActionEvent evt){
	
			   if(table==null){
				table=new Table();
			}
			table.setVisible(true);
			ViewCustomerForm.this.dispose();
			
	   	}
	   });
	   btnListBySalarybuttonPanel.add(btnListBySalary);
	   Container.add(btnListBySalarybuttonPanel);
	   
		 btnListByBirthday=new JButton("List by Birthday");
		 JPanel btnListByBirthdaybuttonPanel=new JPanel();
		 btnListByBirthday.setFont(new Font("",1,20));
		 btnListByBirthday.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){

				if(table==null){
					table=new Table();
				}
				table.setVisible(true);
				ViewCustomerForm.this.dispose();
				
			}
		});
		btnListByBirthdaybuttonPanel.add(btnListByBirthday);
		Container.add(btnListByBirthdaybuttonPanel);	
		
		add("Center",Container);
		
		
		
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
}

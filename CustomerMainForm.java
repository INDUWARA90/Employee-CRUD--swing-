import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CustomerMainForm extends JFrame{
	
	
	
	//=============import Class========================
	private AddCustomerForm addCustomerForm;
	private ViewCustomerForm viewCustomerForm;
	private updateCustomer updateCustomer;
	private SearchForm SearchForm;
	private DeleteForm DeleteForm;

	//=============Create JButtons========================
	private JButton btnAddCustomer,btnSearchCustomer,btnDeleteCustomer,btnUpdateCustomer,btnViewCustomer,btnExit;	
	
	//=============Constructer========================
	CustomerMainForm(){
		setTitle("Customer Mangement System");
		setSize(500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		
        


		// ===================Heading=====================
		JPanel HedrePanel=new JPanel(new GridLayout(3, 1));
		
		JLabel JHEading = new JLabel("Home Page", JLabel.CENTER);
		JHEading.setFont(new Font("Tahoma", Font.BOLD, 30));
		HedrePanel.add(JHEading);

		JLabel label = new JLabel("____________________",JLabel.CENTER);
		label.setForeground(new Color(95, 99, 99));
		label.setFont(new Font("Tahoma", 1, 30));
		
		add(label);

		HedrePanel.add(label);
		
		add("North",HedrePanel);	
		
		// ===================Heading Button Panel=====================
		JPanel buttonPanel=new JPanel(new GridLayout(5,0));


		// ===================Add Contact button=====================
        btnAddCustomer = new JButton("Add New Contact");
		btnAddCustomer.setFont(new Font("",1,15));
		btnAddCustomer.setBackground(Color.WHITE);
		btnAddCustomer.setFocusable(false);
		btnAddCustomer.setPreferredSize(new Dimension(300,35));
		btnAddCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(addCustomerForm==null){
					addCustomerForm=new AddCustomerForm();
					
				}
				addCustomerForm.setVisible(true);
			}
		});
		JPanel addcoustomerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        addcoustomerPanel.add(btnAddCustomer);
        buttonPanel.add(addcoustomerPanel);
	  

		// ===================Update Contact button=====================
		btnUpdateCustomer = new JButton("Update Contact");
		btnUpdateCustomer.setFont(new Font("", 1, 15));
		btnUpdateCustomer.setPreferredSize(new Dimension(300,35));
		btnUpdateCustomer.setFocusable(false);
		btnUpdateCustomer.setBackground(Color.WHITE);
		JPanel addupdatePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnUpdateCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(updateCustomer==null){
					updateCustomer=new updateCustomer();
				}
				updateCustomer.setVisible(true);
			}
		});
        addupdatePanel.add(btnUpdateCustomer);
        buttonPanel.add(addupdatePanel);
        

		// ===================Search Contact button=====================
        btnSearchCustomer = new JButton("Search Contact");
        btnSearchCustomer.setFont(new Font("", 1, 15));
        btnSearchCustomer.setPreferredSize(new Dimension(300,35));
		btnSearchCustomer.setBackground(Color.WHITE);
		btnSearchCustomer.setFocusable(false);
		JPanel addsearchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnSearchCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(SearchForm==null){
					SearchForm=new SearchForm();
				}
				SearchForm.setVisible(true);
			}
		});
        addsearchPanel.add(btnSearchCustomer);
        buttonPanel.add(addsearchPanel);
        

		// ===================Delete Contact button=====================
        btnDeleteCustomer = new JButton("Delete Contact");
        btnDeleteCustomer.setFont(new Font("", 1, 15));
		btnDeleteCustomer.setFocusable(false);
		btnDeleteCustomer.setPreferredSize(new Dimension(300,35));
		btnDeleteCustomer.setBackground(Color.WHITE);
		JPanel adddeletePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnDeleteCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(DeleteForm==null){
					DeleteForm=new DeleteForm();
				}
				DeleteForm.setVisible(true);
			}
		});
        adddeletePanel.add(btnDeleteCustomer);
        buttonPanel.add(adddeletePanel);
      

		// ===================View Contact button=====================
		btnViewCustomer=new JButton("View Customer");
		btnViewCustomer.setFont(new Font("",1,15));
		btnViewCustomer.setFocusable(false);
		btnViewCustomer.setPreferredSize(new Dimension(300,35));
		buttonPanel.add(btnViewCustomer);
		btnViewCustomer.setBackground(Color.WHITE);
        JPanel addviewcoustomerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnViewCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(viewCustomerForm==null){
					viewCustomerForm=new ViewCustomerForm();
				}
				viewCustomerForm.setVisible(true);
			}
		});
        addviewcoustomerPanel.add(btnViewCustomer);
        buttonPanel.add(addviewcoustomerPanel);
		
        add("Center", buttonPanel);
  
	
		// ==============================Exit button=======================================
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("", 1, 15));
		btnExit.setBackground(Color.WHITE);
		btnExit.setFocusable(false);
		btnExit.setPreferredSize(new Dimension(100,35));
		JPanel Exitbutton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
			Exitbutton.add(btnExit);
			add("South", Exitbutton);
		}
		
		

	// ===================MAIN METHOD=====================	
	public static void main(String args[]){
			new CustomerMainForm().setVisible(true);
	
	}
}

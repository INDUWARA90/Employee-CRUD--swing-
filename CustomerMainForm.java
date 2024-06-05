import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class CustomerMainForm extends JFrame{
	
	public static customerList customerList=new customerList();
	
	private AddCustomerForm addCustomerForm;
	private ViewCustomerForm viewCustomerForm;
	private updateCustomer updateCustomer;
	private SearchForm SearchForm;

	private JButton btnAddCustomer;	
	private JButton btnSearchCustomer;	
	private JButton btnDeleteCustomer;	
	private JButton btnUpdateCustomer;	
	private JButton btnViewCustomer;	
	private JButton btnExit;	
	
	CustomerMainForm(){
		setTitle("Customer Mangement System");
		setSize(500,300);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// ===================Heading=====================
		JLabel JHEading = new JLabel("Home Page", JLabel.CENTER);
		JHEading.setFont(new Font("", 1, 30));
		add("North", JHEading);


		JPanel buttonPanel=new JPanel(new GridLayout(5,1));
		
        btnAddCustomer = new JButton("Add New Contact");
		btnAddCustomer.setFont(new Font("",1,15));
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
	  // ================================================================

		btnUpdateCustomer = new JButton("Update Contact");
		btnUpdateCustomer.setFont(new Font("", 1, 15));
        JPanel addupdatePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnUpdateCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(viewCustomerForm==null){
					updateCustomer=new updateCustomer();
				}
				updateCustomer.setVisible(true);
			}
		});
        addupdatePanel.add(btnUpdateCustomer);
        buttonPanel.add(addupdatePanel);
        // ================================================================

        btnSearchCustomer = new JButton("Search Contact");
        btnSearchCustomer.setFont(new Font("", 1, 15));
        JPanel addsearchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btnSearchCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(viewCustomerForm==null){
					SearchForm=new SearchForm();
				}
				SearchForm.setVisible(true);
			}
		});
        addsearchPanel.add(btnSearchCustomer);
        buttonPanel.add(addsearchPanel);
        // ================================================================
        btnDeleteCustomer = new JButton("Delete Contact");
        btnDeleteCustomer.setFont(new Font("", 1, 15));
        JPanel adddeletePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        adddeletePanel.add(btnDeleteCustomer);
        buttonPanel.add(adddeletePanel);
      // ================================================================
		
		btnViewCustomer=new JButton("View Customer");
		btnViewCustomer.setFont(new Font("",1,15));
		buttonPanel.add(btnViewCustomer);
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
    // ==============================Exitbutton=======================================
    btnExit = new JButton("Exit");
    btnExit.setFont(new Font("", 1, 10));
    JPanel Exitbutton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    btnExit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.exit(0);
        }
    });
         Exitbutton.add(btnExit);
         add("South", Exitbutton);
	}
	
	public static void main(String args[]){
		new CustomerMainForm().setVisible(true);
	}
}

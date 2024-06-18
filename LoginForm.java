import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    CustomerMainForm customerMainForm;
    private JLabel Name, Password;

	private TextField TxTName;
	private JButton btnLoging,btnCancel;
	private JCheckBox checkbox;
 
    LoginForm(){
        setSize(650, 500);
		setTitle("BookShop");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

        //===================Heading Section=========================
        JPanel HeadingCountainner = new JPanel(new GridLayout(2, 0));
		JPanel ContactidCountainner = new JPanel(new GridLayout(1, 0));
		HeadingCountainner.setBackground(new Color(66, 188, 245));

		
        JLabel titleLabel = new JLabel("Employe Management System");
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 4, 20, 4));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		HeadingCountainner.add(titleLabel);
		
		
        

		HeadingCountainner.add(ContactidCountainner);
		add("North",HeadingCountainner);
		
     // ===================================Create Lables========================================

		JPanel labelPanel = new JPanel(new GridLayout(5, 1));
		labelPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 4));

		Name = new JLabel("     User Name");
		Name.setFont(new Font("", 1, 18));
		labelPanel.add(Name);

		Password = new JLabel("     Password ");
		Password.setFont(new Font("", 1, 18));
		labelPanel.add(Password);
	

		add("West", labelPanel);


		// ==================Text Feilds======================================
		
			JPanel textPanel = new JPanel(new GridLayout(5, 1));
			textPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 4));


		// ===================User Name======================================
		TxTName = new TextField(15);
		TxTName.setFont(new Font("", 1, 20));
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(TxTName);
		textPanel.add(nameTextPanel);
	
	
		// ===================Passwordr======================================
		TextField TxTxpassword = new TextField(8);
		TxTxpassword.setEchoChar('*');	
		TxTxpassword.setFont(new Font("", 1, 20));
		JPanel TxTxpasswordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		TxTxpasswordPanel.add(TxTxpassword);
		textPanel.add(TxTxpasswordPanel);


		// ===================CheckBox======================================
		JPanel btnPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		checkbox=new JCheckBox("Show Password");
		checkbox.setFocusable(false);
		//=============ACTIONS==========================
		checkbox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (checkbox.isSelected()) {
					TxTxpassword.setEchoChar((char)0);
				}else{
					TxTxpassword.setEchoChar('*');	
				}
			}
		});
		btnPanel1.add(checkbox);
		textPanel.add(btnPanel1);
		
		
		

		// ===================Buttons======================================

		JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		btnLoging=new JButton("Login");
		JPanel btnLogingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btnLoging.setFocusable(false);
		btnLoging.setBackground(Color.WHITE);
		btnLoging.setPreferredSize(new Dimension(100, 35));
		//=============ACTIONS==========================
		btnLoging.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				if (TxTName.getText().equals("induwara") && TxTxpassword.getText().equals("890")) {
					if(customerMainForm==null){
						customerMainForm=new CustomerMainForm();
					}
					customerMainForm.setVisible(true);
					LoginForm.this.dispose();
				}else{
					JFrame Jmassage=new JFrame();
					
					if (!TxTxpassword.getText().equals("890") && !TxTName.getText().equals("induwara" )) {
						JOptionPane.showMessageDialog(Jmassage,"Enter Correct User Name and Password !"); 	
					}else if (!TxTName.getText().equals("induwara") ) {
						JOptionPane.showMessageDialog(Jmassage,"Please Enter Correct User Name !"); 	
					}else if (!TxTxpassword.getText().equals("890") ) {
						JOptionPane.showMessageDialog(Jmassage,"Please Enter Correct Password !"); 	
					}

					
					 
				}
				
			}
		});
		btnLogingPanel.add(btnLoging);
		btnPanel.add(btnLogingPanel);
		textPanel.add(btnPanel);
		


		btnCancel=new JButton("Cancel");
		JPanel btnCancelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		btnCancel.setFocusable(false);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setPreferredSize(new Dimension(100, 35));
		//=============ACTIONS==========================
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				TxTName.setText("");
				TxTxpassword.setText("");
			    LoginForm.this.dispose();
				
			}
		});
		btnCancelPanel.add(btnCancel);
		btnPanel.add(btnCancelPanel);
		textPanel.add(btnPanel);
		add("Center", textPanel);	


    }
    // ===================MAIN METHOD=====================	
    public static void main(String[] args) {
        new LoginForm().setVisible(true);
    }
}

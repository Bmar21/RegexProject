package regex.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import regex.controller.RegexController;

public class RegexPanel extends JPanel 
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JButton Submit;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField phoneNumber;
	private JTextField Email;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel EmailLabel;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		Submit = new JButton("Submit");
		firstName = new JTextField(25);
		lastName = new JTextField(25);
		phoneNumber = new JTextField(25);
		Email = new JTextField(25);
		firstNameLabel = new JLabel();
		lastNameLabel = new JLabel();
		phoneNumberLabel = new JLabel();
		EmailLabel = new JLabel();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(Submit);
		this.add(firstName);
		this.add(lastName);
		this.add(phoneNumber);
		this.add(Email);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(EmailLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}


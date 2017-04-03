package fr.imie.calculator.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorFrame extends JFrame{

	public CalculatorFrame(){
		
		setSize(400, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		
		JMenuItem switchMode = new JMenuItem("Scientist Mode");
		switchMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (switchMode.getText().equals("Scientist Mode")) {
					switchMode.setText("Standard Mode");
				} else {
					switchMode.setText("Scientist Mode");
				}	
			}
		});
		
		menu.add(switchMode);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		JPanel mainFrame = new JPanel(new BorderLayout());
	
		JPanel display = new JPanel(new GridBagLayout());
		JPanel history = new JPanel(new GridBagLayout());
		JPanel buttons = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextField textField = new JTextField(20);
		JLabel operation = new JLabel(" ");
		c.gridy = 0;
		display.add(operation, c);
		c.gridy = 1;
		display.add(textField, c);
		
		//FAIRE APRES L'HISTORIQUE
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setText(operation.getText() + textField.getText() + " + ");
				textField.setText("");
			}
		});
		
		JButton buttonMines = new JButton("-");
		buttonMines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setText(operation.getText() + textField.getText() + " - ");
				textField.setText("");
			}
		});
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setText(operation.getText() + textField.getText() + " * ");
				textField.setText("");
			}
		});
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setText(operation.getText() + textField.getText() + " / ");
				textField.setText("");
			}
		});
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JButton buttonComma = new JButton(",");
		buttonComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ",");
			}
		});
		
		JButton buttonRedo = new JButton("←");
		buttonRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton buttonSquaredRoot = new JButton("√");
		buttonSquaredRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "√");
			}
		});
		
		JButton buttonObliterate = new JButton("C");
		buttonObliterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operation.setText(" ");
			}
		});
		
		JButton buttonSemiObliterate = new JButton("CE");
		buttonSemiObliterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.insets = new Insets(5, 0, 5, 0);
		c.gridx = 4; c.gridy = 4;
		buttons.add(buttonEquals, c);
		c.gridy = 3;
		buttons.add(buttonPlus, c);
		c.gridy = 2;
		buttons.add(buttonMines, c);
		c.gridy = 1;
		buttons.add(buttonMultiply, c);
		c.gridy = 0;
		buttons.add(buttonDivide, c);
		c.gridx = 1;
		buttons.add(buttonObliterate, c);
		c.gridx = 2;
		buttons.add(buttonSemiObliterate, c);
		c.gridx = 3;
		buttons.add(buttonSquaredRoot, c);
		c.gridy = 4; c.gridx = 1;
		buttons.add(buttonRedo, c);
		c.gridx = 3;
		buttons.add(buttonComma,c);
		c.gridx = 2; c.gridy = 4;
		buttons.add(button0, c);
		c.gridx = 1; c.gridy = 3;
		buttons.add(button1,c);
		c.gridx = 2;
		buttons.add(button2, c);
		c.gridx = 3;
		buttons.add(button3, c);
		c.gridx = 1; c.gridy = 2;
		buttons.add(button4,c);
		c.gridx = 2;
		buttons.add(button5, c);
		c.gridx = 3;
		buttons.add(button6, c);
		c.gridx = 1; c.gridy = 1;
		buttons.add(button7,c);
		c.gridx = 2;
		buttons.add(button8, c);
		c.gridx = 3;
		buttons.add(button9, c);
		
		mainFrame.add(display, BorderLayout.NORTH);
		mainFrame.add(history, BorderLayout.EAST);
		mainFrame.add(buttons, BorderLayout.CENTER);
		
		setContentPane(mainFrame);
		setVisible(true);
	}
	
	
}

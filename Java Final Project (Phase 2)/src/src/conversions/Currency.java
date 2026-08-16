package conversions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Currency extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numberField;
	private JTextField outputField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currency frame = new Currency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Currency() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Currency.class.getResource("/resources/currency.png")));
		setTitle("Currency");
		setBounds(100, 100, 395, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Initial Unit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 150, 33);
		contentPane.add(lblNewLabel);
		
		numberField = new JTextField();
		numberField.setBounds(10, 55, 150, 20);
		contentPane.add(numberField);
		numberField.setColumns(10);
		
		final String[] items = {"Select an item", "USD", "CAD", "EUR"};
		JComboBox<String> comboBox = new JComboBox<>(items);
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(10, 86, 150, 22);
		contentPane.add(comboBox);
		
		outputField = new JTextField();
		outputField.setEditable(false);
		outputField.setColumns(10);
		outputField.setBounds(219, 55, 150, 20);
		contentPane.add(outputField);
		
		JLabel convertedUnit = new JLabel("Converted Unit");
		convertedUnit.setHorizontalAlignment(SwingConstants.CENTER);
		convertedUnit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		convertedUnit.setBounds(219, 11, 150, 33);
		contentPane.add(convertedUnit);
		
		JComboBox<String> comboBox_2 = new JComboBox<>(items);
		comboBox_2.setMaximumRowCount(4);
		comboBox_2.setBounds(219, 86, 150, 22);
		contentPane.add(comboBox_2);

		
		JButton convert = new JButton("Convert");
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBox.getSelectedItem().equals("Select an item") || comboBox_2.getSelectedItem().equals("Select an item")) {
					// Do nothing
					
				} // USD to CAD
				else if (comboBox.getSelectedItem().equals("USD") && comboBox_2.getSelectedItem() == "CAD") {
					outputField.setText(USDtoCAD().toString());
					
				} // USD to EUR
				else if (comboBox.getSelectedItem().equals("USD") && comboBox_2.getSelectedItem() == "EUR") {
					outputField.setText(USDtoEUR().toString());
					
				} // CAD to USD
				else if (comboBox.getSelectedItem().equals("CAD") && comboBox_2.getSelectedItem() == "USD") {
					outputField.setText(CADtoUSD().toString());

				} // CAD to EUR
				else if (comboBox.getSelectedItem().equals("CAD") && comboBox_2.getSelectedItem() == "EUR") {
					outputField.setText(CADtoEUR().toString());
					
				} // EUR to USD
				else if (comboBox.getSelectedItem().equals("EUR") && comboBox_2.getSelectedItem() == "USD") {
					outputField.setText(EURtoUSD().toString());
				
				} // EUR to CAD
				else if (comboBox.getSelectedItem().equals("EUR") && comboBox_2.getSelectedItem() == "CAD") {
					outputField.setText(EURtoCAD().toString());
				}
			}
		});
		convert.setFont(new Font("Tahoma", Font.BOLD, 15));
		convert.setBounds(137, 119, 114, 33);
		contentPane.add(convert);
	}
	
	protected Double USDtoCAD() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 1.25;
	}
	
	protected Double USDtoEUR() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 0.91;
	}
	
	protected Double CADtoUSD() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 0.8;
	}
	
	protected Double CADtoEUR() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 0.73;
	}
	
	protected Double EURtoUSD() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 1.1;
	}
	
	protected Double EURtoCAD() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 1.37;
	}
}

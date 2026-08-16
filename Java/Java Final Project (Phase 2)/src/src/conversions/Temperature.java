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

public class Temperature extends JFrame {

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
					Temperature frame = new Temperature();
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
	public Temperature() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Temperature.class.getResource("/resources/temp.png")));
		setTitle("Temperature");
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
		
		final String[] items = {"Select an item", "Fahrenheit", "Celsius", "Kelvin"};
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
					
				} // F to C
				else if (comboBox.getSelectedItem().equals("Fahrenheit") && comboBox_2.getSelectedItem() == "Celsius") {
					outputField.setText(FtoC().toString());
					
				} // F to K
				else if (comboBox.getSelectedItem().equals("Fahrenheit") && comboBox_2.getSelectedItem() == "Kelvin") {
					outputField.setText(FtoK().toString());
					
				} // C to F
				else if (comboBox.getSelectedItem().equals("Celsius") && comboBox_2.getSelectedItem() == "Fahrenheit") {
					outputField.setText(CtoF().toString());

				} // C to K
				else if (comboBox.getSelectedItem().equals("Celsius") && comboBox_2.getSelectedItem() == "Kelvin") {
					outputField.setText(CtoK().toString());
					
				} // K to F
				else if (comboBox.getSelectedItem().equals("Kelvin") && comboBox_2.getSelectedItem() == "Fahrenheit") {
					outputField.setText(KtoF().toString());
				
				} // K to C
				else if (comboBox.getSelectedItem().equals("Kelvin") && comboBox_2.getSelectedItem() == "Celsius") {
					outputField.setText(KtoC().toString());
				}
			}
		});
		convert.setFont(new Font("Tahoma", Font.BOLD, 15));
		convert.setBounds(137, 119, 114, 33);
		contentPane.add(convert);
	}
	
	protected Double FtoC() {
		Double x = Double.parseDouble(numberField.getText());
		return (5.0/9) * (x - 32);
	}
	
	protected Double FtoK() {
		Double x = Double.parseDouble(numberField.getText());
		return (5.0/9) * (x-32) + 273.15;
	}
	
	protected Double CtoF() {
		Double x = Double.parseDouble(numberField.getText());
		return ((9.0/5) * x) + 32;
	}
	
	protected Double CtoK() {
		Double x = Double.parseDouble(numberField.getText());
		return x + 273.15;
	}
	
	protected Double KtoF() {
		Double x = Double.parseDouble(numberField.getText());
		return ((9.0/5) * (x-273.15) + 32);
	}
	
	protected Double KtoC() {
		Double x = Double.parseDouble(numberField.getText());
		return x - 273.15;
	}
}

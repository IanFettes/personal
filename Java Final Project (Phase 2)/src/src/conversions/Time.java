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

public class Time extends JFrame {

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
					Time frame = new Time();
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
	public Time() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Time.class.getResource("/resources/time.png")));
		setTitle("Time");
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
		
		final String[] items = {"Select an item", "Seconds", "Minutes", "Hours"};
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
					
				} // Sec to Min
				else if (comboBox.getSelectedItem().equals("Seconds") && comboBox_2.getSelectedItem() == "Minutes") {
					outputField.setText(StoM().toString());
					
				} // Sec to Hour
				else if (comboBox.getSelectedItem().equals("Seconds") && comboBox_2.getSelectedItem() == "Hours") {
					outputField.setText(StoH().toString());
					
				} // Min to Sec
				else if (comboBox.getSelectedItem().equals("Minutes") && comboBox_2.getSelectedItem() == "Seconds") {
					outputField.setText(MtoS().toString());

				} // Min to Hour
				else if (comboBox.getSelectedItem().equals("Minutes") && comboBox_2.getSelectedItem() == "Hours") {
					outputField.setText(MtoH().toString());
					
				} // Hour to Sec
				else if (comboBox.getSelectedItem().equals("Hours") && comboBox_2.getSelectedItem() == "Seconds") {
					outputField.setText(HtoS().toString());
				
				} // Hour to Min
				else if (comboBox.getSelectedItem().equals("Hours") && comboBox_2.getSelectedItem() == "Minutes") {
					outputField.setText(HtoM().toString());
				}
			}
		});
		convert.setFont(new Font("Tahoma", Font.BOLD, 15));
		convert.setBounds(137, 119, 114, 33);
		contentPane.add(convert);
	}
	
	protected Double StoM() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 1.0/60;
	}
	
	protected Double StoH() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 1.0/3600;
	}
	
	protected Double MtoS() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 60;
	}
	
	protected Double MtoH() {
		Double x = Double.parseDouble(numberField.getText());
		return x / 60;
	}
	
	protected Double HtoS() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 3600;
	}
	
	protected Double HtoM() {
		Double x = Double.parseDouble(numberField.getText());
		return x * 60;
	}
}

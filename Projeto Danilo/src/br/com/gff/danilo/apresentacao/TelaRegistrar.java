package br.com.gff.danilo.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class TelaRegistrar extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JFormattedTextField txfCelular;
	private JFormattedTextField txfFone;
	private JButton btnRegistrar;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistrar frame = new TelaRegistrar();
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
	public TelaRegistrar() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNome = new JPanel();
		contentPane.add(panelNome, BorderLayout.NORTH);
		
		JLabel lblNome = new JLabel("Nome: ");
		panelNome.add(lblNome);
		
		txtNome = new JTextField();
		panelNome.add(txtNome);
		txtNome.setColumns(30);
		
		JPanel panelFone = new JPanel();
		contentPane.add(panelFone, BorderLayout.CENTER);
		panelFone.setLayout(null);
		
		JLabel lblCelular = new JLabel("Celular: ");
		lblCelular.setBounds(87, 11, 90, 14);
		panelFone.add(lblCelular);
		
		txfCelular = new JFormattedTextField();
		try {
			txfCelular = new JFormattedTextField(new MaskFormatter("(##) ##### - ####")); //Padrão brasileiro de placas, 3 letras e 4 números
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false: "Padrão de numero incorreto"; //Caso algo no desenvolvimento de errado, aparecerá o erro para o desenvolvedor
		} 
		txfCelular.setBounds(153, 8, 111, 20);
		txfCelular.setColumns(9);
		panelFone.add(txfCelular);
		
		JLabel lblTelefone_1 = new JLabel("Telefone: ");
		lblTelefone_1.setBounds(87, 36, 90, 14);
		panelFone.add(lblTelefone_1);
		
		txfFone = new JFormattedTextField();
		try {
			txfFone = new JFormattedTextField(new MaskFormatter("(##) #### - ####")); //Padrão brasileiro de placas, 3 letras e 4 números
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false: "Padrão de número incorreto"; //Caso algo no desenvolvimento de errado, aparecerá o erro para o desenvolvedor
		} 
		txfFone.setBounds(153, 36, 111, 20);
		panelFone.add(txfFone);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("registrar");
		btnRegistrar.setBackground(SystemColor.menu);
		btnRegistrar.setBounds(97, 70, 89, 23);
		panelFone.add(btnRegistrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(this);
		btnVoltar.setActionCommand("voltar");
		btnVoltar.setBackground(SystemColor.menu);
		btnVoltar.setBounds(224, 70, 89, 23);
		panelFone.add(btnVoltar);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String cmd = evento.getActionCommand();
		JFrame tela = null;
		if(cmd.equals("registrar")) {
			//TODO implementar método para cadastro
			tela = new TelaPrincipal();
		}else {
			tela = new TelaLogin();
		}
		tela.setVisible(true);
		this.dispose();
	}
}

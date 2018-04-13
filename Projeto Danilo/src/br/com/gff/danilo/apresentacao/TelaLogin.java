package br.com.gff.danilo.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class TelaLogin extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField txpSenha;
	private JButton btnOk;
	private JRadioButton rbtnCriar;
	private JRadioButton rbtnEntrar;
	private JPanel panel_3;
	private JPanel panelRbtn;
	JPanel panelBtn;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		ButtonGroup grupo = new ButtonGroup();

		panelRbtn = new JPanel();
		contentPane.add(panelRbtn, BorderLayout.NORTH);

		rbtnCriar = new JRadioButton("Criar conta");
		panelRbtn.add(rbtnCriar);
		rbtnCriar.setSelected(true);
		grupo.add(rbtnCriar);
		rbtnCriar.addActionListener(this);
		rbtnCriar.setActionCommand("criar");

		rbtnEntrar = new JRadioButton("Entrar");
		panelRbtn.add(rbtnEntrar);
		rbtnEntrar.addActionListener(this);
		rbtnEntrar.setActionCommand("entrar");

		grupo.add(rbtnEntrar);

		panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);

		JLabel lblSenha = new JLabel("Senha:   ");
		lblSenha.setBounds(28, 56, 59, 20);
		panel_3.add(lblSenha);

		txpSenha = new JPasswordField();
		txpSenha.setBounds(97, 56, 246, 20);
		panel_3.add(txpSenha);
		txpSenha.setColumns(30);

		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(22, 11, 65, 20);
		panel_3.add(lblEmail);

		textField = new JTextField();
		textField.setBounds(97, 11, 326, 20);
		panel_3.add(textField);
		textField.setColumns(40);

		panelBtn = new JPanel();
		contentPane.add(panelBtn, BorderLayout.SOUTH);

		btnOk = new JButton("Ok");
		btnOk.setBackground(SystemColor.menu);
		panelBtn.add(btnOk);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String cmd = evento.getActionCommand();
		JFrame tela = null;
		if (cmd.equals("criar")) {
			// TODO implementar código para registrar email e senha no banco de dados
			System.out.println("criar");
		} else if (cmd.equals("entrar")) {
			System.out.println("entrar");
			// TODO implementar código para verificar email e senha, e, caso correto, logar e carregar os dados
		} else if (cmd.equals("ok")) {
			if(rbtnCriar.isSelected()) {
				tela = new TelaRegistrar();
			}else{
				tela = new TelaPrincipal();
			}
		}

		tela.setVisible(true);
		this.dispose();
	}
}

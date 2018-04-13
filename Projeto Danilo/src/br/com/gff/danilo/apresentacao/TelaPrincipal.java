package br.com.gff.danilo.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdicionarTarefa = new JButton("Adicionar tarefa");
		btnAdicionarTarefa.setBackground(SystemColor.menu);
		btnAdicionarTarefa.setBounds(10, 11, 146, 45);
		contentPane.add(btnAdicionarTarefa);
		
		JButton btnRemover = new JButton("Remover tarefa");
		btnRemover.setBackground(SystemColor.menu);
		btnRemover.setBounds(213, 11, 146, 45);
		contentPane.add(btnRemover);
		
		JButton btnEditarTarefa = new JButton("Editar tarefa");
		btnEditarTarefa.setBackground(SystemColor.menu);
		btnEditarTarefa.setBounds(10, 83, 146, 45);
		contentPane.add(btnEditarTarefa);
		
		JButton btnVerLista = new JButton("Ver lista");
		btnVerLista.setBackground(SystemColor.menu);
		btnVerLista.setBounds(213, 81, 146, 45);
		contentPane.add(btnVerLista);
		
		setLocationRelativeTo(null);
	}
}

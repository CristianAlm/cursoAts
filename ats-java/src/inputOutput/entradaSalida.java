package inputOutput;

import javax.swing.JOptionPane;

public class entradaSalida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		int numero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
		letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
		
		JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
		JOptionPane.showMessageDialog(null, "El entero es: "+numero);
		JOptionPane.showMessageDialog(null, "La letra es: "+letra);
		JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
	}

}

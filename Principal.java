/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import javax.swing.JOptionPane;
import model.Veiculo;
public class Principal {
    public static void main(String[] args){
        Veiculo vei1 = new Veiculo();
        
        vei1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite a distancia percorrida: ")));
        vei1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos litros foram gastos: ")));
        
        JOptionPane.showMessageDialog(null,"O consumo de litros foi:" + vei1.getConsumo() + "km/l");
    }
}

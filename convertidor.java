import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class convertidor {
    private JComboBox Acantidad;
    private JComboBox Bcantidad;
    private JTextField cantidad;
    private JButton limpiarButton;
    private JButton salirButton;
    private javax.swing.JPanel JPanel;
    private JButton Convertir;
    private JLabel Cambio;

    String opcion1,opcion2;
    double resultado,dinero;
    public convertidor() {

        Convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                switch (Acantidad.getSelectedIndex()){

                    case 0:
                        switch (Bcantidad.getSelectedIndex()){
                            case 0:
                                //DOLARES
                                //DOLAR - EURO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 0.9233;
                                Cambio.setText(""+resultado);
                                break;
                            case 1:
                                //DOLAR-DOLAR
                                dinero =Double.parseDouble(cantidad.getText());
                                Cambio.setText(""+dinero);
                                break;
                            case 2:
                                //DOLAR-PESO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*4278.63;
                                Cambio.setText(""+resultado);
                                break;
                            case 3:
                                //DOLAR-YENES

                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*133.2961;
                                Cambio.setText(""+resultado);
                                break;
                            case 4:
                                //DOLAR-BOLIVAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*5.773249;
                                Cambio.setText(""+resultado);
                                break;
                        }

                        break;
                    case 1:
                        //EUROS
                        switch (Bcantidad.getSelectedIndex()){
                            case 0:
                                //EURO - EURO
                                dinero =Double.parseDouble(cantidad.getText());
                                Cambio.setText(""+dinero);
                                break;
                            case 1:
                                //EURO-DOLAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*0.97794016;
                                Cambio.setText(""+resultado);
                                break;
                            case 2:
                                //EURO-PESO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*4375.1436 ;
                                Cambio.setText(""+resultado);
                                break;
                            case 3:
                                //EURO-YENES

                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*136.29247;
                                Cambio.setText(""+resultado);
                                break;
                            case 4:
                                //EURO-BOLIVAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*5.9034789;
                                Cambio.setText(""+resultado);
                                break;
                        }
                        break;

                    case 2:
                        //PESOS
                        switch (Bcantidad.getSelectedIndex()){
                            case 0:
                                //PESO - EURO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*4375.14 ;
                                Cambio.setText(""+resultado);
                                break;
                            case 1:
                                //PESO-DOLAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*4278.63 ;
                                Cambio.setText(""+resultado);
                                break;
                            case 2:
                                //PESO-PESO
                                dinero =Double.parseDouble(cantidad.getText());
                                Cambio.setText(""+dinero);
                                break;

                            case 3:
                                //PESO-YENES
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*32.1011;
                                Cambio.setText(""+resultado);
                                break;
                            case 4:
                                //PESO-BOLIVAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*741.113 ;
                                Cambio.setText(""+resultado);
                                break;
                        }

                        break;

                    case 3:
                        //YENES
                        switch (Bcantidad.getSelectedIndex()){
                            case 0:
                                //YEN - EURO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*136.292  ;
                                Cambio.setText(""+resultado);
                                break;
                            case 1:
                                //YEN-DOLAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*133.278 ;
                                Cambio.setText(""+resultado);
                                break;
                            case 2:
                                //YEN-PESO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero*0.0311496;
                                Cambio.setText(""+resultado);
                                break;


                            case 3:
                                //YEN-YENES
                                dinero =Double.parseDouble(cantidad.getText());
                                Cambio.setText(""+dinero);
                                break;
                            case 4:
                                //YEN-BOLIVAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 23.0854  ;
                                Cambio.setText(""+resultado);
                                break;
                        }

                        break;
                    case 4:
                        //BOLIVARES
                        switch (Bcantidad.getSelectedIndex()){
                            case 0:
                                //BOLIVAR - EURO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 5.90347  ;
                                Cambio.setText(""+resultado);
                                break;
                            case 1:
                                //BOLIVAR-DOLAR
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 5.77325  ;
                                Cambio.setText(""+resultado);
                                break;
                            case 2:
                                //BOLIVAR-PESO
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 0.00134932 ;
                                Cambio.setText(""+resultado);
                                break;


                            case 3:
                                //BOLIVAR-YENES
                                dinero =Double.parseDouble(cantidad.getText());
                                resultado= dinero* 0.0433174   ;
                                Cambio.setText(""+resultado);
                                break;

                            case 4:
                                //BOLIVAR-BOLIVAR
                                dinero =Double.parseDouble(cantidad.getText());
                                Cambio.setText(""+dinero);
                                break;

                        }
                        break;
                }
            }
        });
        //BOTON LIMPIAR
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cantidad.setText("");
                Cambio.setText("");
            }
        });

        //BOTON SALIR
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    //FUNCION MAIN
    public static void main(String[] args) {
        JFrame frame= new JFrame("CONVERTIDOR DE DIVISAS");
        frame.setContentPane(new convertidor().JPanel);
        frame.setTitle("CONVERTIDOR DE DIVISAS");
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package IU;

import IU.Eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame {
    private Label LblNombre;
    private TextField txtNombre;
    private Button btnNombre;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        LblNombre = new Label("Nombre: ");
        this.add(LblNombre);
        txtNombre = new TextField(30);
        this.add(txtNombre);
        btnNombre = new Button("Saludar");
        //btnNombre.addMouseListener(new EventosRaton());
        btnNombre.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println( txtNombre.getText() );
                JOptionPane.showMessageDialog(null, "Buenos diaas " + txtNombre.getText());

            }
        });

        this.add(btnNombre);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
        this.setSize(800, 600);

    }

}

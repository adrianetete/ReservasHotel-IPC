package view.utils;

/**
 * Clase <code>DatePicker</code> que crea una vista con un calendario
 * donde el usuario puede ir viendo todas las fechas y seleccionar
 * mas facil la que quiera.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.*;
 
public class DatePicker{
    
    private static final int DECREMENT = -1;
    private static final int INCREMENT = 1;
    
    private static final String[] HEADER_DAYS = { "Do", "Lu", "Ma", "Mie", "Ju", "Vi", "Sa" };

    GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
    JLabel jLabelMonthYear = new JLabel("", JLabel.CENTER);
    int day;
    JDialog dialog;
    JButton[] button = new JButton[42];
    JLabel[] labels = new JLabel[7];
            
 
    /**
     * Constructor de la clase <code>DatePicker</code>
     */
    public DatePicker() {
        gregorianCalendar.set(GregorianCalendar.DAY_OF_MONTH, 1);

        dialog = new JDialog();
        dialog.setModal(true);
        //String[] header = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };

        JPanel calendario = new JPanel(new GridLayout(7, 7));
        calendario.setPreferredSize(new Dimension(150, 150));

        for (int i = 0; i < labels.length; i++){
            labels[i] = new JLabel();
            labels[i].setText(HEADER_DAYS[i]);
            labels[i].setAlignmentX(JLabel.CENTER_ALIGNMENT);
            labels[i].setAlignmentY(JLabel.CENTER_ALIGNMENT);

            labels[i].setForeground(Color.red);
            calendario.add(labels[i]);
        }
        for (int i = 0; i < button.length; i++) {
            final int selection = i;
            button[i] = new JButton();
            button[i].setFocusPainted(false);
            button[i].setBackground(Color.white);
            button[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try{
                        day = Integer.valueOf(button[selection].getText());
                        dialog.dispose();
                    } catch(NumberFormatException ignorado){}
                }
            });
            calendario.add(button[i]);
        }
        JPanel controls = new JPanel(new GridLayout(1, 4));
        JPanel header = new JPanel(new GridLayout(2, 1));

        // Last year button
        JButton lastYear = new JButton("<<");
        lastYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                gregorianCalendar.add(GregorianCalendar.YEAR, DECREMENT);
                displayDate();
            }
        });
        controls.add(lastYear);

        // Previous month button
        JButton previous = new JButton("<");
        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                gregorianCalendar.add(GregorianCalendar.MONTH, DECREMENT);
                displayDate();
            }
        });
        controls.add(previous);

        // Next month button
        JButton next = new JButton(">");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                gregorianCalendar.add(GregorianCalendar.MONTH, INCREMENT);
                displayDate();
            }
        });
        controls.add(next);

        // Next year button
        JButton nextYear = new JButton(">>");
        nextYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                gregorianCalendar.add(GregorianCalendar.YEAR, INCREMENT);
                displayDate();
            }
        });
        controls.add(nextYear);
        
        header.add(controls,BorderLayout.NORTH);
        header.add(jLabelMonthYear,BorderLayout.SOUTH);

        dialog.add(header, BorderLayout.NORTH);
        dialog.add(calendario, BorderLayout.CENTER);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        displayDate();
        dialog.setVisible(true);
    }
    
    /**
     * Muestra la fecha.
     */
    public void displayDate() {
        for (int x = 0; x < button.length; x++) {
            button[x].setText("");
        }
        
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM 'de' yyyy");
        
        int dayOfWeek = gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK);
        int daysInMonth = gregorianCalendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

        for (int x = dayOfWeek-1, day = 1; day <= daysInMonth; x++, day++) {
            button[x].setText("" + day);
        }

        jLabelMonthYear.setText(sdf.format(gregorianCalendar.getTime()));
        dialog.setTitle("Date Picker");
        dialog.revalidate();
        dialog.repaint();
    }
 
    /**
     * Establece como fecha, la seleccionada.
     * @return 
     */
    public GregorianCalendar setPickedDate() {
        // Set the return date format
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
        gregorianCalendar.set(GregorianCalendar.DAY_OF_MONTH, day);
        return gregorianCalendar;
    }
}


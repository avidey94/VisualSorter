
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Avi
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImagePanel imagePanel = null;
        try {
            BufferedImage in = ImageIO.read(this.getClass().getResource("java.jpg"));
            imagePanel = new ImagePanel(in);
            //this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(this.getClass().getResource("/Images/endPit1.png"))))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        final JPanel mainFrame = imagePanel;

        JButton insertionSort = new JButton("Insertion Sort");
        JButton mergeSort = new JButton("Merge Sort");

        mainFrame.add(insertionSort);
        mainFrame.add(mergeSort);
        setSize(200, 200);
        setContentPane(mainFrame);
        setVisible(true);
        

        insertionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int VALUES_LENGTH = 1000;
                int FRAME_WIDTH = 1000;
                int FRAME_HEIGHT = 300;
                JFrame frame = new JFrame();

//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ArrayComponent panel = new ArrayComponent();

                frame.add(panel, BorderLayout.CENTER);

                frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

                frame.setVisible(
                        true);

                Double[] values = new Double[VALUES_LENGTH];
                for (int i = 0;
                        i < values.length;
                        i++) {
                    values[i] = Math.random() * panel.getHeight();
                }
                Runnable r = new InsertionSorter(values, panel);
                Thread t = new Thread(r);

                t.start();
            }
        });
        
        mergeSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int VALUES_LENGTH = 1000;
                int FRAME_WIDTH = 1000;
                int FRAME_HEIGHT = 300;
                JFrame frame = new JFrame();

//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ArrayComponent panel = new ArrayComponent();

                frame.add(panel, BorderLayout.CENTER);

                frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

                frame.setVisible(
                        true);

                Double[] values = new Double[VALUES_LENGTH];
                for (int i = 0;
                        i < values.length;
                        i++) {
                    values[i] = Math.random() * panel.getHeight();
                }
                Runnable r = new MergeSorter(values, panel);
                Thread t = new Thread(r);

                t.start();
            
            }
        });
    }
    
    
}

/**
 *
 * @author Avi
 */
public class AnimationTester
{
   private static final int VALUES_LENGTH = 1000;
   private static final int FRAME_WIDTH = 1000;
   private static final int FRAME_HEIGHT = 300;
   
   public static void main(String[] args)
   {
//      JFrame frame = new JFrame();
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      
//      ArrayComponent panel = new ArrayComponent();
//      frame.add(panel, BorderLayout.CENTER);
//      
//      frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
//      frame.setVisible(true);
//      
//      Double[] values = new Double[VALUES_LENGTH];
//      for(int i = 0; i < values.length; i ++)
//      {
//         values[i] = Math.random() * panel.getHeight();
//      }
//      
//      Runnable r = new MergeSorter(values, panel);
//      Thread t = new Thread(r);
//      t.start();
//      
       MainFrame mainframe = new MainFrame();
       
       mainframe.setVisible(true);
   }
   
}

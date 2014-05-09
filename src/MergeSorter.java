import java.util.*;
/**
 *
 * @author Avi
 */
public class MergeSorter implements Runnable
{
   private Double[] values;
   private ArrayComponent panel;
   private static final int DELAY = 2;

   public MergeSorter(Double[] values, ArrayComponent panel)
   {
      this.values = values;
      this.panel = panel;
   }
   @Override
   public void run()
   {
      Comparator<Double> comp = new Comparator<Double>(){

         @Override
         public int compare(Double d1, Double d2)
         {
            panel.setValues(values,d1,d2);
            try
            {
               Thread.sleep(DELAY);
            }
            catch (InterruptedException exception)
            {
               exception.printStackTrace();
            }
            return (d1).compareTo(d2);
         }
         
      };
      
      Sorter.mergeSort(values,0,values.length-1,comp);
//      Sorter.insertionSort(values, comp);
      panel.setValues(values, null,null);
     
   }

    private void jumbleValues(Double[] values) {
        
    }
   
   
}

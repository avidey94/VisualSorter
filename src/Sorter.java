
import java.util.*;
/**
 *
 * @author Avi
 */
public class Sorter
{
   public static<E> void mergeSort(E[] a, int start, int stp, Comparator<? super E> comp)
   {
      if(start == stp) {
          return;
      }
      int mid = (start + stp)/2;
      mergeSort(a, start, mid, comp);
      mergeSort(a, mid+1, stp, comp);
      merge(a, start, mid, stp, comp);
   }
   
   private static <E> void merge(E[] a, int from,int mid, int to, Comparator<? super E> comp)
   {
      int l = from; int r = mid+1;

      if(comp.compare(a[mid], a[r])<=0)
      {
         return;
      }
      
      while(l <= mid && r <= to)
      {
         if(comp.compare(a[l], a[r])<=0)
         {
            l++;
         }
         else
         {
            E temp = a[r];
            System.arraycopy(a, l, a, l+1, r-l);
            a[l] = temp;
            l++; mid++; r++;
         }
      }
   }
   
   public static <E> void insertionSort(E[] a, Comparator<? super E> comp)
   {
      int j;
      for(int i = 0; i < a.length; i ++)
      {
         j = i;
         while(j > 0 && comp.compare(a[j-1], a[j]) > 0)
         {
            E temp = a[j-1];
            a[j-1] = a[j];
            a[j] = temp;
//            Sorter.swap(a[j-1],a[j]);
            j--;
         }
         
      }
   }
   
   
   public static <E> void swap(E a, E b)
   {
      E temp = a;
      a = b;
      b = temp;
   }
}

import java.util.Arrays;
public class Quicksort{
    public int[] quick(int[] list, int low, int high){
        if(low>=high) return list;
        int[] D = new int[list.length];
        for(int i=0; i<low; i++){
            D[i]=list[i];
        }
        for(int i=high+1; i<list.length; i++){
            D[i]=list[i];
        }
        int pivot = list[low];
        int nlow = low;
        int nhigh = high;
        for(int i=low+1; i<=high; i++){
            if(list[i]<pivot){
                D[nlow]=list[i];
                nlow++;
            }else{
                D[nhigh]=list[i];
                nhigh--;
            }
        }
        D[nlow]=pivot;
        D=quick(D, nlow+1, high);
        D=quick(D, low, nlow-1);
        return D;
    }
    public static void main(String[] args){
        int[] l = {20, 13, 16, 14, 18, 11, 19, 15, 12, 17};
        System.out.println(Arrays.toString(l));
        Quicksort q = new Quicksort();
        System.out.println(Arrays.toString(q.quick(l, 0, l.length-1)));
    }
}

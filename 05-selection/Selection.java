public class Selection{
    public int select(int[] list, int index_desired, int low, int high){
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
        if(nlow==index_desired){
            return pivot;
        }else if(nlow<index_desired){
            return select(D, index_desired, nlow+1, high);
        }else{
            return select(D, index_desired, low, nlow-1);
        }
    }
    public static void main(String[] args){
        int[] l = {20, 13, 16, 14, 18, 11, 19, 15, 12, 17};
        Selection s = new Selection();
        System.out.println(s.select(l, 5, 0, l.length-1));
    }
}

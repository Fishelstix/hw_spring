public class Selection(){
    private int[] list;
    public Selection(int list){
        this.list=list;
    }
    public int[] pivot(int SI, int EI){
        int[] D = new int[list.length];
        for(int i=0; i<SI; i++){
            D[i]=list[i];
        }
        for(int i=EI; i<list.length; i++){
            D[i]=list[i];
        }
        int p = list[SI];
        for(int i=SI+1; i<EI; i++){
            if(list[i]<p){
                D[SI]=list[i];
                SI++;
            }else{
                D[EI-1]=list[i];
                EI--;
            }
        }
        D[SI]=p;
        return D;
    }
}

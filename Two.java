import java.util.*;

class Two {
    public static boolean pair2sum(ArrayList<Integer> arr, int target){
        int n = arr.size();
        int bp = -1;
        for(int i=0;i<n;i++){
            if(arr.get(i)>arr.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = (bp+1);
        int rp = bp;
        while(lp!=rp){
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }
            if(arr.get(lp)+arr.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 16;
        System.out.println(pair2sum(arr,target));
    }

}
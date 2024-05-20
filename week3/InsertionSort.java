package week3;

public class InsertionSort {
    public static void main(String[] args) {
        int [] data = {5,30,12,15,27,13,27,48,42,54,24,58,90};
        System.out.println("Data sebelum diurutkan");
        tampildata(data);
        Insertionsort(data);
        
        System.out.println("Data setelah diurutkan");
        tampildata(data);
    }
    public static void tampildata(int [] data){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    public static void Insertionsort(int [] data){
        int n = data.length;
        int v,j;
        for (int i = 1; i < n; i++){
            v = data[i];
            j = i-1;
            while (j > 0 && data[j] > v){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = v;
        }
    }

}
    
    


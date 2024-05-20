package week3;

public class BubbleSort {

    public static void main(String[] args) {
        int [] data = {5,30,12,15,27,13,27,48,42,54,24,58,90};
        System.out.println("Data sebelum diurutkan");
        tampildata(data);
        bubblesort(data);
        
        System.out.println("Data setelah diurutkan");
        tampildata(data);
    }
    public static void tampildata(int [] data){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    public static void bubblesort(int [] data){
        int n = data.length;
        int temp = 0;
        
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(data[j-1]>data[j]){
                    temp= data[j-1];
                    data[j-1]=data[j];
                    data[j]=temp;
                }
            }
        }
    }
}

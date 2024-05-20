package week3;

public class SelectionSort {
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
        int t = data.length;
        for(int i =0; i<t-1; i++){
            int min = i;
            for(int j=i+1; j<t; j++){
                if(data[j]< data[min]){
                    min=j;
                }
            }
            if(min !=i){
                int temp = data[min];
                data[min] = data[i];
                data[i] = temp;
            }
        }
    }

}

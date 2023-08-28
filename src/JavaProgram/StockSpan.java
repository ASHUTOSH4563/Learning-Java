package JavaProgram;

public class StockSpan {
    public static void Span(int arr[]){
        for(int i=0;i<arr.length;i++){
            int span=1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){
                    span++;
            }
            System.out.print(span+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={13,12,15,14,16,15};
        Span(arr);
    }
}

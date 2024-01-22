package JavaProgram;

public class StockSpan1 {
    public void Span(int arr[]){
        System.out.print(1+" ");
        for(int i=1;i<arr.length;i++){
            int span=1;
            for(int j=i-1;(j>=0) && (arr[j]<=arr[i]);j--){
                span++;
            }
            System.out.print(span+" ");
        }
    }
        public static void main(String args[])
        {
            int arr[]={60,10,20,40,35,30,50,70,65};
            StockSpan1 st=new StockSpan1();
            st.Span(arr);
        }
}

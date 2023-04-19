import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lecture6Exercises {
    public long calculateEvenSum(int[] arr) {
        long ans=0;
        for(int i=0;i<arr.length;i+=2){
            ans+=arr[i];
        }
        return ans;
    }
    public int[] reverseArray(int[] arr) {
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr.length-1-i];
        }
        return ans;
    }
    public double[][] matrixProduct(double[][] a, double[][] b) throws RuntimeException {
        int n=a.length;
        int m=a[0].length;
        int x=b.length;
        int y=b[0].length;
        if(m!=x){
            throw new IllegalArgumentException("Error!");
        }
        double ans[][]=new double[n][y];
        for(int i=0;i<n;i++){
            for(int j=0;j<y;j++){
                for(int l=0;l<m;l++){
                    ans[i][j]+=a[i][l]*b[l][j];
                }
            }
        }
        return ans;
    }
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>>ans=new LinkedList<>();
        int x= names.length;
        int y=names[0].length;
        for(int i=0;i<x;i++){
            List<String>temp=new LinkedList<>();
            for(int j=0;j<y;j++){
                temp.add(names[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer> primeFactors(int n) {
        List<Integer>ans=new LinkedList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0) {
                ans.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return ans;
    }
    public List<String> extractWord(String line) {
        List<String>ans=new LinkedList<>();
        String[] temp=line.split("\\W+");
        for(int i=0;i< temp.length;i++){
            ans.add(temp[i]);
            System.out.println(temp[i]);
        }
        return ans;
    }
}

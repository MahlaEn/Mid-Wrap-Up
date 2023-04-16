import java.util.Arrays;

public class Lecture5Exercises {
    public String weakPassword(int length) {
        String ans ="";
        for(int i=0;i<length;i++){
            ans+='a';
        }
        return ans;
    }
    public String strongPassword(int length) throws Exception {
        if (length <= 2) {
            throw new IllegalArgumentException("Password length must be greater than 2");
        }
        String ans = "#0";
        for(int i=0;i<length-2;i++){
            ans+='a';
        }
        return ans;
    }
    public boolean isFiboBin(int n) {
        int maxn=(int)(1e6);
        boolean is[]=new boolean[maxn];
        int x=1,y=1,biny;
        Arrays.fill(is, Boolean.FALSE);
        is[2]=true;
        while(x+y<maxn){
            y=x+y;//2
            x=y-x;//1
            biny=bin(y);//1
            is[y+biny]=true;//
        }
        return is[n];
    }
    public int bin(int x){
        int cnt=0;
        while(x>0){
            if(x%2==1){
                cnt++;
            }
            x/=2;
        }
        return cnt;
    }
}

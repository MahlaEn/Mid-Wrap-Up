import java.util.Locale;

public class Lecture4Exercises {
    public long factorial(int n) {
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public long fibonacci(int n) {
        long a=1,b=1,ans=1;
        for(int i=3;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
    public String reverse(String word) {
        String ans="";
        for(int i=0;i<word.length();i++){
            ans=word.charAt(i)+ans;
        }
        return ans;
    }
    public boolean isPalindrome(String line) {
        line=line.toUpperCase();
        line=line.replaceAll("\\s","");
        int sz=line.length();
        char a,b;
        for(int i=0;i<=sz/2;i++){
            a=line.charAt(i);
            b=line.charAt(sz-1-i);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public char[][] dotPlot(String str1, String str2) {
        int s1=str1.length();
        int s2=str2.length();
        char[][] c=new char[s1][s2];
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    c[i][j]='*';
                }
                else{
                    c[i][j]=' ';
                }
            }
        }
        return c;
    }
}

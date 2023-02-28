public class permutation {
    public static void permutationfunction(String str,String ans)
    {
        //base
        if(str.length()==0)
        {
            System.out.print(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++)
        {
        char curr=str.charAt(i);
        //'abcde'="ab"+"de"=abde(remove c)
        String newstr=str.substring(0,i)+str.substring(i+1);
        permutationfunction(newstr,ans+curr);
        }

    }
    public static void main(String[] args) {
        String str="abc";
         permutationfunction(str," ");
    }
    
}

public class subsets {
    public static void findsubsets(String str,String ans,int i)
    {
        if(i==str.length())
        {
        if(ans.length()==0)
        {
            System.out.println("null");
        }
        else{
        
            System.out.print(ans);
        }
            return;
        


        }
        
        //recursion
        findsubsets(str,ans+str.charAt(i),i+1);//yes
        findsubsets(str,ans,i+1);//no
        
    }
    public static void main(String[] args) {
        String str="abc";
        String ans=new String(" ");
        int i=0;
        findsubsets(str,ans,i);

    }
    
}

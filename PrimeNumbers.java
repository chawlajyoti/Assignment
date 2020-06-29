public class PrimeNumbers{

     public static void main(String []args){
        System.out.println("First 100 Prime numbers are : ");
        int count=2;
        int total=0;
        
        while(total<100)
        {  
            boolean flag=false;
            
        
            for(int j=2;j<count;j++)
            {
                if(count%j==0)
                {
                    flag=true;
                    break;
                    
                }
                
                
            }
            
            if(!flag)
            {
            System.out.println(count);
            total++;
            
            }
         count++;   
        }
    
     }
}
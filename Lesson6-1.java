package project;

import java.io.*;
class Main {
    
    public static void main(String[] args) throws IOException
   {
        System.out.println("시험 점수를 입력하십시오.(0으로 종료)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int res=0;
        int sum=0;

        while(true)
        {

            String str =br.readLine();

            res=Integer.parseInt(str);


           
            sum+=res;
            if(res==0)
            {
            	break;
            }
        }
        System.out.println("시험점수의 합계는"+sum+"입니다.");
    }

}	
            
            
  
        
        
        
    

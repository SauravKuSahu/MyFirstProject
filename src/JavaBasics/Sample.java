package JavaBasics;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S= "TESTING";
        char[] arrayOfString= S.toCharArray();
        int lengthOfString= arrayOfString.length;
             
        
        for (int i=0; i<lengthOfString; i++)
         {
        	int count=1;
             for(int j=i+1; j<lengthOfString; j++){
                 if (arrayOfString[i]==(arrayOfString[j])){
                     count+=1;
                     arrayOfString[j]=0;
                 }
             }
             
             if (arrayOfString[i]!=0){
                 System.out.println("Character " + arrayOfString[i]+ " is repeated " + count+ " times" );
             }
        }
    }
}


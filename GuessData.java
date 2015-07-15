package java3;
import java.util.*;
import java.util.regex.Pattern;
public class GuessData {
	public static boolean isNumeric(String str){
		   for(int i=str.length();--i>=0;){
		      int chr=str.charAt(i);
		      if(chr<48 || chr>57)
		         return false;
		   }
		   return true;
		}
	public static int guess(int x){
		int min=0,max=100,mid;
		int count=0;
		while(min<=max){
			count++;
			mid=(min+max)/2;
			if(x<mid)
				max=mid-1;
			else if(x>mid)
				{
				min=mid+1;
				}
			else
				break;
			
		}	
		return count;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s;
		do{
			System.out.printf("������һ��100���ڵ�������");
			Scanner data=new Scanner(System.in);
		    String Data=data.next();
		    while(isNumeric(Data)){
		       if(Integer.valueOf(Data)<0||Integer.valueOf(Data)>100){
			      System.out.print("�����������,����������100���ڵ�������");
			      Data=data.next();
		       }
		       int sum=GuessData.guess( Integer.valueOf(Data));
		       System.out.println(Data+"�Ĳ��Ҵ���Ϊ��"+sum); 
		       break;
		       
		    }
		    System.out.println("�Ƿ�������룿yes or no");
		    s=input.next();
		}while(s.equals("yes"));
		
	}

}
import java.util.*;
class Main{
public int count_occurance(String str1,String str2)
{
int count = 0;
int j = 0;
int i = 0;
while(i < str1.length())
{
   while(j < str2.length())
   {
     if(str1.charAt(i) == str2.charAt(j))
      {
      j++;
      i++;
      }
    else
     {
      i++;
      j = 0;
      break;
     }
   }
  if(j == str2.length())
  {
   count = count + 1;
  }
j = 0;
}
return count;
}



public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine(); 
String str2 = sc.nextLine();
Main obj = new Main();
System.out.println(obj.count_occurance(str1,str2)); 
}}
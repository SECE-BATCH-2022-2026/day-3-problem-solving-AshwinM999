import java.io.*;
class prog4{
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);

		String inp = sc.readLine();
		Integer n = Integer.parseInt(sc.readLine());
		System.out.println(UserMainCode.repeatFront(inp,n));
		br.close();
	}
}

class UserMainCode {
	public static String repeatFront (String inp,Integer n){
		int l = inp.length();
		if(l == 0){
			return inp;
		} else if(l<3){
			String res ="";
			for(int i=1;i<=n;i++){
				res += inp;
			}
			return res;
		} else {
			String res ="";
			String inp1 = inp.substring(0,3); 
			for(int i=1;i<=n;i++){
				res += inp1;
			}
			return res;
		}
	}
} 

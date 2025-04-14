import java.util.HashMap;
public class Roman
{
	public static void main(String[] args) {
	    int ans = 0 ;
		String s ="XVI";
		HashMap<String,Integer> hm =  new HashMap<String,Integer>();
		hm.put("I",1);
		hm.put("V",5);
		hm.put("X",10);
		char[] s2 = s.toCharArray();
		for(int i=0;i<s2.length;i++){
		    String temp = String.valueOf(s2[i]);
		    System.out.println("第"+i+"個字母是"+temp);
		    ans = ans + hm.get(temp);
		}
		System.out.println(ans);
	}
}

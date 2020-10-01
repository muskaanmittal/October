package ANA;


	public class Anagram {
		public static void main(String[] args) {
		
			String a="aaabdd" ;
			String b="badada";
			boolean ang= true;
			int al[] = new int[256];
			int bl[] = new int[256];
			for(char c : a.toCharArray())
			{ int index= (int)c;
			al[index]++;			
			}
			for(char d : b.toCharArray())
			{ int index1= (int)d;
			bl[index1]++;			
			}
			for(int i=0;i<256;i++)
				{if(al[i] != bl[i])
				{
					ang=false;
					break;
				}}
			if(ang)
				System.out.println("Anagram");
			else
				System.out.println("not Anagram");
		}

	}

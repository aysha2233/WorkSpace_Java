

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ive {
	public void length(String str)
	{   String stk1="",stf="";
	    String stk="9D7F6I";
		while(str.length()!=stk1.length())
		{
			int l=str.length()-stk1.length();
			if(l<0)
			{
				int x=stk.length()-str.length();
				stk1=stk1+stk.substring(0,x);
			}
			if(l>=stk.length())
			{
				stk1=stk1+stk;
			}
			else  
			{
				stk1=stk1+stk.substring(0,l);
			}
			}
		char []te=str.toCharArray();
		char []key=stk1.toCharArray();
        ive ve=new ive();
        
		for(int i=0;i<te.length;i++)
		{
			int x=ve.con(te[i]);
			int y=ve.con(key[i]);
			stf=stf+ve.map(x,y);
			
		}
		System.out.println("After improved_Vigenere_encryption cp is :");
		System.out.println(stf);
		System.out.println();
		base_64 base=new base_64();
		base.conversion(stf);
		
	}
	public int con(char ch)
	{
		int x=0;
		if(ch=='A')x=0;
		else if(ch=='B')x=1;
		else if(ch=='9')x=2;
		else if(ch=='C')x=3;
		else if(ch=='8')x=4;
		else if(ch=='D')x=5;
		else if(ch=='E')x=6;
		else if(ch=='7')x=7;
		else if(ch=='F')x=8;
		else if(ch=='6')x=9;
		else if(ch=='G')x=10;
		else if(ch=='H')x=11;
		else if(ch=='5')x=12;
		else if(ch=='I')x=13;
		else if(ch=='4')x=14;
		else if(ch=='J')x=15;
		else if(ch=='K')x=16;
		else if(ch=='3')x=17;
		else if(ch=='L')x=18;
		else if(ch=='2')x=19;
		else if(ch=='M')x=20;
		else if(ch=='N')x=21;
		else if(ch=='1')x=22;
		else if(ch=='O')x=23;
		else if(ch=='P')x=24;
		else if(ch=='0')x=25;
		else if(ch=='Q')x=26;
		else if(ch=='R')x=27;
		else if(ch=='S')x=28;
		else if(ch=='T')x=29;
		else if(ch=='U')x=30;
		else if(ch=='V')x=31;
		else if(ch=='W')x=32;
		else if(ch=='X')x=33;
		else if(ch=='Y')x=34;
		else if(ch=='Z')x=35;
		return x;
	}	
	
	
	
	
	public char map(int x,int y)
	{
		
	char[][]va= {
	{'A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z'},		
	{'B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A'},
	{'9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B'},
	{'C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9'},
	{'8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C'},
	{'D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8'},
	{'E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D'},
	{'7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E'},
	{'F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7'},
	{'6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F'},
	{'G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6'},
	{'H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G'},
	{'5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H'},
	{'I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5'},
	{'4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I'},
	{'J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4'},
	{'K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J'},
	{'3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K'},
	{'L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3'},
	{'2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L'},
	{'M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2'},
	{'N','1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M'},
	{'1','O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N'},
	{'O','P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1'},
	{'P','0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O'},
	{'0','Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P'},
	{'Q','R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0'},
	{'R','S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q'},
	{'S','T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R'},
	{'T','U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S'},
	{'U','V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T'},
	{'V','W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U'},
	{'W','X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V'},
	{'X','Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W'},
	{'Y','Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X'},
	{'Z','A','B','9','C','8','D','E','7','F','6','G','H','5','I','4','J','K','3','L','2','M','N','1','O','P','0','Q','R','S','T','U','V','W','X','Y'},
	
	
	};
		
	char c=va[x][y];
	return c;
	}
		      
	

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter text :");
		String str=br.readLine();
		ive ve =new ive();
		ve.length(str);
		}

}

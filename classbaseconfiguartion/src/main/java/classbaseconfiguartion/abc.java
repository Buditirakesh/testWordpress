package classbaseconfiguartion;
	import java.util.*;
	import java.lang.*;
	import java.io.*;

	/* Complexity O(n*n!) */
	class abc
	{
		public static ArrayList<String> strPerm(String str, ArrayList<String> list){
			int len = str.length();
			if(len==1){
				list.add(str);
				return list;
			}
			
			list = strPerm(str.substring(0,len-1),list);
			int ls = list.size();
			char ap = str.charAt(len-1);
			for(int i=0;i<ls;i++){
				String temp = list.get(i);
				int tl = temp.length();
				for(int j=0;j<=tl;j++){
					list.add(temp.substring(0,j)+ap+temp.substring(j,tl));	
				}
			}
			
			while(true){
				String temp = list.get(0);
				if(temp.length()<len)
					list.remove(temp);
				else
					break;
			}
			
			return list;
		}
		
		public static void main (String[] args) throws java.lang.Exception
		{
			String str = "abcd";
			ArrayList<String> list = new ArrayList<String>();
			
			list = strPerm(str,list);
			System.out.println("Total Permutations : "+list.size());
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
				
		}
	}


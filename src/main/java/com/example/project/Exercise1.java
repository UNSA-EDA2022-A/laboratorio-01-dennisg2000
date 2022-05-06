package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		int[] numeros;
		numeros=arr(a);
		
		int rpta=0;
		String res;
		if(comp(numeros)==true) {
			for(int j=0,k=numeros.length;j<numeros.length;j++,k--) {
				rpta+=numeros[j]*(Math.pow(2,k)-1);
				
			}
			return res=Integer.toString(rpta);
		}else return "El numero proporcionado no esta en base Gabriel.";
	}
	public int[] arr(int a) {
		 String nums=Integer.toString(a);
		 int[] conv= new int[nums.length()];
		 for(int i=0;i<nums.length();i++) {
			 conv[i]=Character.getNumericValue(nums.charAt(i));
		 }
		 return conv;
	 }
	 
	 public boolean comp(int[] p) {
		 boolean verif=false;
		 boolean limit=false;
		 for(int k=0;k<p.length;k++) {
			 if(limit== false) {
				 if((p[k]==0 || p[k]==1))
					 verif=true;
				 else if(p[k]==2) {
					 limit=true;
					 verif=true;}
			 }else if(p[k]!=0)
				 verif=false;
			 	 
		 }
		 return verif;
	 }
}

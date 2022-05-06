package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int pos=0-1,saltos=0,poscon=0,temp=0,ind=0;
		boolean estado=false;
		while(estado==false ) {			
			for(int k=pos+1;k<a.length  && (a[k]-poscon)<=50;k++) {
			pos=k;
			temp=a[k];
			}
			poscon=temp; 
			saltos++;
			if(pos==6) break;
			ind++;
			if(ind==6 )
			estado=true;
		}
		if(poscon>=a[a.length-1])
			return saltos;
		else return -1;
	}
}

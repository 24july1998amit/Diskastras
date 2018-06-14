package com.hackercode;

import java.util.Scanner;

public class driver {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int inf=999,n=5;
int sptSet[]=new int[5];
int visited[]=new int[5];

int graph[][]=new int[n][n];
System.out.println("enter graph");
for(int i=0;i<n;i++) {
	sptSet[i]=0;
	visited[i]=0;
	for(int j=0;j<n;j++) {
		graph[i][j]=scan.nextInt();
		if(graph[i][j]<=0) {
			graph[i][j]=inf;
			
		}
}
}

	for(int i=0;i<n;i++) {
		Dijkastras.dij(graph,visited,inf,i);
		visited[i]=0;
		}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			System.out.print(graph[i][j]+" ");
		}
		System.out.println();
	}
	}

}

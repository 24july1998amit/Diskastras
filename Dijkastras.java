package com.hackercode;

public class Dijkastras {
	
	public static void dij(int graph[][],int visited[],int inf,int src) {
		int n=5,v=0;
		int distance[]=new int[5];
		visited[src]=1;
		distance=graph[src];
		distance[src]=0;
		for(int i=0;i<n;i++) {
		inf=999;
		visited[i]=0;
		for(int j=0;j<n;j++) {
			if(inf>distance[j] &&visited[j]!=1) {
				inf=distance[j];
				v=j;
				
			}
		}
	visited[v]=1;
	for(int j=0;j<n;j++) {
		if((inf+graph[j][v]<distance[j] )&& visited[j]!=1) {
			distance[j]=inf+graph[j][v];
		}
		}
		}
	for(int j=0;j<n;j++) {
		graph[src][j]=distance[j];
	}
	}

}

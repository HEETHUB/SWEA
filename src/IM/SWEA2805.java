package IM;

import java.util.Scanner;

public class SWEA2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[][] farm = new int[N][N];
			
			for (int i=0; i<N; i++) {
				String nums = sc.next();
				for (int j =0; j < N; j++) {
					int n = nums.charAt(j) - '0';
					farm[i][j] = n;
				}
			}
			
			int ans = 0;
			int mid = N/2;
				
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int d = Math.abs(mid - i);
					int startIdx = d;
					int endIdx = N-d-1;
					if (j >= startIdx&& j <= endIdx)
						ans += farm[i][j];
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

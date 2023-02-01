package IM;

import java.util.Scanner;

public class SWEA12712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] L = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					L[i][j] = sc.nextInt();
				}
			}
			
			int[] crossR = {-1, 1, 0, 0};
			int[] crossC = {0, 0, -1, 1};
			int[] diagR = {-1, 1, -1, 1};
			int[] diagC = {-1, -1, 1, 1};
			
			int res = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int cur = L[i][j];
					for (int k = 0; k < 4; k++) {
						for (int m = 1; m < M; m++) {
							int nr = i + crossR[k]*m;
							int nc = j + crossC[k]*m;
							if (nr>=0&&nr<N&&nc>=0&&nc<N) cur += L[nr][nc];
						}
					}
					if (cur > res) 
						res = cur;
		
					cur = L[i][j];
					for (int k = 0; k < 4; k++) {
						for (int m = 1; m < M; m++) {
							int nr = i + diagR[k]*m;
							int nc = j + diagC[k]*m;
							if (nr>=0&&nr<N&&nc>=0&&nc<N) cur += L[nr][nc];
						}
					}
					if (cur > res) 
						res = cur;
				}
			}
			
			System.out.printf("#%d %d", t, res);
		}
		
	}
}

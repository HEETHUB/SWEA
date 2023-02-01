package IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] tb = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int  j = 0; j < N; j++) {
					tb[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0 ; j < N; j++) {
					if (tb[i][j] == 1) {
						int r = i;
						int c = j;
						int cntC = 0;
						int cntR = 0;
						while (c < N && tb[i][c] == 1) {
							if (j-1>=0 && tb[i][j-1] == 1) 
								break;
							cntC++;
							c++;
						}
						
						while (r < N && tb[r][j] == 1) {
							if (i-1>=0 && tb[i-1][j] == 1) 
								break;
							cntR++;
							r++;
						}
						if (cntC == K) {
							cnt++;
//							System.out.println(i+" "+j);
						}
						if (cntR == K) {
							cnt++;
//							System.out.println(i+" "+j);
						}
					}
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

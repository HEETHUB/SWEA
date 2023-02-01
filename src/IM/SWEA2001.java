package IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t=1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] tb = new int[N][N];
			
			for (int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j =0; j<N; j++) {
					tb[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int res = 0;
			for (int i = 0; i < N-(M-1); i++) {
				for (int j = 0; j < N-(M-1); j++) {
					int cur = 0;
					for (int r = 0; r < M; r++) {
						for (int c = 0; c < M; c++) {
							cur += tb[i+r][j+c];
						}
					}
					if (cur > res) res = cur;
				}
			}
			
			System.out.println("#"+t+" "+res);
		}
	}
}

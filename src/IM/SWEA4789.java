package IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA4789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String people = br.readLine();
			int N = people.length();
			int[] line = new int[N];
			
			for (int i = 0 ; i < N; i++) {
				int n = people.charAt(i) - '0';
				line[i] = n;
			}
			int ans = 0;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (cnt < i) {
					if(line[i] != 0) {
						ans += i - cnt;
						cnt += i - cnt;
					}
				}
				cnt += line[i];
			}
			
			System.out.println("#"+t+" "+ans);
		}
		
	}
}

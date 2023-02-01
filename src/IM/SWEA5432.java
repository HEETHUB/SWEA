package IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA5432 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String input = br.readLine();
			
			int cnt = 0;
			int ans = 0;
			
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '(') cnt += 1;
				else {
					if (input.charAt(i-1) == '(') ans += --cnt;
					else {
						ans += 1;
						cnt--;
					}
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

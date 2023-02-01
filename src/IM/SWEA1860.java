package IM;


import java.util.Arrays;
import java.util.Scanner;

public class SWEA1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			
			int[] people = new int[N];
			for (int i = 0; i < N; i++) {
				people[i] = sc.nextInt();
			}
			
			String res = "Possible";
			Arrays.sort(people);
//			System.out.println(Arrays.toString(people));
			int cnt = 0;
			int idx = 0;
			for (int i = 0; i <= people[N-1]; i++) {

				if (i>0&&i%M == 0) 
					cnt += K;
				
				while (idx<N) {
					if (people[idx] == i) {
						cnt--;
						idx++;
					}
					else break;
				}
				if (cnt < 0) res = "Impossible";
			}
			System.out.println("#"+t+" "+res);
		}
	}
}


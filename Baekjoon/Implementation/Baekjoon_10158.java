// Baekjoon_10158 개미

// Solution by wYuYw - BufferedReader와 StringBuilder를 쓰지 않을 경우 시간초과

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		
		// find result
		int width = (p + t) % (2 * w);
		int height = (q + t) % (2 * h);
		if(width > w) width = w - (width - w);
		if(height > h) height = h - (height - h);
		sb.append(width); sb.append(" "); sb.append(height);
		System.out.print(sb.toString());
	}
}

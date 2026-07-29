import java.util.*;

public class Main {
    
    // 시간 mid로 r마리가 정찰 가능한지 확인
    static boolean canPatrol(List<Long> active, int r, long mid) {
        int count = 1;  // 개미 수
        long start = active.get(0);  // 첫 번째 개미 출발점
        
        for (int i = 1; i < active.size(); i++) {
            if (active.get(i) - start > mid) {
                count++;  // 새 개미 필요!
                start = active.get(i);  // 새 출발점
                if (count > r) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        Map<Integer, Long> houseMap = new TreeMap<>();
        houseMap.put(0, 0L);
        int nextNum = 1;

        for (int i = 0; i < t; i++) {
            int cmd = sc.nextInt();

            if (cmd == 100) {
                int n = sc.nextInt();
                for (int j = 0; j < n; j++) {
                    long pos = sc.nextLong();
                    houseMap.put(nextNum, pos);
                    nextNum++;
                }

            } else if (cmd == 200) {
                long p = sc.nextLong();
                houseMap.put(nextNum, p);
                nextNum++;

            } else if (cmd == 300) {
                int q = sc.nextInt();
                houseMap.remove(q);

            } else if (cmd == 400) {
                int r = sc.nextInt();

                List<Long> active = new ArrayList<>();
                for (long h : houseMap.values())
                    if (h > 0) active.add(h);
                Collections.sort(active);

                int size = active.size();
                if (r >= size) {
                    System.out.println(0);
                    continue;
                }

                // 이진 탐색!
                long lo = 0;
                long hi = active.get(size-1);
                long ans = hi;

                while (lo <= hi) {
                    long mid = (lo + hi) / 2;
                    if (canPatrol(active, r, mid)) {
                        ans = mid;
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
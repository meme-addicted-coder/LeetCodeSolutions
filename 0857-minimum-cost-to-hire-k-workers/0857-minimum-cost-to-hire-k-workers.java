class Worker {
    double basewage;
    int quality;
    public Worker(double basewage, int quality) {
        this.basewage = basewage;
        this.quality = quality;
    }
}

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        // Calculate and store base wage
        ArrayList<Worker> list = new ArrayList<>();
        int n = quality.length;
        for (int i = 0; i < n; i++) {
            double baseWage = 1.0 * wage[i] / quality[i];
            list.add(new Worker(baseWage, quality[i]));
        }

        // Sort on the basis of base wages
        Collections.sort(list, new Comparator<Worker>() {
            public int compare(Worker w1, Worker w2) {
                if (w1.basewage <= w2.basewage) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        PriorityQueue<Worker> pq = new PriorityQueue<>(new Comparator<Worker>() {
            public int compare(Worker w1, Worker w2) {
                if (w1.quality <= w2.quality) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        double ans = Double.MAX_VALUE;
        int totalQuality = 0;
        for (int i = 0; i < n; i++) {
            pq.offer(list.get(i));
            totalQuality += list.get(i).quality;
            if (pq.size() == k) {
                double cost = totalQuality * list.get(i).basewage;
                ans = Math.min(ans, cost);
                totalQuality -= pq.poll().quality;
            }
        }
        return ans;
    }
}

class Solution {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            queue.offer(num);
        }

        while (queue.size()>1){
            int num1 = queue.poll();
            int num2 = queue.poll();

            if(num1!=num2){
                queue.add(num1-num2);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}

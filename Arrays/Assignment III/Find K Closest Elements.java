class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        
        for(int i = 0; i < arr.length; ++i){
            if(pq.size() < k){
                pq.offer(new int[]{arr[i],Math.abs(arr[i]-x)});
            }else{
                int diff = Math.abs(arr[i]-x);
                if(pq.peek()[1] > diff){
                    pq.poll();
                    pq.offer(new int[]{arr[i],diff});
                }
            }
        }
        
        while(!pq.isEmpty()){
            list.add(pq.poll()[0]);
        }
        
        Collections.sort(list);
        return list;
    }
}
import java.util.*;
public class count_occurence {
  static int countOccurrences(PriorityQueue<Integer> list, int target) {
        int count = 0;
        for (int val : list) {
            if (val == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> record = new PriorityQueue<>();
  PriorityQueue<Integer> r=new PriorityQueue<>(Collections.reverseOrder());
        Scanner scanner = new Scanner(System.in);
  // int min
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<n;i++) {
            String[] str=scanner.nextLine().split(" ");
            if (str[0].equals("Push")) {
                record.add(Integer.parseInt(str[1]));
    r.add(Integer.parseInt(str[1]));
            } else if(str[0].equals("Diff")) {
                if (record.size() == 0) 
    {
                    System.out.println(-1);
                } else 
    {
                    int maxi = r.peek();
                    int mini = record.peek();
                    int diff = maxi - mini;
                    System.out.println(diff);
                    if (maxi == mini) 
     {
                        record.remove(maxi);
      r.remove(maxi);
                    } else 
     {
                        record.remove(maxi);
                        record.remove(mini);
      r.remove(maxi);
      r.remove(mini);
                    }
                }
            } else if (str[0].equals("CountHigh")) 
   {
                if (record.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(countOccurrences(record,r.peek()));
                }
            } else if(str[0].equals("CountLow")) 
   {
                if (record.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(countOccurrences(record, record.peek()));
                }
            }
        }
    }

   
}

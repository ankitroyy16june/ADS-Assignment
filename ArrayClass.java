import java.util.*;
class ArrayClass{
	public static void main(String args[]){
		/*int[] a={1,2,3,4,5,6,7,8,9};
		int index=Arrays.binarySearch(a,4);
		System.out.println(index);
		Arrays.sort(a);
		for(int s:a)
			System.out.println(s);*/
		List<Integer> l=new ArrayList<>();
		l.add(45);
		l.add(89);
		l.add(32);
		l.add(99);
		l.add(12);
		l.add(99);
		l.add(35);
		System.out.println(Collections.max(l));
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println(l);
		System.out.println(Collections.frequency(l,99));
	}
}
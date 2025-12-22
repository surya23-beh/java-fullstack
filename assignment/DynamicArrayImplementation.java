package assignment;
public class DynamicArrayImplementation {
	    private int[] arr;
	    private int size;
	    private int capacity;
	    
	    public DynamicArrayImplementation(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        size = 0;
	    }
	    public void add(int value) {
	        if (size == capacity) {
	            resize();
	        }
	        arr[size] = value;
	        size++;
	    }
	    private void resize() {
	        capacity = capacity + (capacity/2);
	        int[] newArr = new int[capacity];

	        for (int i = 0; i < size; i++) {
	            newArr[i] = arr[i];
	        }

	        arr = newArr;
	        System.out.println("Array resized to capacity: " + capacity);
	    }
	    public void display() {
	        System.out.print("Elements: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        DynamicArrayImplementation da = new DynamicArrayImplementation(3);

	        da.add(10);
	        da.add(20);
	        da.add(30);
	        da.display();

	        da.add(40);
	        da.add(50);
	        da.display();
	    }
	}



// 顺序表的元素类型 int
public class MyArrayList {
	// 属性是什么
	private int[] array;		// 代表的是存在数据的数组
								// array.length 代表的是数组的容量
	private int size;			// 记录顺序表的已有数据个数
	
	// 构造方法
	public MyArrayList() {
		// 1. 申请空间
		array = new int[2];
		// 2. 初始化数据个数
		size = 0;
	}
	
	// 增（重点）
	// 平均 O(1)
	public void pushBack(int element) {
		ensureCapacity();
		array[size++] = element;
	}
	
	public void pushFront(int element) {
		ensureCapacity();
		for (int i = size; i >= 1; i--) {
			array[i]  = array[i - 1];
		}
		
		array[0] = element;
		size++;
	}
	
	public void insert(int index, int element) {
		if (index < 0 || index > size) {
			System.err.println("下标错误");
			return;
		}
		
		ensureCapacity();
		
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}
	
	// 删（重点)
	public void popBack() {
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		array[--size] = 0;
	}
	
	public void popFront() {
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		
		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		
		array[--size] = 0;
	}
	public void earse(int index) {
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		
		if (index < 0 || index >= size) {
			System.err.println("下标错误");
			return;
		}
		
		for (int i = index + 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		
		array[--size] = 0;
	}
	
	// 查
	// 改
	// 打印
	public void print() {
		System.out.println("打印顺序表: 当前容量: " + array.length);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// 保证容量够用，否则进行扩容
	private void ensureCapacity() {
		if (size < array.length) {
			return;
		}
		
		int newCapacity = array.length * 2;
		int[] newArray = new int[newCapacity];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.print();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.print();	// 1 2 3
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list.print();	// 30 20 10 1 2 3
		list.insert(3, 100);
		list.print();	// 30 20 10 100 1 2 3
		list.insert(20, 200);	// 报错
		
		list.earse(2);
		list.earse(2);
		list.print();	// 30 20 1 2 3
		list.popFront();
		list.popFront();
		list.popFront();
		list.print();	// 2 3
		list.popBack();
		list.popBack();
		list.print();	// 空的
		list.popBack();	// 报错
	}
}








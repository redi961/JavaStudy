package Stack;
//simple queue에 대한 성능 비교 실험, 난수를 사용하여 시간 측정
//MinPQ를 구현

final int HeapSize = 1000;
enum Boolean { FALSE, TRUE };

class Element <Type> {
class Element {
public Type key;
public Element() {}
public Element(Type key) :key(key) {}
};

class MaxPQ<Type> {
	public void Insert(const Element<Type>&) = 0;
	public Element<Type>* DeleteMax(Element<Type>&) = 0;
};

class  {
public:
	MaxHeap(int sz = HeapSize)
	{
		MaxSize = sz; n = 0;
		heap = new Element<Type>[MaxSize + 1]; // Don't want to use heap[0]
	};
	void display();
	void Insert(const Element<Type>& x);
	Element<Type>* DeleteMax(Element<Type>&);
private:
	Element<Type>* heap;
	int n; // current size of MaxHeap
	int MaxSize; // Maximum allowable size of MaxHeap
	void HeapEmpty() { cout << "Heap Empty" << "\n"; };
	void HeapFull() { cout << "Heap Full"; };
};

template <class Type>
void MaxHeap<Type>::display()
{
	int i;
	cout << "MaxHeap:: (i, heap[i].key): ";
	for (i = 1; i <= n; i++) cout << "(" << i << ", " << heap[i].key << ") ";
	cout << "\n";
}

template <class Type>
void MaxHeap<Type>::Insert(const Element<Type>& x)
{
	int i;
	if (n == MaxSize) { HeapFull(); return; }
	n++;
	for (i = n; 1; ) {
		if (i == 1) break; // at root
		if (x.key <= heap[i / 2].key) break;
		// move from parent to i
		heap[i] = heap[i / 2];
		i /= 2;
	}
	heap[i] = x;
}

template <class Type>
Element<Type>* MaxHeap<Type>::DeleteMax(Element<Type>& x)
{
	int i, j;
	if (!n) { HeapEmpty(); return 0; }
	x = heap[1]; Element<Type> k = heap[n]; n--;

	for (i = 1, j = 2; j <= n; )
	{
		if (j < n) if (heap[j].key < heap[j + 1].key) j++;
		// j points to the larger child
		if (k.key >= heap[j].key) break;
		heap[i] = heap[j];
		i = j; j *= 2;
	}
	heap[i] = k;
	return &x;
}

int main() {
	int select = 0;
	int data = 0;

	MaxHeap<int> heap(20);
	Element<int> ele;

	Element<int>* deletedEle = nullptr;

	do {
		cout << endl << "Max Tree. Select: 1 insert, 2 display, 3 delete, >=5 exit" << endl;
		cin >> select;
		switch (select) {
		case 1:
			cout << "input value: ";
			cin >> data;
			heap.Insert(Element<int>(data));
			heap.display();
			break;
		case 2:
			heap.display();
			break;
		case 3:
			deletedEle = heap.DeleteMax(ele);
			if (deletedEle != nullptr) {
				cout << "deleted element: " << deletedEle->key << endl;
			}
			cout << "current max heap: " << endl;
			heap.display();
			break;
		case 5:
			exit(1);
			break;

		}
	} while (select < 5);

	return 0;
}

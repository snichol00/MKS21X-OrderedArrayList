public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int StartingCapacity){
    super(StartingCapacity);
  }

  public boolean add(T str){
    int num = 0;
    for (int x = 0; x < size(); x++){
      if (str.compareTo(get(x)) >= 0){
        num = x + 1;
      }
    }
    super.add(num, str);
    return true;
  }

  public void add(int idx, T str){

  }

  public T set(int idx, T str){
    T old = this.get(idx);
    if (this.get(idx - 1).compareTo(str) <= 0 && this.get(idx + 1).compareTo(str) >= 0){
      super.set(idx, str);
    }
    return old;
  }
}

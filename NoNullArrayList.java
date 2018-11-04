import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int StartingCapacity){
    super(StartingCapacity);
  }

  public boolean add(T str){
    if (str == null){
      throw new IllegalArgumentException();
    }
    else{
      super.add(str);
    }
    return true;
  }

  public void add(int idx, T str){
    if (str == null){
      throw new IllegalArgumentException();
    }
    else{
      super.add(idx, str);
    }
  }

  public T set(int idx, T str){
    T old = this.get(idx);
    if (str == null){
      throw new IllegalArgumentException();
    }
    else{
      super.set(idx, str);
    }
    return old;
  }
}

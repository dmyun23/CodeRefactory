package chapter11.replaceExceptionWithPrecheck;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ResourcePool {
    Deque<Resource> available = new ArrayDeque<>();
    List<Resource> allocated = new ArrayList<>();

    public Resource get(){
        Resource result = available.isEmpty() ? Resource.create() : available.pop();
        allocated.add(result);
        return result;
    }
}

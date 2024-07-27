package memento;
import java.util.*;
public class History {
    private List<Memento> mementos = new ArrayList<>();
    private int historyNumber;

    public void addMemento(Memento m) {
        mementos.add(m);
        historyNumber = mementos.size()-1;
    }

    public Memento getMemento() {
        historyNumber --;
        return mementos.get(historyNumber);

    }
}

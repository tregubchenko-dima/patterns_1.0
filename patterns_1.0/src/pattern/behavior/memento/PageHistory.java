package pattern.behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class PageHistory {

    private final List<StateHolder> pageList = new ArrayList<>();

    public StateHolder getPrevPage(StateHolder stateHolder) {
        if (!pageList.isEmpty()) {
            int index = pageList.indexOf(stateHolder);
            if (index != -1 && index != 0){
                return pageList.get(index - 1);
            } else {
                return new StateHolder(0);
            }
        } else {
            return new StateHolder(0);
        }
    }

    public void addPage(StateHolder stateHolder) {
        pageList.add(stateHolder);
    }
}

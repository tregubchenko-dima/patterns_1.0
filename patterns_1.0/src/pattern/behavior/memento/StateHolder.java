package pattern.behavior.memento;

import java.util.Objects;

public class StateHolder {

    private int pageNum;

    public StateHolder(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateHolder that = (StateHolder) o;
        return pageNum == that.pageNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNum);
    }
}

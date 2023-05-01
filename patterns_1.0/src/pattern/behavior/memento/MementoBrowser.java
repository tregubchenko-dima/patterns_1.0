package pattern.behavior.memento;

public class MementoBrowser {

    private int pageNum;

    public MementoBrowser() {
        this.pageNum = 0;
    }

    public void goNextPage() {
        pageNum++;
    }

    public StateHolder getPageNum() {
        return new StateHolder(pageNum);
    }

    public void setPageNum(StateHolder stateHolder) {
        this.pageNum = stateHolder.getPageNum();
    }

    public void showCurrentPage() {
        System.out.println("Current page num: " + pageNum);
    }
}

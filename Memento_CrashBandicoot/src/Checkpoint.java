public class Checkpoint {
    private CrashMemento memento;

    public void saveState(CrashMemento memento) {
        this.memento = memento;
    }

    public CrashMemento loadState() {
        return memento;
    }
}
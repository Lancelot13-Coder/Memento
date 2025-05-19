public class CrashMemento {
    private final String level;
    private final int position;
    private final int lives;

    public CrashMemento(String level, int position, int lives) {
        this.level = level;
        this.position = position;
        this.lives = lives;
    }

    public String getLevel() {
        return level;
    }

    public int getPosition() {
        return position;
    }

    public int getLives() {
        return lives;
    }
}
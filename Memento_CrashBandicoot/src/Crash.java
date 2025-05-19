public class Crash {
    private String level;
    private int position;
    private int lives;

    public Crash(String level, int position, int lives) {
        this.level = level;
        this.position = position;
        this.lives = lives;
    }

    public void setState(String level, int position, int lives) {
        this.level = level;
        this.position = position;
        this.lives = lives;
    }

    public CrashMemento save() {
        return new CrashMemento(level, position, lives);
    }

    public void restore(CrashMemento memento) {
        this.level = memento.getLevel();
        this.position = memento.getPosition();
        this.lives = memento.getLives();
    }

    public void showState() {
        System.out.println("Nivel: " + level + ", Posición: " + position + ", Vidas: " + lives);
    }
}
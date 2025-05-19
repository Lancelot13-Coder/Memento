public class Main {
    public static void main(String[] args) {
        Crash crash = new Crash("Isla N. Sanity", 0, 3);
        Checkpoint checkpoint = new Checkpoint();

        crash.showState(); // Estado inicial

        checkpoint.saveState(crash.save()); // Guardamos en el checkpoint

        // Simulación de avance y daño
        crash.setState("Isla N. Sanity", 100, 2);
        crash.showState();

        // Restauramos desde el checkpoint
        crash.restore(checkpoint.loadState());
        System.out.println("Estado restaurado desde el checkpoint:");
        crash.showState();
    }
}
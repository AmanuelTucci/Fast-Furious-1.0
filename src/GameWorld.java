import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;


public class GameWorld {

    private GraphicsContext gc;
    private int width;
    private int height;
    private AnimationTimer timer;
    private Image car;
  
    // oggetti e altri attributi del gioco

    private boolean gameOver; // se true il gioco è finito

   public GameWorld(GraphicsContext gc, int width, int height) {

    this.gc = gc;
    this.width = width;
    this.height = height;

    car = new Image("file:assets/car.png");

    gameOver = false;
    createTimer();
}
   
    // Il loop infinito che genera i frame del gioco
    // Update: aggiorna i dati
    // Draw: disegna il nuovo frame
    private void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update(now);
                draw();
            }
        };
    }
  
    public void start() {
        timer.start();
    }

    // Aggiorna i dati del videogioco
    private void update(long now) {
        if (gameOver) {
            return;
        }
        // TODO 
	   // Check delle conseguenze dell'update  
   // Es.: collisioni, oggetti da rimuovere, gameover  
    }

    // Disegna il nuovo frame del videogioco
   private void draw() {

    gc.setFill(Color.BLACK);
    gc.fillRect(0, 0, width, height);

    // Disegna la macchina
    gc.drawImage(car, 100, 100, 200, 120);

    if (gameOver) {

    }
} 

       // Disegna dentro alla finestra gli oggetti del gioco         
       
       
    // Cosa succede se premo i vari tasti
    public void onKeyPressed(KeyCode code) {
    	  // TODO
    }
    // Cosa succede se rilascio i vari tasti
    public void onKeyReleased(KeyCode code) {
        // TODO
    }
}

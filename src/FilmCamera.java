/**
 * Proof-of-concept, Film Camera.
 *Loads film, takes photos, and tracks usage.
 */
public class FilmCamera {

    private String filmType;
    private int totalFrames;
    private int framesRemaining;

    /**
     * creates empty camera with no film.
     */
    public FilmCamera() {
        this.filmType = "";
        this.totalFrames = 0;
        this.framesRemaining = 0;
    }

    /**
     * load new film into camera.
     */
    public void loadFilm(String type, int frames) {
        this.filmType = type;
        this.totalFrames = frames;
        this.framesRemaining = frames;
    }

    /**
     * take a photo.
     */
    public void takePhoto() {

        if (this.framesRemaining > 0) {
            this.framesRemaining--;
            System.out.println("Photo taken. Frames remaining: " + this.framesRemaining);
        } else {
            System.out.println("No film remaining.");
        }
    }

    /**
     * returns remaining frames.
     */
    public int filmRemaining() {
        return this.framesRemaining;
    }

    /**
     * checks film left.
     */
    public boolean outOfFilm() {
        return this.framesRemaining == 0;
    }

    /**
     * calculates what film is used.
     */
    public double percentUsed() {

        if (this.totalFrames == 0) {
            return 0.0;
        }

        int used = this.totalFrames - this.framesRemaining;
        return (used * 100.0) / this.totalFrames;
    }

    /**
     * film information.
     */
    public void printStatus() {

        System.out.println("Film type: " + this.filmType);
        System.out.println("Total frames: " + this.totalFrames);
        System.out.println("Frames remaining: " + this.framesRemaining);
        System.out.println("Percent used: " + this.percentUsed() + "%");
    }

    /**
     * proof-of-concept.
     */
    public static void main(String[] args) {

        FilmCamera camera = new FilmCamera();

        camera.loadFilm("Kodak Gold 200", 24);

        camera.printStatus();

        camera.takePhoto();
        camera.takePhoto();
        camera.takePhoto();

        camera.printStatus();

        while (!camera.outOfFilm()) {
            camera.takePhoto();
        }

        camera.printStatus();
    }
}


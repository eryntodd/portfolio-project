public abstract class AbstractFilmCamera implements FilmCameraKernel {

    protected String filmType;
    protected int framesRemaining;
    protected int totalFrames;

    public AbstractFilmCamera() {
        this.filmType = "";
        this.framesRemaining = 0;
        this.totalFrames = 0;
    }

    @Override
    public void newFilm(String filmType, int frames) {
        this.filmType = filmType;
        this.framesRemaining = frames;
        this.totalFrames = frames;
    }

    @Override
    public String exposure() {
    return "Standard";
    }

    @Override
    public void loadFilm(String type, int frames) {
        this.filmType = type;
        this.framesRemaining = frames;
        this.totalFrames = frames;
    }

    @Override
    public void takePhoto() {
        if (framesRemaining > 0) {
            framesRemaining--;
        }
    }

    @Override
    public int filmRemaining() {
        return framesRemaining;
    }
}
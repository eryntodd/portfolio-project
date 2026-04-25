public class FilmCameraUsage {

    private FilmCamera camera;

    public FilmCameraUsage() {
        this.camera = new FilmCameraKernelImplementation();
    }

    public int simulateShooting() {
        camera.newFilm("120mm", 12);

        for (int i = 0; i < 5; i++) {
            camera.takePhoto();
        }

        return camera.filmRemaining();
    }
}

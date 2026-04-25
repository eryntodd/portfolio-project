public class FilmCameraDemo {
    public static void main(String[] args) {

        FilmCamera cam = new FilmCameraKernelImplementation();

        cam.newFilm("35mm", 5);
        cam.takePhoto();
        cam.takePhoto();

        System.out.println("Remaining: " + cam.filmRemaining());
        System.out.println("Used %: " + cam.percentUsed());
    }
}

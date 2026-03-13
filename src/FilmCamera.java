
public interface FilmCamera extends FilmCameraKernel {

    /**
     * Returns the percentage of film used.
     *
     * @return percent of film used
     * @ensures percentUsed >= 0
     */
    double percentUsed();

    /**
     * Returns film type loaded.
     *
     * @return film type
     */
    String filmType();

    /**
     * Returns total frames originally loaded.
     *
     * @return total frames
     */
    int totalFrames();
}

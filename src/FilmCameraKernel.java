import components.standard.Standard;

/**
 * Kernel interface for FilmCamera.
 */
public interface FilmCameraKernel extends Standard<FilmCamera> {

    /**
     * Loads film into the camera.
     *
     * @param type
     *            the type of film
     * @param frames
     *            number of frames on the roll
     * @updates this
     * @requires frames > 0
     * @ensures camera contains film with specified frames
     */
    void loadFilm(String type, int frames);

    /**
     * Takes photo using one frame.
     *
     * @updates this
     * @requires filmRemaining > 0
     * @ensures filmRemaining decreases by 1
     */
    void takePhoto();

    /**
     * Returns number of frames remaining.
     *
     * @return frames remaining
     * @ensures filmRemaining = number of unused frames
     */
    int filmRemaining();
}
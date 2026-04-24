public abstract class FilmCameraSecondary implements FilmCamera {

    @Override
    public boolean outOfFilm() {
        return this.filmRemaining() == 0;
    }

    @Override
    public double percentUsed() {
        if (this.totalFrames() == 0) {
            return 0.0;
        }

        int used = this.totalFrames() - this.filmRemaining();
        return (used * 100.0) / this.totalFrames();
    }

    @Override
    public String toString() {
        return "Film type: " + this.filmType()
                + ", Frames remaining: " + this.filmRemaining()
                + ", Percent used: " + this.percentUsed();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FilmCamera)) {
            return false;
        }

        FilmCamera other = (FilmCamera) obj;

        return this.filmRemaining() == other.filmRemaining()
                && this.totalFrames() == other.totalFrames()
                && this.filmType().equals(other.filmType());
    }
}


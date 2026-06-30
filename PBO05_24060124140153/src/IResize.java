public interface IResize {

    // memperbesar ukuran 10%
    void zoomIn();

    // memperkecil ukuran 10%
    void zoomOut();

    // resize sesuai persen tertentu
    void zoom(int percent);
}
package simple.gallery.activity.album

import simple.gallery.model.AlbumModel

class AlbumPresenter(private val view: AlbumViewImpl) : AlbumPresenterImpl {

    override fun loadAlbums() {
        val result: ArrayList<AlbumModel> = ArrayList()

        for (i in 0..5) {
            result.add(
                AlbumModel()
            )
        }

        view.setAlbums(result)
    }
}
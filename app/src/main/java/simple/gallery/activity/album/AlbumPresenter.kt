package simple.gallery.activity.album

import simple.gallery.model.AlbumModel

class AlbumPresenter(private val view: AlbumContract.View) : AlbumContract.Presenter {

    override fun loadAlbums() {
        val result: ArrayList<AlbumModel> = ArrayList()

        for (i in 0..5) {
            result.add(
                AlbumModel()
            )
        }

        view.setAlbums(result)
    }

    override fun checkPermissions() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
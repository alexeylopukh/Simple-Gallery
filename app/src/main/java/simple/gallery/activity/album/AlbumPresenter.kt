package simple.gallery.activity.album

import android.Manifest
import simple.gallery.model.AlbumModel

class AlbumPresenter(private val view: AlbumContract.View) : AlbumContract.Presenter {

    override fun loadAlbums() {
        val permissions = arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
        view.requestPermissions(permissions)
    }

    override fun onPermissionsGranted(granted: Boolean) {
        if (granted)
            view.setAlbums(generateMockAlbums())
    }

    private fun generateMockAlbums(): List<AlbumModel> {
        val result: ArrayList<AlbumModel> = ArrayList()
        for (i in 0..5) {
            result.add(
                AlbumModel()
            )
        }
        return result
    }
}
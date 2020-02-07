package simple.gallery.activity.album

import android.app.Activity
import simple.gallery.model.AlbumModel

class AlbumContract {
    interface Presenter{
        fun loadAlbums()

        fun checkPermissions()
    }

    interface View {
        fun setAlbums(albums: List<AlbumModel>)
        fun activity(): Activity
    }
}
package simple.gallery.activity.album

import simple.gallery.model.AlbumModel

class AlbumContract {
    interface Presenter {
        fun loadAlbums()
        fun onPermissionsGranted(granted: Boolean)
    }

    interface View {
        fun setAlbums(albums: List<AlbumModel>)
        fun requestPermissions(permissions: Array<String>)
    }
}
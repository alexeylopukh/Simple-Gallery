package simple.gallery.activity.album

import simple.gallery.model.AlbumModel

interface AlbumViewImpl {
    fun setAlbums(albums: List<AlbumModel>)
}
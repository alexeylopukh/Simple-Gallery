package simple.gallery.activity.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import simple.gallery.R
import simple.gallery.adapter.AlbumsGridAdapter
import simple.gallery.model.AlbumModel

class AlbumView : AppCompatActivity(), AlbumViewImpl {
    private lateinit var gridLayout: GridView
    private lateinit var presenter: AlbumPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridLayout=findViewById(R.id.gridLayoutAlbums)
        if (!::presenter.isInitialized)
            presenter = AlbumPresenter(this)
        presenter.loadAlbums()
    }

    override fun setAlbums(albums: List<AlbumModel>) {
        val adapter = AlbumsGridAdapter(albums)
        gridLayout.adapter=adapter
    }
}

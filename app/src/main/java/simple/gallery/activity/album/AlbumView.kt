package simple.gallery.activity.album

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import simple.gallery.R
import simple.gallery.adapter.AlbumsGridAdapter
import simple.gallery.model.AlbumModel

class AlbumView : AppCompatActivity(), AlbumContract.View {
    private lateinit var gridLayout: GridView
    private lateinit var presenter: AlbumContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridLayout = findViewById(R.id.gridLayoutAlbums)
        if (!::presenter.isInitialized)
            presenter = AlbumPresenter(this)
        presenter.loadAlbums()
    }

    override fun setAlbums(albums: List<AlbumModel>) {
        val adapter = AlbumsGridAdapter(albums)
        gridLayout.adapter = adapter
    }

    override fun requestPermissions(permissions: Array<String>) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.requestPermissions(permissions, 1)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        var granted: Boolean = true
        grantResults.forEach {
            if (it != PackageManager.PERMISSION_GRANTED)
                granted = false
        }
        presenter.onPermissionsGranted(granted)
    }
}

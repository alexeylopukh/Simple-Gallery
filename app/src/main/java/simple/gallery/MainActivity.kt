package simple.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var gridLayout: GridView
    private var items = ArrayList<GridItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridLayout=findViewById(R.id.gridLayoutAlbums)
        fillMass()
    }
    private fun setupAdapter(){
        val adapter = AlbumsGridAdapter(items)
        gridLayout.adapter=adapter
    }
    private fun fillMass(){
        for (i in 0..5) {
            items.add(
                GridItem()
            )
        }
        setupAdapter()

    }
}

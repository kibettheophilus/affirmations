package ke.co.topup.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ke.co.topup.affirmations.adapter.ItemAdapter
import ke.co.topup.affirmations.data.Datasource
import org.w3c.dom.Text

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val myDataset = Datasource().loadAffirmations()
//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.adapter = RecyclerView.ViewHolder(this, myDataset) //ItemAdapter(this, myDataset)
//        recyclerView.setHasFixedSize(true)
//    }
//}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}

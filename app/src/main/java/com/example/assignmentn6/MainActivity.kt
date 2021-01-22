package com.example.assignmentn6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val photoList = ArrayList<Photo>()

        photoList.add(Photo("https://cdn.pixabay.com/photo/2016/11/14/04/45/elephant-1822636_960_720.jpg"))
        photoList.add(Photo("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_960_720.jpg"))
        photoList.add(Photo("https://cdn.pixabay.com/photo/2015/12/01/20/28/fall-1072821_960_720.jpg"))

        val adapter = Adapter(photoList, this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}
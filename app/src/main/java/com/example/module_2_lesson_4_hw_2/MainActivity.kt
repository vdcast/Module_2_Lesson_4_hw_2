package com.example.module_2_lesson_4_hw_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPictures.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.pictures, Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,PicturesActivity::class.java)
            startActivity(intent)
        }
        btAnecdotes.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.anecdotes,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,AnecdotesActivity::class.java)
            startActivity(intent)
        }
        btSigns.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.signs,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,SignsActivity::class.java)
            startActivity(intent)
        }
        btQuotes.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.quotes,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,QuotesActivity::class.java)
            startActivity(intent)
        }
        btImagesOfSea.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.images_of_sea,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,ImagesOfSeaActivity::class.java)
            startActivity(intent)
        }
        btImagesOfEmotions.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.images_of_emotions,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,ImagesOfEmotionsActivity::class.java)
            startActivity(intent)
        }
        btAboutAuthor.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.about_author,Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,AboutAuthorActivity::class.java)
            startActivity(intent)
        }


    }
}
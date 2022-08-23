 package com.example.instapostapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage:CircleImageView = findViewById(R.id.profileImage)
        val postImage: ImageView = findViewById(R.id.postImage)
        val likeImage:ImageView = findViewById(R.id.like)

        likeImage.setOnClickListener {
            it.isSelected=!it.isSelected
        }

            profileImage.setOnClickListener{
                val intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)

        }

        Glide.with(this)
            .load("https://images.theconversation.com/files/304864/original/file-20191203-67028-qfiw3k.jpeg?ixlib=rb-1.1.0&rect=638%2C2%2C795%2C745&q=20&auto=format&w=320&fit=clip&dpr=2&usm=12&cs=strip").into(profileImage)
        Glide.with(this)
            .load("https://youimg1.tripcdn.com/target/100c0z000000nbuj7D809_D_1180_558.jpg?proc=source%2Ftrip").into(postImage)
    }
}
package com.gultendogan.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gultendogan.runningapp.R
import com.gultendogan.runningapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
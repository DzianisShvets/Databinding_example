package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding
    lateinit var myCoolViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        myCoolViewModel = MyViewModel("Kuma", 15, this)
        myCoolViewModel.Par1 = "Androidian"
        mainBinding.myViewModel = myCoolViewModel

        myCoolViewModel.Par1 = "Androidian2"   // changed automatically

///////////////////////////////////////OR ANOTHER WAY//////////////////////////////////////////////

//        val myCoolViewModel = MyViewModel("Kuma", 15)
//        mainBinding.setVariable(BR.myViewModel, myCoolViewModel)
//        mainBinding.executePendingBindings()

    }
}
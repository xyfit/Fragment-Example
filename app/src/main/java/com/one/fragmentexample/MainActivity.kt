package com.one.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.one.recyclerview.adapter.UserAdapter
import com.one.recyclerview.models.UsersModel

class MainActivity : AppCompatActivity() {

    lateinit var fragmentContainer: FrameLayout
    lateinit var recyclerView: RecyclerView

    val adaperList = mutableListOf<UsersModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView =  findViewById<RecyclerView>(R.id.recyclerId)

        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.ic_launcher_background, "title 1", "message 1"))

        fragmentContainer = findViewById(R.id.fragment_container)

        findViewById<Button>(R.id.button).setOnClickListener {
            changeFragment(Fragment1())
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            changeFragment(Fragment2())
        }


        recyclerView.layoutManager = LinearLayoutManager(this)//vertical scroll

        recyclerView.adapter = UserAdapter(adaperList)// set adapter

    }

    private fun changeFragment(fragment: Fragment){
        //replace fragment
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()


//        //add fragment
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction
//            .add(R.id.fragment_container, fragment, "TAG")
//            .addToBackStack("TAG")
//        fragmentTransaction.commit()

    }

//    private inline fun FragmentManager.doTransaction(func: FragmentTransaction.() ->
//    FragmentTransaction
//    ) {
//        beginTransaction().func().commit()
//    }
//    fun AppCompatActivity.addFragment(frameId: Int, fragment: Fragment){
//        supportFragmentManager.doTransaction { add(frameId, fragment) }
//    }
//
//
//    fun AppCompatActivity.replaceFragment(frameId: Int, fragment: Fragment) {
//        supportFragmentManager.doTransaction{replace(frameId, fragment)}
//    }
//
//    fun AppCompatActivity.removeFragment(fragment: Fragment) {
//        supportFragmentManager.doTransaction{remove(fragment)}
//    }
}
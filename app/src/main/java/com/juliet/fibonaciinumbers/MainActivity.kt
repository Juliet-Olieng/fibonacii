package com.juliet.fibonaciinumbers

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juliet.fibonaciinumbers.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

    override fun onResume() {
        super.onResume()
        generateFibonacci()
//
    }

    fun generateFibonacci() {
        var a = 0
        var b = 1
        var c: Int

//        println("Fibonacci numbers up to 200:")
//        print("$a, $b")
        var numbers_list= mutableListOf<Int>(a,b)
        while (true) {
            c = a + b
            if (c > 100)
                break

            numbers_list.add(c)

            a = b
            b = c
        }
        binding.rvNumber.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=NumberRvAdapter(numbers_list)
        binding.rvNumber.adapter=numbersAdapter
    }
}
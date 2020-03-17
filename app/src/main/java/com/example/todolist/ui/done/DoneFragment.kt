package com.example.todolist.ui.done

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.todolist.R

class DoneFragment : Fragment() {

    private lateinit var doneViewModel: DoneViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        doneViewModel =
                ViewModelProviders.of(this).get(DoneViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_done, container, false)
        val textView: TextView = root.findViewById(R.id.text_done)
        doneViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

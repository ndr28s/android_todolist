package com.example.todolist.ui.progress

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.todolist.R

class ProgressFragment : Fragment() {

    private lateinit var progressViewModel: ProgressViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        progressViewModel =
                ViewModelProviders.of(this).get(ProgressViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_progress, container, false)
        val textView: TextView = root.findViewById(R.id.text_progress)
        progressViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

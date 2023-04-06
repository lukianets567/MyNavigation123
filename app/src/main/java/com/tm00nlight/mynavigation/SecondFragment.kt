package com.tm00nlight.mynavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.tm00nlight.mynavigation.databinding.FragmentFirstBinding
import com.tm00nlight.mynavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv: TextView = view.findViewById(R.id.textView2)
        val stringArg = args._new

        binding.root.setOnClickListener {
            //binding.root.addView(TextView,stringArg)
            binding.textView2.text.get(stringArg)
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)

        }
    }
}
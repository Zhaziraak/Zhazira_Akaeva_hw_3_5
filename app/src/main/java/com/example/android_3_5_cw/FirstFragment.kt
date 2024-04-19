package com.example.android_3_5_cw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_3_5_cw.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var number_increase = 0;
        binding.btnPlus.setOnClickListener {
            if (number_increase in 0..9) {
                number_increase++
                binding.tvNumber.text = number_increase.toString()
            } else {
                binding.btnMinus.visibility = View.VISIBLE
                binding.btnPlus.visibility = View.INVISIBLE
            }
        }

        binding.btnMinus.setOnClickListener {
            if (!binding.tvNumber.text.toString().equals("0")){
                number_increase--
                binding.tvNumber.text = number_increase.toString()
            }else{
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment, SecondFragment()).addToBackStack(null).commit()
            }
        }
    }

}
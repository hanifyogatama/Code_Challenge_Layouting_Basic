package com.binar.code_challenge_layouting_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.binar.code_challenge_layouting_basic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var pilihanPemain : String =""
    private var pilihanKomputer : String =""
    private var storeKomputer = arrayListOf<String>("rock","paper","scissor")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()

        val binding = ActivityMainBinding.inflate(layoutInflater)

        // refresh
        binding.refresh.setOnClickListener {
            binding.paperPemain.setClickable(true)
            binding.rockPemain.setClickable(true)
            binding.scissorsPemain.setClickable(true)

            binding.paperPemain.setBackgroundResource(0)
            binding.rockPemain.setBackgroundResource(0)
            binding.scissorsPemain.setBackgroundResource(0)

            binding.paperKomputer.setBackgroundResource(0)
            binding.rockKomputer.setBackgroundResource(0)
            binding.scissorKomputer.setBackgroundResource(0)

            binding.ivVersus.setImageResource(R.drawable.ic_versus)
        }

        // player choose rock
        binding.rockPemain.setOnClickListener {
            binding.rockPemain.setBackgroundResource(R.drawable.card)
            pilihanPemain = "rock"
            Log.d("pilihan pemain adalah ", "batu")

            pilihanKomputer = storeKomputer.random()

            binding.paperPemain.setClickable(false)
            binding.scissorsPemain.setClickable(false)
            binding.rockPemain.setClickable(false)

            when (pilihanKomputer) {
                "rock" -> {
                    binding.rockKomputer.setBackgroundResource(R.drawable.card)
                    binding.ivVersus.setImageResource(R.drawable.draw)
                    Log.d("hasil", "pemain dan komputer draw")
                }

                "scissor" -> {
                    binding.scissorKomputer.setBackgroundResource(R.drawable.card)
                    binding.ivVersus.setImageResource(R.drawable.pemain_menang)
                    Log.d("hasil", "pemain menang")
                }

                "paper" -> {
                    binding.paperKomputer.setBackgroundResource(R.drawable.card)
                    binding.ivVersus.setImageResource(R.drawable.komputer_menang)
                    Log.d("hasil", "komputer menang")
                }
            }
        }

            // player choose paper
                binding.paperPemain.setOnClickListener {
                binding.paperPemain.setBackgroundResource(R.drawable.card)
                pilihanPemain = "paper"
                Log.d("pilihan pemain adalah ","kertas" )

                pilihanKomputer = storeKomputer.random()

                binding.paperPemain.setClickable(false)
                binding.rockPemain.setClickable(false)
                binding.scissorsPemain.setClickable(false)

                when (pilihanKomputer){
                    "paper" -> {
                        binding.paperKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.draw)
                        Log.d("hasil","pemain dan komputer draw")
                    }

                    "rock" -> {
                        binding.rockKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.pemain_menang)
                        Log.d("hasil","pemain menang")
                    }

                    "scissor" -> {
                        binding.scissorKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.komputer_menang)
                        Log.d("hasil","komputer menang")
                    }
                }
            }

            // player choose scissor
                binding.scissorsPemain.setOnClickListener {
                binding.scissorsPemain.setBackgroundResource(R.drawable.card)
                pilihanPemain = "scissor"
                Log.d("pilihan pemain adalah ","gunting")

                pilihanKomputer = storeKomputer.random()
                binding.scissorsPemain.setClickable(false)
                binding.rockPemain.setClickable(false)
                binding.paperPemain.setClickable(false)

                when(pilihanKomputer) {
                    "scissor" -> {
                        binding.scissorKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.draw)
                        Log.d("Hasil","pemain dan komputer draw")
                    }

                    "paper" -> {
                        binding.paperKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.pemain_menang)
                        Log.d("Hasil","pemain menang")
                    }

                    "rock" -> {
                        binding.rockKomputer.setBackgroundResource(R.drawable.card)
                        binding.ivVersus.setImageResource(R.drawable.komputer_menang)
                        Log.d("Hasil","komputer menang")
                    }

                }
            }

        setContentView(binding.root)
    }
}


package com.example.lottieanimationtutorial

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lottieanimationtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var isliked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        isliked = false

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.likeBtn.setOnClickListener {
            // binding.likeBtn.playAnimation()
            if (isliked == false) {
                val animator = ValueAnimator.ofFloat(0.5f, 1f).setDuration(1000)
                animator.addUpdateListener { animation: ValueAnimator ->
                    binding.likeBtn.setProgress(
                        animation.getAnimatedValue() as Float
                    )
                }
                animator.start()
                isliked = true
            } else {
                val animator = ValueAnimator.ofFloat(0.1f, 0.2f).setDuration(1000)
                animator.addUpdateListener { animation: ValueAnimator ->
                    binding.likeBtn.setProgress(
                        animation.getAnimatedValue() as Float
                    )
                }
                animator.start()
                isliked = true
            }

        }
    }
}
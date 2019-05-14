package com.aldana.ejemplo14

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {
    lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        var binding:com.aldana.ejemplo14.databinding.LayoutBinding  = DataBindingUtil.setContentView(this,R.layout.layout)

        binding.lifecycleOwner = this

        binding.score = scoreViewModel


    }

    fun addOneTeamA(v:View) {
        scoreViewModel.scoreTeamA.value = scoreViewModel.scoreTeamA.value?.plus(1)
    }

    fun addOneTeamB(v:View) {
        scoreViewModel.scoreTeamB.value = scoreViewModel.scoreTeamB.value?.plus(1)
    }

    fun addTwoTeamA(v:View) {
        scoreViewModel.scoreTeamA.value = scoreViewModel.scoreTeamA.value?.plus(2)
    }

    fun addTwoTeamB(v:View) {
        scoreViewModel.scoreTeamB.value = scoreViewModel.scoreTeamB.value?.plus(2)
    }

    fun addThreeTeamA(v:View) {
        scoreViewModel.scoreTeamA.value = scoreViewModel.scoreTeamA.value?.plus(3)
    }

    fun addThreeTeamB(v: View) {
        scoreViewModel.scoreTeamB.value = scoreViewModel.scoreTeamB.value?.plus(3)
    }

    fun resetScores(v: View) {
        scoreViewModel.scoreTeamA.value = 0
        scoreViewModel.scoreTeamB.value = 0

    }

}

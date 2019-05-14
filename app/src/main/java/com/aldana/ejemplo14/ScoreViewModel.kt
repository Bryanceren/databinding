package com.aldana.ejemplo14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel () {
    lateinit var scoreTeamA:MutableLiveData<Int>
    lateinit var scoreTeamB:MutableLiveData<Int>
    init{
        scoreTeamA.value=0
        scoreTeamB.value=0
    }
}
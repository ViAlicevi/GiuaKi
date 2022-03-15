package com.example.giuaki.data

import com.example.giuaki.R
import com.example.giuaki.model.Capital

class Datasource {

        fun loadCapital(): List<Capital> {
            return listOf<Capital>(
                Capital(R.string.capital),
                Capital(R.string.capital1),
                Capital(R.string.capital2),
                Capital(R.string.capital3)
            )
        }
    }
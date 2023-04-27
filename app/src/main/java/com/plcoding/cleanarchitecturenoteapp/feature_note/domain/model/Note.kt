package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
) {
    companion object {
        val notesColor = listOf(
            RedOrange,
            LightBlue,
            LightGreen,
            Violet,
            RedPink
        )
    }
}

class InvalidNoteExecption(message: String): Exception(message)

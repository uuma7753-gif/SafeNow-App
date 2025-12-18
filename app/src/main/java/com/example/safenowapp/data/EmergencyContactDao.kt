package com.example.safenowapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface EmergencyContactDao {

    @Query("SELECT * FROM emergency_contacts ORDER BY id DESC")
    fun getAllContacts(): Flow<List<EmergencyContact>>

    @Insert
    suspend fun insert(contact: EmergencyContact)

    @Delete
    suspend fun delete(contact: EmergencyContact)

    @Query("DELETE FROM emergency_contacts")
    suspend fun deleteAll()
}

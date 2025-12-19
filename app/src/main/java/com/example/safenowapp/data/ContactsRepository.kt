package com.example.safenowapp.data

import kotlinx.coroutines.flow.Flow

class ContactsRepository(
    private val dao: EmergencyContactDao
) {
    val allContacts: Flow<List<EmergencyContact>> = dao.getAllContacts()

    suspend fun addContact(name: String, phone: String) {
        dao.insert(EmergencyContact(name = name, phone = phone))
    }

    suspend fun deleteContact(contact: EmergencyContact) {
        dao.delete(contact)
    }

    suspend fun clearAll() {
        dao.deleteAll()
    }
}

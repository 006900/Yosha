package com.example.yosha.componentSetting

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class DataStoreUtil(private val context: Context) {

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("settings")
        val FORCE_DARK_THEME = booleanPreferencesKey("force_dark_theme")
        val SIZE_IMAGE = booleanPreferencesKey("size_image")
        val ENABLED_SPLASH = booleanPreferencesKey("enabled_splash")
        val CIRCLE_BUTTON = booleanPreferencesKey("circle_button")
         val SAVE_BORDER= booleanPreferencesKey("save_border")
        val OPACITY = booleanPreferencesKey("opacity")
        val USER_TOKEN_KEY= stringPreferencesKey("user_token")
        val URL_SPLASH= stringPreferencesKey("url_splash")
        val URL_Top= stringPreferencesKey("url_top")
        val TITLE= stringPreferencesKey("title")
        val IMAGE_TOP = booleanPreferencesKey("image_top")
        val TextColor = stringPreferencesKey("text_color")
        val ColorTextButton = stringPreferencesKey("Color_Text_Button")
        val FountColorButton = stringPreferencesKey("Fount_Color_Button")


    }



    val darkThemeUi: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[FORCE_DARK_THEME] ?: true
        }

    suspend fun saveForceDarkTheme(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[FORCE_DARK_THEME] = value
        }
    }

    val enabledSplash: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[ENABLED_SPLASH] ?: true
        }

    suspend fun savedEnabledSplash(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[ENABLED_SPLASH] = value
        }
    }

    val imageSize: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[SIZE_IMAGE] ?: false
        }

    suspend fun savedImageSize(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[SIZE_IMAGE] = value
        }
    }


    val circleButton: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            (preferences[CIRCLE_BUTTON] ?: false)
        }

    suspend fun savedCircleButton(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[CIRCLE_BUTTON] = value
        }
    }

    val opacity: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            (preferences[OPACITY] ?: false)
        }

    suspend fun savedOpacity(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[OPACITY] = value
        }
    }

    val border: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            (preferences[SAVE_BORDER] ?: false)
        }

    suspend fun savedBorder(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[SAVE_BORDER] = value
        }
    }

    val getAccessToken: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[USER_TOKEN_KEY] ?: ""
    }

    suspend fun saveToken(token: String) {
        context.dataStore.edit { preferences ->
            preferences[USER_TOKEN_KEY] = token
        }
    }

    val imageTop: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            (preferences[IMAGE_TOP] ?: false)
        }

    suspend fun savedImageTop(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IMAGE_TOP] = value
        }
    }

    val urlSplash: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[URL_SPLASH] ?: ""
    }

    suspend fun saveUrlSplash(token: String) {
        context.dataStore.edit { preferences ->
            preferences[URL_SPLASH] = token
        }
    }

    val title: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[TITLE] ?: ""
    }

    suspend fun saveTitle(token: String) {
        context.dataStore.edit { preferences ->
            preferences[TITLE] = token
        }
    }

    val top: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[URL_Top] ?: ""
    }

    suspend fun saveTop(token: String) {
        context.dataStore.edit { preferences ->
            preferences[URL_Top] = token
        }
    }

    val colorTextCalculator: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[TextColor] ?: ""
    }

    suspend fun saveColorTextCalculator(token: String) {
        context.dataStore.edit { preferences ->
            preferences[TextColor] = token
        }
    }

    val colorTextButton: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[ColorTextButton] ?: ""
    }

    suspend fun saveColorTextButton(token: String) {
        context.dataStore.edit { preferences ->
            preferences[ColorTextButton] = token
        }
    }

    val fountColorButton: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[FountColorButton] ?: ""
    }

    suspend fun saveFountColorButton(token: String) {
        context.dataStore.edit { preferences ->
            preferences[FountColorButton] = token
        }
    }


}

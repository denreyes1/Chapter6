package com.denreyes.chapter6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.denreyes.chapter6.ui.theme.Chapter6Theme
import com.denreyes.chapter6.views.PetList

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Chapter6Theme {
                Scaffold(
                    topBar = {
                        TopAppBar(title = {
                            Text(text = "Pets")
                        },
                            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
                        )
                    },
                    content = { paddingValues ->
                        ListPets(pad = paddingValues)
                    }
                )
            }
        }
    }

}

@Composable
fun ListPets(pad: PaddingValues) {
    PetList(
        modifier = Modifier
            .fillMaxSize()
            .padding(pad)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Chapter6Theme {
        ListPets(PaddingValues())
    }
}
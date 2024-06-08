package com.example.portifolio

import TelaSobre
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.example.portifolio.telas.TelaDeProjetos
import com.example.portifolio.ui.theme.PortifolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortifolioTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val listIcons = remember {
                        listOf(
                            Pair("Sobre", Icons.Filled.Person),
                            Pair("Projetos", Icons.Filled.Info)
                        )
                    }

                    var selectedItem by remember {
                        mutableStateOf(listIcons.first())
                    }

                    Column(Modifier.fillMaxSize()) {
                        NavHost(
                            navController = navController,
                            startDestination = "Sobre",
                            Modifier.weight(1f)
                        ) {
                            composable("Sobre") {
                                TelaSobre()
                            }
                            composable("Projetos") {
                                TelaDeProjetos()
                            }
                        }

                        BottomAppBar(
                            actions = {
                                listIcons.forEach { item ->
                                    val text = item.first
                                    val icon = item.second
                                    NavigationBarItem(
                                        selected = selectedItem == item,
                                        onClick = {
                                            selectedItem = item
                                            val route = when (text) {
                                                "Sobre" -> "Sobre"
                                                else -> "Projetos"
                                            }
                                            navController.navigate(
                                                route,
                                                navOptions = navOptions {
                                                    launchSingleTop = true
                                                    popUpTo(navController.graph.startDestinationId)
                                                })
                                        },
                                        icon = {
                                            Icon(icon, contentDescription = null)
                                        },
                                        label = {
                                            Text(text)
                                        }
                                    )
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}

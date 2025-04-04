package com.anhq.taskmanagement.feature.newtask.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.anhq.taskmanagement.feature.newtask.NewTaskRoute
import kotlinx.serialization.Serializable

@Serializable
data object NewTaskRoute

fun NavController.navigateToNewTask(navOptions: NavOptions? = null) =
    navigate(route = NewTaskRoute, navOptions = navOptions)


fun NavGraphBuilder.newTaskScreen(
    onBackHomeClick: () -> Unit,
) {
    composable<NewTaskRoute> {
        NewTaskRoute(onBackHomeClick = onBackHomeClick)
    }
}
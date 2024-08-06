package org.danylnatife.samplekmpproject.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Single
interface Navigator {
    fun attach(navController: NavController)
    fun detach()
    fun navigate(route: String, navOptions: NavOptions? = null)
    fun navigateUp()
    fun popBackStack(
        route: String? = null,
        inclusive: Boolean = false,
        saveState: Boolean = false
    )

    class NavigatorImpl : Navigator {
        private var _navController: NavController? = null
        private val navController
            get() = requireNotNull(_navController) { "attach navController" }

        override fun attach(navController: NavController) {
            this._navController = navController
        }

        override fun detach() {
            _navController = null
        }

        override fun navigate(route: String, navOptions: NavOptions?) {
            navController.navigate(route, navOptions = navOptions)
        }

        override fun navigateUp() {
            navController.navigateUp()
        }

        override fun popBackStack(
            route: String?,
            inclusive: Boolean,
            saveState: Boolean
        ) {
            if (route != null) {
                navController.popBackStack()
            } else {
                navController.popBackStack(route!!, inclusive, saveState)
            }
        }
    }
}
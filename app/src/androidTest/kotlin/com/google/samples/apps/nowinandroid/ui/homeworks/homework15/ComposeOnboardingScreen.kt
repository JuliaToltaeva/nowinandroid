package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.C
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class ComposeOnboardingScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<ComposeOnboardingScreen>(semanticsProvider) {

    val topBarTitle = child<KNode> {
        hasTestTag("NiaTopAppBarTitle")
    }

    val navButton = KNode(semanticsProvider) {
        hasTestTag("NiaTopAppBarNavigationButton")
        useUnmergedTree = true
    }

    val actionsButton = KNode(semanticsProvider) {
        hasTestTag("NiaTopAppBarActionsButton")
        useUnmergedTree = true
    }

    val gridTitle = child<KNode> {
        hasTestTag("LazyStaggeredGridScopeTitle")
    }

    val gridText = child<KNode> {
        hasTestTag("LazyStaggeredGridScopeText")
    }

    val doneButton = KNode(semanticsProvider) {
        hasText("Done")
        useUnmergedTree = true
    }

    val toolbarIconButton = KNode(semanticsProvider) {
        hasTestTag(C.NIA_TOP_APP_BAR_NAVIGATION_BUTTON)
        useUnmergedTree = true
    }
}
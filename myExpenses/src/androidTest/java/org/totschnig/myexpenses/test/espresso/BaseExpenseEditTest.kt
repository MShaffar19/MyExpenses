package org.totschnig.myexpenses.test.espresso

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import org.totschnig.myexpenses.activity.TestExpenseEdit
import org.totschnig.myexpenses.testutils.BaseUiTest

abstract class BaseExpenseEditTest: BaseUiTest<TestExpenseEdit>() {
    val intent get() = Intent(targetContext, TestExpenseEdit::class.java)
}
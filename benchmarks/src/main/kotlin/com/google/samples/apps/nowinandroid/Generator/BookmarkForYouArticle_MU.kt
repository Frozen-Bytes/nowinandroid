package com.google.samples.apps.nowinandroid.Generator

import androidx.benchmark.macro.BaselineProfileMode
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.ExperimentalMetricApi
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.MemoryUsageMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.StartupTimingMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@OptIn(ExperimentalMetricApi::class)
@RunWith(AndroidJUnit4::class)
class BookmarkForYouArticle_MU {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun measure() = benchmarkRule.measureRepeated(
        packageName = "com.google.samples.apps.nowinandroid.demo",
        metrics = listOf(MemoryUsageMetric(MemoryUsageMetric.Mode.Max)),
        startupMode = StartupMode.WARM,
        compilationMode = CompilationMode.Partial(
            baselineProfileMode = BaselineProfileMode.Disable,
            warmupIterations = 3,
        ),
        iterations = 10,
        setupBlock = {
            pressHome()
            startActivityAndWait()
            device.waitForIdle()
            device.wait(Until.hasObject(By.pkg("com.google.samples.apps.nowinandroid.demo").depth(0)), 5000L)
        },
    ) {
        // ACTION: AWAKE
        device.click(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((547.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        device.click(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((537.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        device.click(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((537.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        device.click(((738.0f / 1000.0f) * device.displayWidth).toInt(), ((295.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        device.click(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((537.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        device.swipe(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((797.0f / 1000.0f) * device.displayHeight).toInt(), ((525.0f / 1000.0f) * device.displayWidth).toInt(), ((289.0f / 1000.0f) * device.displayHeight).toInt(), 20)
        device.waitForIdle()
        Thread.sleep(1000L)
        device.click(((843.0f / 1000.0f) * device.displayWidth).toInt(), ((625.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)
        // ACTION: COMPLETE
    }
}

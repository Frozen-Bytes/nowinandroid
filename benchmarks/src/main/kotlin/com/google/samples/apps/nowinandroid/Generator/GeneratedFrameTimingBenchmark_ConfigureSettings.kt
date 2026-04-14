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


@RunWith(AndroidJUnit4::class)
class GeneratedFrameTimingBenchmark_ConfigureSettings {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun measure() = benchmarkRule.measureRepeated(
        packageName = "com.google.samples.apps.nowinandroid.demo",
        metrics = listOf(FrameTimingMetric()),
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
        device.click(((61.0f / 1000.0f) * device.displayWidth).toInt(), ((81.0f / 1000.0f) * device.displayHeight).toInt())
        device.click(((858.0f / 1000.0f) * device.displayWidth).toInt(), ((821.0f / 1000.0f) * device.displayHeight).toInt())
        device.click(((61.0f / 1000.0f) * device.displayWidth).toInt(), ((81.0f / 1000.0f) * device.displayHeight).toInt())
        device.click(((930.0f / 1000.0f) * device.displayWidth).toInt(), ((87.0f / 1000.0f) * device.displayHeight).toInt())
        // ACTION: COMPLETE
    }
}

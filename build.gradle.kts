buildscript {
    extra.apply{
        set("kotlin_version", "1.9.20")
        set("compiler_version", "1.5.5")
        set("compose_version", "1.5.4")
        set("material3_version", "1.1.2")
        set("constraintlayout_version", "1.0.1")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ch.michaeljob.kotlincomposenotes"
    compileSdk = 34

    defaultConfig {
        applicationId = "ch.michaeljob.kotlincomposenotes"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

val compose_version: String by rootProject.extra
val material3_version: String by rootProject.extra
val constraintlayout_version: String by rootProject.extra
val kotlin_version: String by rootProject.extra

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.activity:activity-compose:1.8.1")

    implementation("androidx.compose.ui:ui-tooling-preview:$compose_version")

    // the compose libraries
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.ui:ui-unit:$compose_version")
    // Material icons (not yet material3)
    implementation("androidx.compose.material:material-icons-extended:$compose_version")
    // Material 3
    implementation("androidx.compose.material3:material3:$material3_version")

    // Constraint Layout
    implementation("androidx.constraintlayout:constraintlayout-compose:$constraintlayout_version")

    // fuer den Layout Inspector
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version")


    // System Ui Controller
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

    val uploadServiceVersion = "4.9.2" //check for updates
    implementation("net.gotev:uploadservice:$uploadServiceVersion")
    implementation("net.gotev:uploadservice-ftp:$uploadServiceVersion")

}
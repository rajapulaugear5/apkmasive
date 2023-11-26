plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.press"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.press"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
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

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //API SplashScreen
    implementation("androidx.core:core-splashscreen:1.0.1")

    //navigation
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.2")
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.2")

    //material design
    //implementation ("com.google.android.material:material:1.3.0-alpha03")

    //bg lingkaran
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Scanner
    implementation ("com.github.yuriy-budiyev:code-scanner:2.3.2")

    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //location
    implementation ("com.google.android.gms:play-services-location:21.0.1")
    implementation ("com.google.android.gms:play-services-maps:18.2.0")
}
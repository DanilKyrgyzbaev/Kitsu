plugins {
    id(libs.plugins.agp.library.get().pluginId)
    id(libs.plugins.kotlin.kotlin.get().pluginId)
}
android {
    namespace = "kg.geekstudio.kitsu.data"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.compileSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName(config.versions.releaseBuildType.get()) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }

        getByName(config.versions.debugBuildType.get()) {
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/api/\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = buildOptions.versions.kotlinJvmTargetOptions.get()
    }

    buildFeatures {
        buildConfig = true
    }

}
dependencies {
    misc.versions.apply {
        implementation(project(domainProjectPath.get()))
        implementation(project(coreProjectPath.get()))
    }

    // coroutine
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    // koin
    implementation(libs.koin.core)

}
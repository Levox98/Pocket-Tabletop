plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.pocket_tabletop.core_ui"
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion

        testInstrumentationRunner = Config.testInstrumentationRunner
        consumerProguardFiles(Config.consumerProguardFiles)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(Config.defaultProguardFilename),
                Config.proguardProFilename
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    implementation(Dependencies.Core.coreKtx)

    implementation(platform(Dependencies.Compose.bom))
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.iconsExtended)
}
object Dependencies {

    object Compose {
        const val compose_compiler_version = "1.4.3"
        private const val compose_bom_verison = "2023.06.01"
        private const val compose_junit_version = "1.4.0"

        val bom = "androidx.compose:compose-bom:$compose_bom_verison"

        val ui = "androidx.compose.ui:ui"
        val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
        val material = "androidx.compose.material:material"

        //For some reason this dependency isn't recognized when getting version through BOM
        val uiTestJUnit = "androidx.compose.ui:ui-test-junit4:$compose_junit_version"

        val debugUiTooling = "androidx.compose.ui:ui-tooling"
        val debugUiTestManifest = "androidx.compose.ui:ui-test-manifest"
    }

    object Kotlin {
        const val kotlin_version = "1.8.10"
    }

    object Android {
        private const val activity_version = "1.7.0"

        val activityCompose = "androidx.activity:activity-compose:$activity_version"
    }

    object Core {
        private const val core_version = "1.9.0"

        val coreKtx = "androidx.core:core-ktx:$core_version"
    }

    object Lifecycle {
        private const val lifecycle_version = "2.6.1"

        val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
    }

    object Test {
        private const val junit_version = "4.13.2"
        private const val junit_assertions_version = "1.1.5"
        private const val espresso_version = "3.5.1"

        val jUnit = "junit:junit:$junit_version"
        val jUnitAssertions = "androidx.test.ext:junit:$junit_assertions_version"
        val espresso = "androidx.test.espresso:espresso-core:$espresso_version"
    }

    object Retrofit {
        private const val version = "2.9.0"

        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }

    object OkHttp {
        private const val okHttpBomVersion = "4.10.0"

        const val bom = "com.squareup.okhttp3:okhttp-bom:$okHttpBomVersion"

        val okHttp = "com.squareup.okhttp3:okhttp"
    }

    object Hilt {
        private const val version = "2.47"

        const val hilt = "com.google.dagger:hilt-android:$version"
        const val kapt = "com.google.dagger:hilt-compiler:$version"
    }
}

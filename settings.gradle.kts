pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "appTest"
include(":app")
include(":ch6_view2")
include(":ch7_layout")
include(":ch8_event")
include(":ch9_resource")
include(":ch10_notification")
include(":ch11_jetpack")
include(":ch12_material")

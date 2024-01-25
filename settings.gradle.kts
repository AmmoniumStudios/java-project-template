pluginManagement {
    repositories {
        // Configure the repositories for gradle plugins here
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "java-project-template"
include("example-api", "example")

plugins {
    application
    id("jvm-conventions")
}

dependencies {
    implementation(project(":example-api"))
}

application {
    mainClass.set("org.ammonium.example.Application")
}
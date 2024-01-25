plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
        withSourcesJar()
        withJavadocJar()
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = Charsets.UTF_8.name()
    }
    withType<Javadoc> {
        options.encoding = Charsets.UTF_8.name()
    }
    withType<ProcessResources> {
        filesMatching("**/*.properties") {
            // Replace tokens in .properties files
        }
    }
}
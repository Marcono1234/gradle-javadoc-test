plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withJavadocJar()
}

tasks.javadoc {
    // Does not work, causes Javadoc error
    exclude("demo/internal")
}

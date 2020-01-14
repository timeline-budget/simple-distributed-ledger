plugins {
    kotlin("jvm") version "1.3.61"
    `java-library`
}

group = "com.timelinebudget"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

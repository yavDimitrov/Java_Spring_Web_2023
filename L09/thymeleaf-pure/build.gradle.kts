plugins {
    id("java")
    kotlin("jvm") version "1.8.20-RC2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.thymeleaf:thymeleaf:3.0.15.RELEASE'
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation(kotlin("stdlib"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
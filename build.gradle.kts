plugins {
    kotlin("jvm") version "1.5.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation ("io.kotest:kotest-assertions-core-jvm:4.6.0")
}

tasks.test {
    useJUnitPlatform()
}

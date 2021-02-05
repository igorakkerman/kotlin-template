plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("ch.tutteli.atrium:atrium-fluent-en_GB:0.9.0-alpha")
    testRuntimeOnly("net.bytebuddy:byte-buddy:1.10.6")
}

tasks.test {
    useJUnitPlatform()
}

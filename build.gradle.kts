plugins {
    kotlin("jvm") version "1.4.30"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
    testImplementation("ch.tutteli.atrium:atrium-fluent-en_GB:0.15.0")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.4.30")
    testRuntimeOnly("net.bytebuddy:byte-buddy:1.10.20")
}

tasks.test {
    useJUnitPlatform()
}

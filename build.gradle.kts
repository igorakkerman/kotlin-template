plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.20")
}

tasks.test {
    useJUnitPlatform()
}

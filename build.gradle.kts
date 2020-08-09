plugins {
    kotlin("jvm") version "1.4.0-rc"
}

group = "cz.skywall.kuple"
version = "1.0.0"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://org.jetbrains.kotlin")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    test {
        useJUnitPlatform()
    }

    val sourcesJar by creating(Jar::class) {
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allSource)
    }

    artifacts {
        archives(sourcesJar)
        archives(jar)
    }
}
plugins {
    id("org.gradle.presentation.asciidoctor")
}

repositories {
    mavenLocal()
    jcenter()
}

presentation {
    githubUserName.set("gradle")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.16")
    asciidoctor("org.asciidoctor:asciidoctorj-pdf:1.5.0-rc.2")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }

}

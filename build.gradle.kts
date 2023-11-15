plugins {
	kotlin("jvm") version "1.9.10"
	kotlin("plugin.allopen") version "1.9.10"
	id("io.quarkus")
	id("com.diffplug.spotless") version "6.22.0"
}

repositories {
	mavenCentral()
	mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
	implementation(enforcedPlatform("$quarkusPlatformGroupId:$quarkusPlatformArtifactId:$quarkusPlatformVersion"))
	implementation("io.quarkus:quarkus-config-yaml")
	implementation("io.quarkus:quarkus-mongodb-panache-kotlin")
	implementation("io.quarkus:quarkus-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("io.quarkus:quarkus-arc")
	implementation("io.quarkus:quarkus-resteasy-reactive")
	testImplementation("io.quarkus:quarkus-junit5")
	testImplementation("io.rest-assured:rest-assured")
}

group = "dev.stocky37"
version = "2.0.0"

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<Test> {
	systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
allOpen {
	annotation("jakarta.ws.rs.Path")
	annotation("jakarta.enterprise.context.ApplicationScoped")
	annotation("jakarta.persistence.Entity")
	annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
	kotlinOptions.javaParameters = true
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
	kotlin {
		ktlint()
	}
	kotlinGradle {
		ktlint()
	}
}

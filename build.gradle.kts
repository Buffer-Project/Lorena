plugins {
    java
	kotlin("jvm") version "1.5.21"
	id("org.springframework.boot") version "2.4.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.jetbrains.kotlin.plugin.spring") version "1.5.21"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.5.21"
}

group = "com.buffer"
version = "3.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11


repositories {
	mavenCentral()
}

configurations {
	compileOnly {
		extendsFrom(configurations["annotationProcessor"])
	}
}

sourceSets {
	main {
		java.setSrcDirs(listOf("src/main/kotlin", "src/main/java"))
	}
}

springBoot {
	mainClass.set("com.buffer.lorena.LorenaApplicationKt")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("com.h2database:h2")
	implementation("org.postgresql:postgresql")

	//javacord
	implementation("org.javacord:javacord:3.4.0")

	// To make jackson work with kotlin
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")

	// Unit conversion
	implementation("org.jscience:jscience:4.3.1")

	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")


	compileOnly("org.projectlombok:lombok")


	developmentOnly("org.springframework.boot:spring-boot-devtools")


	runtimeOnly("mysql:mysql-connector-java")


	//log4j
	runtimeOnly("org.apache.logging.log4j:log4j-core:2.17.0")


	// As if you're doing tests...
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
	useJUnitPlatform()
}

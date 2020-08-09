# Kuple

Simple tuples implementation in Kotlin. Kuples can be combined, wrapped types are preserved after this operation. 
Kuples were generated with [KotlinPoet](https://square.github.io/kotlinpoet/) (module `generator`).

## How to use

```kotlin
val userKuple = Kuple("skywall", 30)
val repoKuple = Kuple("https://github.com/skywall/kuple")

// Kuples combination
val combinedKuple = userKuple + repoKuple

// Kuple destruction 
val (name, age, link) = combinedKuple
```

## Download

TBD
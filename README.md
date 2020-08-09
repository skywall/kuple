# Kuple
[![](https://jitpack.io/v/skywall/kuple.svg)](https://jitpack.io/#skywall/kuple)
![Check Master](https://github.com/skywall/kuple/workflows/Check%20Master/badge.svg?branch=master)

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

Project level `build.gradle`:
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Module level `app/build.gradle`:
```groovy
dependencies {
    implementation 'com.github.skywall:kuple:1.0.0'
}
```

## Licence

```
MIT License

Copyright (c) 2020 Lukáš Sztefek

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

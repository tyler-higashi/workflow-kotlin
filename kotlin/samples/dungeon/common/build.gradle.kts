/*
 * Copyright 2017 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
  `java-library`
  kotlin("jvm")
  id("kotlinx-serialization")
}

dependencies {
  implementation(project(":workflow-ui:core-common"))
  implementation(project(":workflow-core"))
  implementation(project(":workflow-rx2"))

  implementation(get("kotlin.serialization.kaml"))
  implementation(get("kotlin.serialization.runtime"))
  implementation(get("kotlin.stdLib.jdk8"))
  implementation(get("rxjava2.rxjava2"))

  testImplementation(project(":workflow-testing"))
  testImplementation(get("kotlin.test.jdk"))
  testImplementation(get("test.truth"))
}

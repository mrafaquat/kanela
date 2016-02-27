/* =========================================================================================
 * Copyright © 2013-2016 the kamon project <http://kamon.io/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 * =========================================================================================
 */

import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    Classpaths.typesafeSnapshots,
    "Typesafe Maven Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Typesafe Maven Releases" at "http://repo.typesafe.com/typesafe/releases/"
  )

  val slf4jApi        = "org.slf4j"         % "slf4j-api"         % "1.7.13"
  val logbackCore     = "ch.qos.logback"    % "logback-core"      % "1.1.3"
  val logbackClassic  = "ch.qos.logback"    % "logback-classic"   % "1.1.3"
  val typesafeConfig  = "com.typesafe"      % "config"            % "1.3.0"
  val javaslang       = "com.javaslang"     % "javaslang"         % "2.0.0-RC3"
  val bytebuddy       = "net.bytebuddy"     % "byte-buddy"        % "1.2.0"
  val scalatest       = "org.scalatest"    %% "scalatest"         % "2.2.6"
  val mockito         = "org.mockito"       % "mockito-core"      % "2.0.42-beta"
  val lombok          = "org.projectlombok" % "lombok"            % "1.16.6"

  val kamonAgent      = "io.kamon"          % "agent_2.11"        % "0.1-SNAPSHOT" classifier "assembly"


  def compile   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")
  def provided  (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")
  def test      (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")
  def runtime   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "runtime")
  def container (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "container")
  def optional  (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile,optional")
}
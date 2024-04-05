# Changelog
All notable changes to `cnj-resilience-backend-quarkus` will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [4.0.1] - 2024-04-05
### Fixed
- added missing docker platforms to trigger multi-architecture builds

## [4.0.0] - 2024-03-05
### Added
- Tagging of git branch
### Changed
- upgraded Quarkus to version 3.8.1
- upgraded some dependencies
- upgraded Java to version 21
- upgraded Maven plugins and dependencies
- consolidated POM with other showcases
- consolidated system tests with other showcases
- commit-stage builds produce Docker images for linux/amd64 and linux/arm64/v8 platforms now
- Docker images use Generational Z garbage collector by default
- simplified POM
- Upgraded to helm-maven-plugin version 5.0.0
- Now a helm chart is packaged and pushed as an artifact during the commit-stage build
- Now the helm chart is pulled before deploying during the integration-test-stage build
- system tests are using the correct JBoss logger now
### Fixed
- improved test coverage measurement with Jacoco to include all coverage data in reports

## [3.0.0] - 2023-06-11
### Changed
- moved to new AWS CodeBuild pipeline
- moved to new AWS EKS cluster
- upgraded everything

## [2.0.0] - 2023-02-23
### Changed
- upgraded to Java 17
- upgraded to Quarkus 2.16.3
- consolidated with hello world use case

## [1.1.0] - 2022-09-09
### Added
### Changed
- improved system test WelcomeEndpointSystemTest in order to verify all resilience options

## [1.0.0] - 2022-09-02
### Added
### Changed
- first re-release after repository split

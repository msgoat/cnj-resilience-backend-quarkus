# cnj-resilience-backend-quarkus

Simple cloud native java application based on Quarkus demonstrating the application of resilience patterns
with [MicroProfile Fault Tolerance](https://quarkus.pro/guides/microprofile-fault-tolerance.html) 
when calls to downstream services are failing.

## Status

[![Build Status](https://drone.cloudtrain.aws.msgoat.eu/api/badges/msgoat/cnj-resilience-backend-quarkus/status.svg)](https://drone.cloudtrain.aws.msgoat.eu/msgoat/cnj-resilience-backend-quarkus)

## Release information

Check [changelog](changelog.md) for latest version and release information.

## Synopsis

The [WelcomeResource] (src/main/java/group/msg/at/cloud/cloudtrain/adapter/rest/in/WelcomeResource.java) returns
[WelcomeItems](src/main/java/group/msg/at/cloud/cloudtrain/core/entity/WelcomeItems.java)
for a given user.

Each `WelcomeItem` is made of domain objects retrieved via downstream services:

* [cnj-resilience-downstream-a](https://github.com/msgoat/cnj-resilience-downstream-a/blob/main/README.md) returns a list of `RecommendedItem`s representing recommended movies or TV series.
* [cnj-resilience-downstream-b](https://github.com/msgoat/cnj-resilience-downstream-b/blob/main/README.md) returns a list of `WatchedItem`s representing watched movies or TV series.

The applied resilience patterns make sure that this service stays at least partially functional even
if any the downstream services shows abnormal behaviour.

The application itself offers two REST endpoints:

* GET on `/api/v1/welcome/{userId}` is not resilient and will fail if any of the downstream services breaks.
* GET on `/api/v1/resilient/welcome/{userId}` is resilient and will keep on working even if any of the downstream services breaks.
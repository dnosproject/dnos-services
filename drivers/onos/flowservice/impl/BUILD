load("@dnos_core//tools/build/bazel:generate_workspace.bzl", "COMPILE")

COMPILE_DEPS = COMPILE + [
    "//api/flowservice:dnos-flow-service-api",
    "//config:dnos-services-config-service",
    "@org_apache_httpcomponents//jar",
    "@com_googlecode_json_simple//jar",
    "@httpcomponents_httpcore//jar",
    "@dnos_core//tools/utility:dnos-utility-rest-tools",
    "//drivers/onos/onosurls:dnos-onos-urls",



]

java_library(
    name = "dnos-onos-driver-flowservice",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
)
load("@dnos_core//tools/build/bazel:generate_workspace.bzl", "COMPILE")

COMPILE_DEPS = COMPILE + [
    "//api/flowservice:dnos-flow-service-api",
    "//api/topostore:dnos-topostore-api",
    "@dnos_core//tools/utility:dnos-utility-rest-tools",
    "//config:dnos-services-config-service",
    "//drivers/onos/onosurls:dnos-onos-urls",
    "@org_apache_httpcomponents//jar",
    "@com_googlecode_json_simple//jar",
    "@httpcomponents_httpcore//jar"
]

java_library(
    name = "dnos-onos-driver-topostore",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
)
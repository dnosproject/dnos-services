load("@dnos_core//tools/build/bazel:generate_workspace.bzl", "COMPILE")

COMPILE_DEPS = COMPILE + [
    "//api/flowservice:dnos-flow-service-api",
    "//api/topostore:dnos-topostore-api",
]

java_library(
    name = "dnos-driver-controller",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
)
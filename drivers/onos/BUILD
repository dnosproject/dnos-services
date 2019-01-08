load("@dnos_core//tools/build/bazel:generate_workspace.bzl", "COMPILE")

COMPILE_DEPS = COMPILE + [
    "//drivers/controller:dnos-driver-controller",
    "//drivers/onos/flowservice/impl:dnos-onos-driver-flowservice",
    "//drivers/onos/topostore/impl:dnos-onos-driver-topostore",


]

java_library(
    name = "dnos-onos-driver-controller",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
)
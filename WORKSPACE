workspace(name="org_dnosproject_dnos_services")

git_repository(
    name = "dnos_core",
    remote = "https://github.com/dnos-project/dnos-core.git",
    commit = "43e58213fadc0197195c99eb418d89b305a543ed"

)

load("@dnos_core//tools/build/bazel:generate_workspace.bzl", "generated_maven_jars")

generated_maven_jars()
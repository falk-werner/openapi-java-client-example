#!/bin/bash
################################################################################
# Downloads OpenAPI Generator CLI from maven central.
################################################################################

VERSION="6.6.0"
URL="https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/${VERSION}/openapi-generator-cli-${VERSION}.jar"
MD5="93f59509d7f1b045cb7a5ad044031d77"
JAR=openapi-generator-cli.jar

# Check whether jar is already downloaded.
# We don't need to download it again, if it's already there.
if [[ "${MD5}  ${JAR}" == "$(md5sum ${JAR} 2> /dev/null)" ]] ;then
    exit 0
fi

# Download jar from maven central.
curl -s "${URL}" -o "${JAR}"

# Check MD5 to prevent download errors.
#
# Note: this is not suitable as security check, it
#       only assures that no wrong file is downloaded
#       (e.g. due to version updates).
if [[ "${MD5}  ${JAR}" != "$(md5sum ${JAR})" ]] ;then
    echo "error: invalid MD5 checksum"
    mv ${JAR} "corrupt-${JAR}"
    exit 1
fi

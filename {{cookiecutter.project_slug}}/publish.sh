#!/bin/bash

set -eu

GITHUB_ACCOUNT={{cookiecutter.github_account}}
PROJECT_NAME={{cookiecutter.project_slug}}

TMP=/tmp/pages.${PROJECT_NAME}

./gradlew testDebugUnitTest connectedAndroidTest generateReleaseJavadoc bintrayUpload
rm -rf ${TMP}
mv core/build/docs/javadoc ${TMP}
cd ${TMP}
git init
git checkout -b gh-pages
git add .
git commit -am init
git remote add origin git@github.com:${GITHUB_ACCOUNT}/${PROJECT_NAME}.git
git push origin gh-pages -f

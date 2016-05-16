#!/bin/bash

sed -i -e "s|%SDK-PATH-FILL-ME%|${ANDROID_HOME}|g" local.properties
git init
git remote add origin git@github.com:{{cookiecutter.github_account}}/{{cookiecutter.project_slug}}.git
git add .
git commit -am init

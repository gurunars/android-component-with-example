# {{cookiecutter.project_name}}

## Usage

Add the following to your app's **build.gradle**:

    dependencies {
        ...
        compile ('com.{{cookiecutter.java_group_name}}.{{cookiecutter.java_name}}:core:0.+@aar') {
            transitive = true
        }
        ...
    }

Check the **example** app for a reference.

Check [javadoc](https://{{cookiecutter.java_group_name}}.github.io/{{cookiecutter.project_slug}}/)
for usage information.

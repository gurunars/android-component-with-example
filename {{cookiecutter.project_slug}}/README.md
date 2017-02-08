# {{cookiecutter.project_name}}

## Usage

Add the following to your app's **build.gradle**:

    dependencies {
        ...
        compile ('com.{{cookiecuter.java_group_name}}.{{cookiecutter.java_name}}:core:0.+@aar') {
            transitive = true
        }
        ...
    }

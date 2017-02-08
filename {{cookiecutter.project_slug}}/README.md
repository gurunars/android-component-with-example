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

## More information

Check the **example** app for a reference.

Check [javadoc](https://{{cookiecuter.java_group_name}}.github.io/{{cookiecutter.project_slug}}/).
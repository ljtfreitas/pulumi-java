// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionDockerArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionPythonArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionRArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionSparkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details of the AZURE ML environment.
 * 
 */
public final class EnvironmentImageRequestEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentImageRequestEnvironmentArgs Empty = new EnvironmentImageRequestEnvironmentArgs();

    /**
     * The definition of a Docker container.
     * 
     */
    @InputImport(name="docker")
    private final @Nullable Input<ModelEnvironmentDefinitionDockerArgs> docker;

    public Input<ModelEnvironmentDefinitionDockerArgs> getDocker() {
        return this.docker == null ? Input.empty() : this.docker;
    }

    /**
     * Definition of environment variables to be defined in the environment.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: "latest".
     * 
     */
    @InputImport(name="inferencingStackVersion")
    private final @Nullable Input<String> inferencingStackVersion;

    public Input<String> getInferencingStackVersion() {
        return this.inferencingStackVersion == null ? Input.empty() : this.inferencingStackVersion;
    }

    /**
     * The name of the environment.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Settings for a Python environment.
     * 
     */
    @InputImport(name="python")
    private final @Nullable Input<ModelEnvironmentDefinitionPythonArgs> python;

    public Input<ModelEnvironmentDefinitionPythonArgs> getPython() {
        return this.python == null ? Input.empty() : this.python;
    }

    /**
     * Settings for a R environment.
     * 
     */
    @InputImport(name="r")
    private final @Nullable Input<ModelEnvironmentDefinitionRArgs> r;

    public Input<ModelEnvironmentDefinitionRArgs> getR() {
        return this.r == null ? Input.empty() : this.r;
    }

    /**
     * The configuration for a Spark environment.
     * 
     */
    @InputImport(name="spark")
    private final @Nullable Input<ModelEnvironmentDefinitionSparkArgs> spark;

    public Input<ModelEnvironmentDefinitionSparkArgs> getSpark() {
        return this.spark == null ? Input.empty() : this.spark;
    }

    /**
     * The environment version.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public EnvironmentImageRequestEnvironmentArgs(
        @Nullable Input<ModelEnvironmentDefinitionDockerArgs> docker,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> inferencingStackVersion,
        @Nullable Input<String> name,
        @Nullable Input<ModelEnvironmentDefinitionPythonArgs> python,
        @Nullable Input<ModelEnvironmentDefinitionRArgs> r,
        @Nullable Input<ModelEnvironmentDefinitionSparkArgs> spark,
        @Nullable Input<String> version) {
        this.docker = docker;
        this.environmentVariables = environmentVariables;
        this.inferencingStackVersion = inferencingStackVersion;
        this.name = name;
        this.python = python;
        this.r = r;
        this.spark = spark;
        this.version = version;
    }

    private EnvironmentImageRequestEnvironmentArgs() {
        this.docker = Input.empty();
        this.environmentVariables = Input.empty();
        this.inferencingStackVersion = Input.empty();
        this.name = Input.empty();
        this.python = Input.empty();
        this.r = Input.empty();
        this.spark = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentImageRequestEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ModelEnvironmentDefinitionDockerArgs> docker;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> inferencingStackVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<ModelEnvironmentDefinitionPythonArgs> python;
        private @Nullable Input<ModelEnvironmentDefinitionRArgs> r;
        private @Nullable Input<ModelEnvironmentDefinitionSparkArgs> spark;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentImageRequestEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.docker = defaults.docker;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inferencingStackVersion = defaults.inferencingStackVersion;
    	      this.name = defaults.name;
    	      this.python = defaults.python;
    	      this.r = defaults.r;
    	      this.spark = defaults.spark;
    	      this.version = defaults.version;
        }

        public Builder setDocker(@Nullable Input<ModelEnvironmentDefinitionDockerArgs> docker) {
            this.docker = docker;
            return this;
        }

        public Builder setDocker(@Nullable ModelEnvironmentDefinitionDockerArgs docker) {
            this.docker = Input.ofNullable(docker);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setInferencingStackVersion(@Nullable Input<String> inferencingStackVersion) {
            this.inferencingStackVersion = inferencingStackVersion;
            return this;
        }

        public Builder setInferencingStackVersion(@Nullable String inferencingStackVersion) {
            this.inferencingStackVersion = Input.ofNullable(inferencingStackVersion);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPython(@Nullable Input<ModelEnvironmentDefinitionPythonArgs> python) {
            this.python = python;
            return this;
        }

        public Builder setPython(@Nullable ModelEnvironmentDefinitionPythonArgs python) {
            this.python = Input.ofNullable(python);
            return this;
        }

        public Builder setR(@Nullable Input<ModelEnvironmentDefinitionRArgs> r) {
            this.r = r;
            return this;
        }

        public Builder setR(@Nullable ModelEnvironmentDefinitionRArgs r) {
            this.r = Input.ofNullable(r);
            return this;
        }

        public Builder setSpark(@Nullable Input<ModelEnvironmentDefinitionSparkArgs> spark) {
            this.spark = spark;
            return this;
        }

        public Builder setSpark(@Nullable ModelEnvironmentDefinitionSparkArgs spark) {
            this.spark = Input.ofNullable(spark);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public EnvironmentImageRequestEnvironmentArgs build() {
            return new EnvironmentImageRequestEnvironmentArgs(docker, environmentVariables, inferencingStackVersion, name, python, r, spark, version);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TriggerBuildAvailableSecretsSecretManagerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildAvailableSecretsSecretManagerGetArgs Empty = new TriggerBuildAvailableSecretsSecretManagerGetArgs();

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    @Import(name="env", required=true)
      private final Output<String> env;

    public Output<String> getEnv() {
        return this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @Import(name="versionName", required=true)
      private final Output<String> versionName;

    public Output<String> getVersionName() {
        return this.versionName;
    }

    public TriggerBuildAvailableSecretsSecretManagerGetArgs(
        Output<String> env,
        Output<String> versionName) {
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private TriggerBuildAvailableSecretsSecretManagerGetArgs() {
        this.env = Output.empty();
        this.versionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecretsSecretManagerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> env;
        private Output<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildAvailableSecretsSecretManagerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder env(Output<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder env(String env) {
            this.env = Output.of(Objects.requireNonNull(env));
            return this;
        }

        public Builder versionName(Output<String> versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }

        public Builder versionName(String versionName) {
            this.versionName = Output.of(Objects.requireNonNull(versionName));
            return this;
        }
        public TriggerBuildAvailableSecretsSecretManagerGetArgs build() {
            return new TriggerBuildAvailableSecretsSecretManagerGetArgs(env, versionName);
        }
    }
}

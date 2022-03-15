// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.RegistryImageBuildArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryImageArgs Empty = new RegistryImageArgs();

    /**
     * Definition for building the image
     * 
     */
    @Import(name="build")
      private final @Nullable Output<RegistryImageBuildArgs> build;

    public Output<RegistryImageBuildArgs> getBuild() {
        return this.build == null ? Output.empty() : this.build;
    }

    /**
     * If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     */
    @Import(name="insecureSkipVerify")
      private final @Nullable Output<Boolean> insecureSkipVerify;

    public Output<Boolean> getInsecureSkipVerify() {
        return this.insecureSkipVerify == null ? Output.empty() : this.insecureSkipVerify;
    }

    /**
     * If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker registry on destroy operation. Defaults to `false`
     * 
     */
    @Import(name="keepRemotely")
      private final @Nullable Output<Boolean> keepRemotely;

    public Output<Boolean> getKeepRemotely() {
        return this.keepRemotely == null ? Output.empty() : this.keepRemotely;
    }

    /**
     * The name of the Docker image.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public RegistryImageArgs(
        @Nullable Output<RegistryImageBuildArgs> build,
        @Nullable Output<Boolean> insecureSkipVerify,
        @Nullable Output<Boolean> keepRemotely,
        @Nullable Output<String> name) {
        this.build = build;
        this.insecureSkipVerify = insecureSkipVerify;
        this.keepRemotely = keepRemotely;
        this.name = name;
    }

    private RegistryImageArgs() {
        this.build = Output.empty();
        this.insecureSkipVerify = Output.empty();
        this.keepRemotely = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegistryImageBuildArgs> build;
        private @Nullable Output<Boolean> insecureSkipVerify;
        private @Nullable Output<Boolean> keepRemotely;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.insecureSkipVerify = defaults.insecureSkipVerify;
    	      this.keepRemotely = defaults.keepRemotely;
    	      this.name = defaults.name;
        }

        public Builder build(@Nullable Output<RegistryImageBuildArgs> build) {
            this.build = build;
            return this;
        }

        public Builder build(@Nullable RegistryImageBuildArgs build) {
            this.build = Output.ofNullable(build);
            return this;
        }

        public Builder insecureSkipVerify(@Nullable Output<Boolean> insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
            return this;
        }

        public Builder insecureSkipVerify(@Nullable Boolean insecureSkipVerify) {
            this.insecureSkipVerify = Output.ofNullable(insecureSkipVerify);
            return this;
        }

        public Builder keepRemotely(@Nullable Output<Boolean> keepRemotely) {
            this.keepRemotely = keepRemotely;
            return this;
        }

        public Builder keepRemotely(@Nullable Boolean keepRemotely) {
            this.keepRemotely = Output.ofNullable(keepRemotely);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public RegistryImageArgs build() {
            return new RegistryImageArgs(build, insecureSkipVerify, keepRemotely, name);
        }
    }
}

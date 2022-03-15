// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ContainerResourcesResponse;
import io.pulumi.azurenative.web.inputs.EnvironmentVarResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container definition.
 * 
 */
public final class ContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerResponse Empty = new ContainerResponse();

    /**
     * Container start command arguments.
     * 
     */
    @Import(name="args")
      private final @Nullable List<String> args;

    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }

    /**
     * Container start command.
     * 
     */
    @Import(name="command")
      private final @Nullable List<String> command;

    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }

    /**
     * Container environment variables.
     * 
     */
    @Import(name="env")
      private final @Nullable List<EnvironmentVarResponse> env;

    public List<EnvironmentVarResponse> getEnv() {
        return this.env == null ? List.of() : this.env;
    }

    /**
     * Container image tag.
     * 
     */
    @Import(name="image")
      private final @Nullable String image;

    public Optional<String> getImage() {
        return this.image == null ? Optional.empty() : Optional.ofNullable(this.image);
    }

    /**
     * Custom container name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Container resource requirements.
     * 
     */
    @Import(name="resources")
      private final @Nullable ContainerResourcesResponse resources;

    public Optional<ContainerResourcesResponse> getResources() {
        return this.resources == null ? Optional.empty() : Optional.ofNullable(this.resources);
    }

    public ContainerResponse(
        @Nullable List<String> args,
        @Nullable List<String> command,
        @Nullable List<EnvironmentVarResponse> env,
        @Nullable String image,
        @Nullable String name,
        @Nullable ContainerResourcesResponse resources) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.image = image;
        this.name = name;
        this.resources = resources;
    }

    private ContainerResponse() {
        this.args = List.of();
        this.command = List.of();
        this.env = List.of();
        this.image = null;
        this.name = null;
        this.resources = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> command;
        private @Nullable List<EnvironmentVarResponse> env;
        private @Nullable String image;
        private @Nullable String name;
        private @Nullable ContainerResourcesResponse resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.resources = defaults.resources;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder env(@Nullable List<EnvironmentVarResponse> env) {
            this.env = env;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder resources(@Nullable ContainerResourcesResponse resources) {
            this.resources = resources;
            return this;
        }
        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, image, name, resources);
        }
    }
}

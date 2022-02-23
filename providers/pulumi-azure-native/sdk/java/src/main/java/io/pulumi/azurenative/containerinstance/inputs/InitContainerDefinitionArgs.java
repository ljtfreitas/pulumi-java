// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.containerinstance.inputs.VolumeMountArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The init container definition.
 * 
 */
public final class InitContainerDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final InitContainerDefinitionArgs Empty = new InitContainerDefinitionArgs();

    /**
     * The command to execute within the init container in exec form.
     * 
     */
    @InputImport(name="command")
        private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    /**
     * The environment variables to set in the init container.
     * 
     */
    @InputImport(name="environmentVariables")
        private final @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;

    public Input<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The image of the init container.
     * 
     */
    @InputImport(name="image")
        private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * The name for the init container.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The volume mounts available to the init container.
     * 
     */
    @InputImport(name="volumeMounts")
        private final @Nullable Input<List<VolumeMountArgs>> volumeMounts;

    public Input<List<VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Input.empty() : this.volumeMounts;
    }

    public InitContainerDefinitionArgs(
        @Nullable Input<List<String>> command,
        @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables,
        @Nullable Input<String> image,
        Input<String> name,
        @Nullable Input<List<VolumeMountArgs>> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = image;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.volumeMounts = volumeMounts;
    }

    private InitContainerDefinitionArgs() {
        this.command = Input.empty();
        this.environmentVariables = Input.empty();
        this.image = Input.empty();
        this.name = Input.empty();
        this.volumeMounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;
        private @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;
        private @Nullable Input<String> image;
        private Input<String> name;
        private @Nullable Input<List<VolumeMountArgs>> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(InitContainerDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder setCommand(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setVolumeMounts(@Nullable Input<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Input.ofNullable(volumeMounts);
            return this;
        }
        public InitContainerDefinitionArgs build() {
            return new InitContainerDefinitionArgs(command, environmentVariables, image, name, volumeMounts);
        }
    }
}

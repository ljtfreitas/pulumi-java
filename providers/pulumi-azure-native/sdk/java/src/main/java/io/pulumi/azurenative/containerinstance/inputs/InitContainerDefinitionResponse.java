// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.containerinstance.inputs.InitContainerPropertiesDefinitionResponseInstanceView;
import io.pulumi.azurenative.containerinstance.inputs.VolumeMountResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The init container definition.
 * 
 */
public final class InitContainerDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final InitContainerDefinitionResponse Empty = new InitContainerDefinitionResponse();

    /**
     * The command to execute within the init container in exec form.
     * 
     */
    @InputImport(name="command")
    private final @Nullable List<String> command;

    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }

    /**
     * The environment variables to set in the init container.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;

    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }

    /**
     * The image of the init container.
     * 
     */
    @InputImport(name="image")
    private final @Nullable String image;

    public Optional<String> getImage() {
        return this.image == null ? Optional.empty() : Optional.ofNullable(this.image);
    }

    /**
     * The instance view of the init container. Only valid in response.
     * 
     */
    @InputImport(name="instanceView", required=true)
    private final InitContainerPropertiesDefinitionResponseInstanceView instanceView;

    public InitContainerPropertiesDefinitionResponseInstanceView getInstanceView() {
        return this.instanceView;
    }

    /**
     * The name for the init container.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The volume mounts available to the init container.
     * 
     */
    @InputImport(name="volumeMounts")
    private final @Nullable List<VolumeMountResponse> volumeMounts;

    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public InitContainerDefinitionResponse(
        @Nullable List<String> command,
        @Nullable List<EnvironmentVariableResponse> environmentVariables,
        @Nullable String image,
        InitContainerPropertiesDefinitionResponseInstanceView instanceView,
        String name,
        @Nullable List<VolumeMountResponse> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = image;
        this.instanceView = Objects.requireNonNull(instanceView, "expected parameter 'instanceView' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.volumeMounts = volumeMounts;
    }

    private InitContainerDefinitionResponse() {
        this.command = List.of();
        this.environmentVariables = List.of();
        this.image = null;
        this.instanceView = null;
        this.name = null;
        this.volumeMounts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private @Nullable String image;
        private InitContainerPropertiesDefinitionResponseInstanceView instanceView;
        private String name;
        private @Nullable List<VolumeMountResponse> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(InitContainerDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.instanceView = defaults.instanceView;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder setInstanceView(InitContainerPropertiesDefinitionResponseInstanceView instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public InitContainerDefinitionResponse build() {
            return new InitContainerDefinitionResponse(command, environmentVariables, image, instanceView, name, volumeMounts);
        }
    }
}

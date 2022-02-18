// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.ContainerPortResponse;
import io.pulumi.azurenative.containerinstance.outputs.ContainerProbeResponse;
import io.pulumi.azurenative.containerinstance.outputs.ContainerPropertiesResponseInstanceView;
import io.pulumi.azurenative.containerinstance.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.containerinstance.outputs.ResourceRequirementsResponse;
import io.pulumi.azurenative.containerinstance.outputs.VolumeMountResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerResponse {
    /**
     * The commands to execute within the container instance in exec form.
     * 
     */
    private final @Nullable List<String> command;
    /**
     * The environment variables to set in the container instance.
     * 
     */
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * The name of the image used to create the container instance.
     * 
     */
    private final String image;
    /**
     * The instance view of the container instance. Only valid in response.
     * 
     */
    private final ContainerPropertiesResponseInstanceView instanceView;
    /**
     * The liveness probe.
     * 
     */
    private final @Nullable ContainerProbeResponse livenessProbe;
    /**
     * The user-provided name of the container instance.
     * 
     */
    private final String name;
    /**
     * The exposed ports on the container instance.
     * 
     */
    private final @Nullable List<ContainerPortResponse> ports;
    /**
     * The readiness probe.
     * 
     */
    private final @Nullable ContainerProbeResponse readinessProbe;
    /**
     * The resource requirements of the container instance.
     * 
     */
    private final ResourceRequirementsResponse resources;
    /**
     * The volume mounts available to the container instance.
     * 
     */
    private final @Nullable List<VolumeMountResponse> volumeMounts;

    @OutputCustomType.Constructor({"command","environmentVariables","image","instanceView","livenessProbe","name","ports","readinessProbe","resources","volumeMounts"})
    private ContainerResponse(
        @Nullable List<String> command,
        @Nullable List<EnvironmentVariableResponse> environmentVariables,
        String image,
        ContainerPropertiesResponseInstanceView instanceView,
        @Nullable ContainerProbeResponse livenessProbe,
        String name,
        @Nullable List<ContainerPortResponse> ports,
        @Nullable ContainerProbeResponse readinessProbe,
        ResourceRequirementsResponse resources,
        @Nullable List<VolumeMountResponse> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image);
        this.instanceView = Objects.requireNonNull(instanceView);
        this.livenessProbe = livenessProbe;
        this.name = Objects.requireNonNull(name);
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = Objects.requireNonNull(resources);
        this.volumeMounts = volumeMounts;
    }

    /**
     * The commands to execute within the container instance in exec form.
     * 
     */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * The environment variables to set in the container instance.
     * 
     */
    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * The name of the image used to create the container instance.
     * 
     */
    public String getImage() {
        return this.image;
    }
    /**
     * The instance view of the container instance. Only valid in response.
     * 
     */
    public ContainerPropertiesResponseInstanceView getInstanceView() {
        return this.instanceView;
    }
    /**
     * The liveness probe.
     * 
     */
    public Optional<ContainerProbeResponse> getLivenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }
    /**
     * The user-provided name of the container instance.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The exposed ports on the container instance.
     * 
     */
    public List<ContainerPortResponse> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * The readiness probe.
     * 
     */
    public Optional<ContainerProbeResponse> getReadinessProbe() {
        return Optional.ofNullable(this.readinessProbe);
    }
    /**
     * The resource requirements of the container instance.
     * 
     */
    public ResourceRequirementsResponse getResources() {
        return this.resources;
    }
    /**
     * The volume mounts available to the container instance.
     * 
     */
    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private String image;
        private ContainerPropertiesResponseInstanceView instanceView;
        private @Nullable ContainerProbeResponse livenessProbe;
        private String name;
        private @Nullable List<ContainerPortResponse> ports;
        private @Nullable ContainerProbeResponse readinessProbe;
        private ResourceRequirementsResponse resources;
        private @Nullable List<VolumeMountResponse> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.instanceView = defaults.instanceView;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
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

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setInstanceView(ContainerPropertiesResponseInstanceView instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setLivenessProbe(@Nullable ContainerProbeResponse livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPorts(@Nullable List<ContainerPortResponse> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setReadinessProbe(@Nullable ContainerProbeResponse readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder setResources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public ContainerResponse build() {
            return new ContainerResponse(command, environmentVariables, image, instanceView, livenessProbe, name, ports, readinessProbe, resources, volumeMounts);
        }
    }
}

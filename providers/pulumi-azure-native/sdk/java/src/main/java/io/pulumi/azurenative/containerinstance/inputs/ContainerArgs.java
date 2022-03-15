// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerPortArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerProbeArgs;
import io.pulumi.azurenative.containerinstance.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.containerinstance.inputs.ResourceRequirementsArgs;
import io.pulumi.azurenative.containerinstance.inputs.VolumeMountArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A container instance.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The commands to execute within the container instance in exec form.
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * The environment variables to set in the container instance.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    public Output<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * The name of the image used to create the container instance.
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * The liveness probe.
     * 
     */
    @Import(name="livenessProbe")
      private final @Nullable Output<ContainerProbeArgs> livenessProbe;

    public Output<ContainerProbeArgs> getLivenessProbe() {
        return this.livenessProbe == null ? Output.empty() : this.livenessProbe;
    }

    /**
     * The user-provided name of the container instance.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The exposed ports on the container instance.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ContainerPortArgs>> ports;

    public Output<List<ContainerPortArgs>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * The readiness probe.
     * 
     */
    @Import(name="readinessProbe")
      private final @Nullable Output<ContainerProbeArgs> readinessProbe;

    public Output<ContainerProbeArgs> getReadinessProbe() {
        return this.readinessProbe == null ? Output.empty() : this.readinessProbe;
    }

    /**
     * The resource requirements of the container instance.
     * 
     */
    @Import(name="resources", required=true)
      private final Output<ResourceRequirementsArgs> resources;

    public Output<ResourceRequirementsArgs> getResources() {
        return this.resources;
    }

    /**
     * The volume mounts available to the container instance.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<VolumeMountArgs>> volumeMounts;

    public Output<List<VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Output.empty() : this.volumeMounts;
    }

    public ContainerArgs(
        @Nullable Output<List<String>> command,
        @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables,
        Output<String> image,
        @Nullable Output<ContainerProbeArgs> livenessProbe,
        Output<String> name,
        @Nullable Output<List<ContainerPortArgs>> ports,
        @Nullable Output<ContainerProbeArgs> readinessProbe,
        Output<ResourceRequirementsArgs> resources,
        @Nullable Output<List<VolumeMountArgs>> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.livenessProbe = livenessProbe;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.volumeMounts = volumeMounts;
    }

    private ContainerArgs() {
        this.command = Output.empty();
        this.environmentVariables = Output.empty();
        this.image = Output.empty();
        this.livenessProbe = Output.empty();
        this.name = Output.empty();
        this.ports = Output.empty();
        this.readinessProbe = Output.empty();
        this.resources = Output.empty();
        this.volumeMounts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> command;
        private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;
        private Output<String> image;
        private @Nullable Output<ContainerProbeArgs> livenessProbe;
        private Output<String> name;
        private @Nullable Output<List<ContainerPortArgs>> ports;
        private @Nullable Output<ContainerProbeArgs> readinessProbe;
        private Output<ResourceRequirementsArgs> resources;
        private @Nullable Output<List<VolumeMountArgs>> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }

        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }

        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder livenessProbe(@Nullable Output<ContainerProbeArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder livenessProbe(@Nullable ContainerProbeArgs livenessProbe) {
            this.livenessProbe = Output.ofNullable(livenessProbe);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder ports(@Nullable Output<List<ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<ContainerPortArgs> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }

        public Builder readinessProbe(@Nullable Output<ContainerProbeArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder readinessProbe(@Nullable ContainerProbeArgs readinessProbe) {
            this.readinessProbe = Output.ofNullable(readinessProbe);
            return this;
        }

        public Builder resources(Output<ResourceRequirementsArgs> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder resources(ResourceRequirementsArgs resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }

        public Builder volumeMounts(@Nullable Output<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder volumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Output.ofNullable(volumeMounts);
            return this;
        }
        public ContainerArgs build() {
            return new ContainerArgs(command, environmentVariables, image, livenessProbe, name, ports, readinessProbe, resources, volumeMounts);
        }
    }
}

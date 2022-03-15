// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeArgs Empty = new RuntimeArgs();

    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="accessConfig")
      private final @Nullable Output<RuntimeAccessConfigArgs> accessConfig;

    public Output<RuntimeAccessConfigArgs> getAccessConfig() {
        return this.accessConfig == null ? Output.empty() : this.accessConfig;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;

    public Output<RuntimeSoftwareConfigArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Output.empty() : this.softwareConfig;
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachine")
      private final @Nullable Output<RuntimeVirtualMachineArgs> virtualMachine;

    public Output<RuntimeVirtualMachineArgs> getVirtualMachine() {
        return this.virtualMachine == null ? Output.empty() : this.virtualMachine;
    }

    public RuntimeArgs(
        @Nullable Output<RuntimeAccessConfigArgs> accessConfig,
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig,
        @Nullable Output<RuntimeVirtualMachineArgs> virtualMachine) {
        this.accessConfig = accessConfig;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.project = project;
        this.softwareConfig = softwareConfig;
        this.virtualMachine = virtualMachine;
    }

    private RuntimeArgs() {
        this.accessConfig = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.softwareConfig = Output.empty();
        this.virtualMachine = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeAccessConfigArgs> accessConfig;
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;
        private @Nullable Output<RuntimeVirtualMachineArgs> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfig = defaults.accessConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigArgs> accessConfig) {
            this.accessConfig = accessConfig;
            return this;
        }

        public Builder accessConfig(@Nullable RuntimeAccessConfigArgs accessConfig) {
            this.accessConfig = Output.ofNullable(accessConfig);
            return this;
        }

        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder softwareConfig(@Nullable RuntimeSoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Output.ofNullable(softwareConfig);
            return this;
        }

        public Builder virtualMachine(@Nullable Output<RuntimeVirtualMachineArgs> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }

        public Builder virtualMachine(@Nullable RuntimeVirtualMachineArgs virtualMachine) {
            this.virtualMachine = Output.ofNullable(virtualMachine);
            return this;
        }
        public RuntimeArgs build() {
            return new RuntimeArgs(accessConfig, location, name, project, softwareConfig, virtualMachine);
        }
    }
}

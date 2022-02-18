// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.IPConfigurationProfileArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container network interface configuration child resource.
 * 
 */
public final class ContainerNetworkInterfaceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerNetworkInterfaceConfigurationArgs Empty = new ContainerNetworkInterfaceConfigurationArgs();

    /**
     * A list of container network interfaces created from this container network interface configuration.
     * 
     */
    @InputImport(name="containerNetworkInterfaces")
    private final @Nullable Input<List<SubResourceArgs>> containerNetworkInterfaces;

    public Input<List<SubResourceArgs>> getContainerNetworkInterfaces() {
        return this.containerNetworkInterfaces == null ? Input.empty() : this.containerNetworkInterfaces;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * A list of ip configurations of the container network interface configuration.
     * 
     */
    @InputImport(name="ipConfigurations")
    private final @Nullable Input<List<IPConfigurationProfileArgs>> ipConfigurations;

    public Input<List<IPConfigurationProfileArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
    }

    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ContainerNetworkInterfaceConfigurationArgs(
        @Nullable Input<List<SubResourceArgs>> containerNetworkInterfaces,
        @Nullable Input<String> id,
        @Nullable Input<List<IPConfigurationProfileArgs>> ipConfigurations,
        @Nullable Input<String> name) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
    }

    private ContainerNetworkInterfaceConfigurationArgs() {
        this.containerNetworkInterfaces = Input.empty();
        this.id = Input.empty();
        this.ipConfigurations = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkInterfaceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SubResourceArgs>> containerNetworkInterfaces;
        private @Nullable Input<String> id;
        private @Nullable Input<List<IPConfigurationProfileArgs>> ipConfigurations;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkInterfaceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
        }

        public Builder setContainerNetworkInterfaces(@Nullable Input<List<SubResourceArgs>> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = containerNetworkInterfaces;
            return this;
        }

        public Builder setContainerNetworkInterfaces(@Nullable List<SubResourceArgs> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = Input.ofNullable(containerNetworkInterfaces);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpConfigurations(@Nullable Input<List<IPConfigurationProfileArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<IPConfigurationProfileArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
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

        public ContainerNetworkInterfaceConfigurationArgs build() {
            return new ContainerNetworkInterfaceConfigurationArgs(containerNetworkInterfaces, id, ipConfigurations, name);
        }
    }
}

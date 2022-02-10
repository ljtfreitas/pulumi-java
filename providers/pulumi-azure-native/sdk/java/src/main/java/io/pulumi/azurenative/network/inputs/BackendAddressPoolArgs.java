// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.LoadBalancerBackendAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendAddressPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendAddressPoolArgs Empty = new BackendAddressPoolArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="loadBalancerBackendAddresses")
    private final @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses;

    public Input<List<LoadBalancerBackendAddressArgs>> getLoadBalancerBackendAddresses() {
        return this.loadBalancerBackendAddresses == null ? Input.empty() : this.loadBalancerBackendAddresses;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BackendAddressPoolArgs(
        @Nullable Input<String> id,
        @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses,
        @Nullable Input<String> location,
        @Nullable Input<String> name) {
        this.id = id;
        this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
        this.location = location;
        this.name = name;
    }

    private BackendAddressPoolArgs() {
        this.id = Input.empty();
        this.loadBalancerBackendAddresses = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendAddressPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddresses = defaults.loadBalancerBackendAddresses;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLoadBalancerBackendAddresses(@Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses) {
            this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
            return this;
        }

        public Builder setLoadBalancerBackendAddresses(@Nullable List<LoadBalancerBackendAddressArgs> loadBalancerBackendAddresses) {
            this.loadBalancerBackendAddresses = Input.ofNullable(loadBalancerBackendAddresses);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public BackendAddressPoolArgs build() {
            return new BackendAddressPoolArgs(id, loadBalancerBackendAddresses, location, name);
        }
    }
}
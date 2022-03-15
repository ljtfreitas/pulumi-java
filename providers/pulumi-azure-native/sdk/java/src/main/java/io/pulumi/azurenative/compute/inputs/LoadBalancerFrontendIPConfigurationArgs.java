// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LoadBalancerFrontendIPConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerFrontendIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerFrontendIPConfigurationArgs Empty = new LoadBalancerFrontendIPConfigurationArgs();

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Properties of load balancer frontend ip configuration.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties;

    public Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> getProperties() {
        return this.properties;
    }

    public LoadBalancerFrontendIPConfigurationArgs(
        Output<String> name,
        Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private LoadBalancerFrontendIPConfigurationArgs() {
        this.name = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFrontendIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerFrontendIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder properties(Output<LoadBalancerFrontendIPConfigurationPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(LoadBalancerFrontendIPConfigurationPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public LoadBalancerFrontendIPConfigurationArgs build() {
            return new LoadBalancerFrontendIPConfigurationArgs(name, properties);
        }
    }
}

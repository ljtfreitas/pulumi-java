// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LoadBalancerFrontendIPConfigurationPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerFrontendIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerFrontendIPConfigurationResponse Empty = new LoadBalancerFrontendIPConfigurationResponse();

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Properties of load balancer frontend ip configuration.
     * 
     */
    @InputImport(name="properties", required=true)
        private final LoadBalancerFrontendIPConfigurationPropertiesResponse properties;

    public LoadBalancerFrontendIPConfigurationPropertiesResponse getProperties() {
        return this.properties;
    }

    public LoadBalancerFrontendIPConfigurationResponse(
        String name,
        LoadBalancerFrontendIPConfigurationPropertiesResponse properties) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private LoadBalancerFrontendIPConfigurationResponse() {
        this.name = null;
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private LoadBalancerFrontendIPConfigurationPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerFrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(LoadBalancerFrontendIPConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public LoadBalancerFrontendIPConfigurationResponse build() {
            return new LoadBalancerFrontendIPConfigurationResponse(name, properties);
        }
    }
}

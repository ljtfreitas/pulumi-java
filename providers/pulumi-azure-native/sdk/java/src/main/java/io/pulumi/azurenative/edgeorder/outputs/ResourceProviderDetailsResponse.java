// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceProviderDetailsResponse {
    /**
     * Resource provider namespace
     * 
     */
    private final String resourceProviderNamespace;

    @CustomType.Constructor
    private ResourceProviderDetailsResponse(@CustomType.Parameter("resourceProviderNamespace") String resourceProviderNamespace) {
        this.resourceProviderNamespace = resourceProviderNamespace;
    }

    /**
     * Resource provider namespace
     * 
    */
    public String getResourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceProviderNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
        }

        public Builder resourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }
        public ResourceProviderDetailsResponse build() {
            return new ResourceProviderDetailsResponse(resourceProviderNamespace);
        }
    }
}

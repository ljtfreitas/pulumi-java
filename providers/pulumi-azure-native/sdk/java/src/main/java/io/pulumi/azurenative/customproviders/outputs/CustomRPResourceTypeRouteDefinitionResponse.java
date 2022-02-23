// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomRPResourceTypeRouteDefinitionResponse {
    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a path (e.g. 'https://testendpoint/{requestPath}')
     * 
     */
    private final String endpoint;
    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     * 
     */
    private final String name;
    /**
     * The routing types that are supported for resource requests.
     * 
     */
    private final @Nullable String routingType;

    @OutputCustomType.Constructor({"endpoint","name","routingType"})
    private CustomRPResourceTypeRouteDefinitionResponse(
        String endpoint,
        String name,
        @Nullable String routingType) {
        this.endpoint = Objects.requireNonNull(endpoint);
        this.name = Objects.requireNonNull(name);
        this.routingType = routingType;
    }

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a path (e.g. 'https://testendpoint/{requestPath}')
     * 
     */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The routing types that are supported for resource requests.
     * 
     */
    public Optional<String> getRoutingType() {
        return Optional.ofNullable(this.routingType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String name;
        private @Nullable String routingType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPResourceTypeRouteDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.routingType = defaults.routingType;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRoutingType(@Nullable String routingType) {
            this.routingType = routingType;
            return this;
        }
        public CustomRPResourceTypeRouteDefinitionResponse build() {
            return new CustomRPResourceTypeRouteDefinitionResponse(endpoint, name, routingType);
        }
    }
}

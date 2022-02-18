// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.outputs;

import io.pulumi.azurenative.customproviders.outputs.CustomRPActionRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPResourceTypeRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPValidationsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCustomResourceProviderResult {
    /**
     * A list of actions that the custom resource provider implements.
     * 
     */
    private final @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state of the resource provider.
     * 
     */
    private final String provisioningState;
    /**
     * A list of resource types that the custom resource provider implements.
     * 
     */
    private final @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * A list of validations to run on the custom resource provider's requests.
     * 
     */
    private final @Nullable List<CustomRPValidationsResponse> validations;

    @OutputCustomType.Constructor({"actions","id","location","name","provisioningState","resourceTypes","tags","type","validations"})
    private GetCustomResourceProviderResult(
        @Nullable List<CustomRPActionRouteDefinitionResponse> actions,
        String id,
        String location,
        String name,
        String provisioningState,
        @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<CustomRPValidationsResponse> validations) {
        this.actions = actions;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceTypes = resourceTypes;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.validations = validations;
    }

    /**
     * A list of actions that the custom resource provider implements.
     * 
     */
    public List<CustomRPActionRouteDefinitionResponse> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the resource provider.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * A list of resource types that the custom resource provider implements.
     * 
     */
    public List<CustomRPResourceTypeRouteDefinitionResponse> getResourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * A list of validations to run on the custom resource provider's requests.
     * 
     */
    public List<CustomRPValidationsResponse> getValidations() {
        return this.validations == null ? List.of() : this.validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomResourceProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<CustomRPValidationsResponse> validations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomResourceProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validations = defaults.validations;
        }

        public Builder setActions(@Nullable List<CustomRPActionRouteDefinitionResponse> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceTypes(@Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidations(@Nullable List<CustomRPValidationsResponse> validations) {
            this.validations = validations;
            return this;
        }

        public GetCustomResourceProviderResult build() {
            return new GetCustomResourceProviderResult(actions, id, location, name, provisioningState, resourceTypes, tags, type, validations);
        }
    }
}

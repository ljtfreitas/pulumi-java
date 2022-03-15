// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ServiceEndpointPolicyDefinitionResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceEndpointPolicyResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the service endpoint policy resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the service endpoint policy resource.
     * 
     */
    private final String resourceGuid;
    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    private final @Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions;
    /**
     * A collection of references to subnets.
     * 
     */
    private final List<SubnetResponse> subnets;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServiceEndpointPolicyResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("serviceEndpointPolicyDefinitions") @Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions,
        @CustomType.Parameter("subnets") List<SubnetResponse> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the service endpoint policy resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the service endpoint policy resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
    */
    public List<ServiceEndpointPolicyDefinitionResponse> getServiceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions == null ? List.of() : this.serviceEndpointPolicyDefinitions;
    }
    /**
     * A collection of references to subnets.
     * 
    */
    public List<SubnetResponse> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceEndpointPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private String kind;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions;
        private List<SubnetResponse> subnets;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceEndpointPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.serviceEndpointPolicyDefinitions = defaults.serviceEndpointPolicyDefinitions;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder serviceEndpointPolicyDefinitions(@Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions) {
            this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
            return this;
        }

        public Builder subnets(List<SubnetResponse> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceEndpointPolicyResult build() {
            return new GetServiceEndpointPolicyResult(etag, id, kind, location, name, provisioningState, resourceGuid, serviceEndpointPolicyDefinitions, subnets, tags, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceEndpointPolicyDefinitionResult {
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final @Nullable String description;
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the service endpoint policy definition resource.
     * 
     */
    private final String provisioningState;
    /**
     * Service endpoint name.
     * 
     */
    private final @Nullable String service;
    /**
     * A list of service resources.
     * 
     */
    private final @Nullable List<String> serviceResources;

    @CustomType.Constructor
    private GetServiceEndpointPolicyDefinitionResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("serviceResources") @Nullable List<String> serviceResources) {
        this.description = description;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.service = service;
        this.serviceResources = serviceResources;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the service endpoint policy definition resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Service endpoint name.
     * 
    */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * A list of service resources.
     * 
    */
    public List<String> getServiceResources() {
        return this.serviceResources == null ? List.of() : this.serviceResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceEndpointPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable String service;
        private @Nullable List<String> serviceResources;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceEndpointPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.service = defaults.service;
    	      this.serviceResources = defaults.serviceResources;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder serviceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }
        public GetServiceEndpointPolicyDefinitionResult build() {
            return new GetServiceEndpointPolicyDefinitionResult(description, etag, id, name, provisioningState, service, serviceResources);
        }
    }
}

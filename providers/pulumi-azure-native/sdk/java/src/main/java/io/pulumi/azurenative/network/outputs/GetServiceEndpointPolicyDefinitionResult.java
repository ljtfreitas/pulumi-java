// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
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

    @OutputCustomType.Constructor({"description","etag","id","name","provisioningState","service","serviceResources"})
    private GetServiceEndpointPolicyDefinitionResult(
        @Nullable String description,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable String service,
        @Nullable List<String> serviceResources) {
        this.description = description;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
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

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setServiceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }
        public GetServiceEndpointPolicyDefinitionResult build() {
            return new GetServiceEndpointPolicyDefinitionResult(description, etag, id, name, provisioningState, service, serviceResources);
        }
    }
}

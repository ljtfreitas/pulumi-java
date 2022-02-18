// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.inputs.ProviderResourceTypeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource provider information.
 * 
 */
public final class ProviderResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProviderResponse Empty = new ProviderResponse();

    /**
     * The provider ID.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    /**
     * The registration policy of the resource provider.
     * 
     */
    @InputImport(name="registrationPolicy", required=true)
    private final String registrationPolicy;

    public String getRegistrationPolicy() {
        return this.registrationPolicy;
    }

    /**
     * The registration state of the resource provider.
     * 
     */
    @InputImport(name="registrationState", required=true)
    private final String registrationState;

    public String getRegistrationState() {
        return this.registrationState;
    }

    /**
     * The collection of provider resource types.
     * 
     */
    @InputImport(name="resourceTypes", required=true)
    private final List<ProviderResourceTypeResponse> resourceTypes;

    public List<ProviderResourceTypeResponse> getResourceTypes() {
        return this.resourceTypes;
    }

    public ProviderResponse(
        String id,
        @Nullable String namespace,
        String registrationPolicy,
        String registrationState,
        List<ProviderResourceTypeResponse> resourceTypes) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = namespace;
        this.registrationPolicy = Objects.requireNonNull(registrationPolicy, "expected parameter 'registrationPolicy' to be non-null");
        this.registrationState = Objects.requireNonNull(registrationState, "expected parameter 'registrationState' to be non-null");
        this.resourceTypes = Objects.requireNonNull(resourceTypes, "expected parameter 'resourceTypes' to be non-null");
    }

    private ProviderResponse() {
        this.id = null;
        this.namespace = null;
        this.registrationPolicy = null;
        this.registrationState = null;
        this.resourceTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String namespace;
        private String registrationPolicy;
        private String registrationState;
        private List<ProviderResourceTypeResponse> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.registrationPolicy = defaults.registrationPolicy;
    	      this.registrationState = defaults.registrationState;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setRegistrationPolicy(String registrationPolicy) {
            this.registrationPolicy = Objects.requireNonNull(registrationPolicy);
            return this;
        }

        public Builder setRegistrationState(String registrationState) {
            this.registrationState = Objects.requireNonNull(registrationState);
            return this;
        }

        public Builder setResourceTypes(List<ProviderResourceTypeResponse> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }

        public ProviderResponse build() {
            return new ProviderResponse(id, namespace, registrationPolicy, registrationState, resourceTypes);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the EnterpriseKnowledgeGraph.
 * 
 */
public final class EnterpriseKnowledgeGraphPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnterpriseKnowledgeGraphPropertiesResponse Empty = new EnterpriseKnowledgeGraphPropertiesResponse();

    /**
     * The description of the EnterpriseKnowledgeGraph
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Specifies the metadata  of the resource.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Object metadata;

    public Optional<Object> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    /**
     * The state of EnterpriseKnowledgeGraph provisioning
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    public EnterpriseKnowledgeGraphPropertiesResponse(
        @Nullable String description,
        @Nullable Object metadata,
        @Nullable String provisioningState) {
        this.description = description;
        this.metadata = metadata;
        this.provisioningState = provisioningState;
    }

    private EnterpriseKnowledgeGraphPropertiesResponse() {
        this.description = null;
        this.metadata = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKnowledgeGraphPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object metadata;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKnowledgeGraphPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public EnterpriseKnowledgeGraphPropertiesResponse build() {
            return new EnterpriseKnowledgeGraphPropertiesResponse(description, metadata, provisioningState);
        }
    }
}

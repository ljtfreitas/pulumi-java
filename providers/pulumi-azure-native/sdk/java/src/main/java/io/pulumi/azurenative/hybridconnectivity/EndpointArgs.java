// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridconnectivity;

import io.pulumi.azurenative.hybridconnectivity.enums.CreatedByType;
import io.pulumi.azurenative.hybridconnectivity.enums.Type;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Output.empty() : this.createdAt;
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
      private final @Nullable Output<String> createdBy;

    public Output<String> getCreatedBy() {
        return this.createdBy == null ? Output.empty() : this.createdBy;
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
      private final @Nullable Output<Either<String,CreatedByType>> createdByType;

    public Output<Either<String,CreatedByType>> getCreatedByType() {
        return this.createdByType == null ? Output.empty() : this.createdByType;
    }

    /**
     * The endpoint name.
     * 
     */
    @Import(name="endpointName")
      private final @Nullable Output<String> endpointName;

    public Output<String> getEndpointName() {
        return this.endpointName == null ? Output.empty() : this.endpointName;
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Import(name="lastModifiedAt")
      private final @Nullable Output<String> lastModifiedAt;

    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Output.empty() : this.lastModifiedAt;
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
      private final @Nullable Output<String> lastModifiedBy;

    public Output<String> getLastModifiedBy() {
        return this.lastModifiedBy == null ? Output.empty() : this.lastModifiedBy;
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
      private final @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;

    public Output<Either<String,CreatedByType>> getLastModifiedByType() {
        return this.lastModifiedByType == null ? Output.empty() : this.lastModifiedByType;
    }

    /**
     * The resource Id of the connectivity endpoint (optional).
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final Output<String> resourceUri;

    public Output<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * The type of endpoint.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,Type>> type;

    public Output<Either<String,Type>> getType() {
        return this.type;
    }

    public EndpointArgs(
        @Nullable Output<String> createdAt,
        @Nullable Output<String> createdBy,
        @Nullable Output<Either<String,CreatedByType>> createdByType,
        @Nullable Output<String> endpointName,
        @Nullable Output<String> lastModifiedAt,
        @Nullable Output<String> lastModifiedBy,
        @Nullable Output<Either<String,CreatedByType>> lastModifiedByType,
        @Nullable Output<String> resourceId,
        Output<String> resourceUri,
        Output<Either<String,Type>> type) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.endpointName = endpointName;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.resourceId = resourceId;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EndpointArgs() {
        this.createdAt = Output.empty();
        this.createdBy = Output.empty();
        this.createdByType = Output.empty();
        this.endpointName = Output.empty();
        this.lastModifiedAt = Output.empty();
        this.lastModifiedBy = Output.empty();
        this.lastModifiedByType = Output.empty();
        this.resourceId = Output.empty();
        this.resourceUri = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createdAt;
        private @Nullable Output<String> createdBy;
        private @Nullable Output<Either<String,CreatedByType>> createdByType;
        private @Nullable Output<String> endpointName;
        private @Nullable Output<String> lastModifiedAt;
        private @Nullable Output<String> lastModifiedBy;
        private @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;
        private @Nullable Output<String> resourceId;
        private Output<String> resourceUri;
        private Output<Either<String,Type>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.endpointName = defaults.endpointName;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceUri = defaults.resourceUri;
    	      this.type = defaults.type;
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Output.ofNullable(createdAt);
            return this;
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = Output.ofNullable(createdBy);
            return this;
        }

        public Builder createdByType(@Nullable Output<Either<String,CreatedByType>> createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder createdByType(@Nullable Either<String,CreatedByType> createdByType) {
            this.createdByType = Output.ofNullable(createdByType);
            return this;
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(@Nullable String endpointName) {
            this.endpointName = Output.ofNullable(endpointName);
            return this;
        }

        public Builder lastModifiedAt(@Nullable Output<String> lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = Output.ofNullable(lastModifiedAt);
            return this;
        }

        public Builder lastModifiedBy(@Nullable Output<String> lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = Output.ofNullable(lastModifiedBy);
            return this;
        }

        public Builder lastModifiedByType(@Nullable Output<Either<String,CreatedByType>> lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder lastModifiedByType(@Nullable Either<String,CreatedByType> lastModifiedByType) {
            this.lastModifiedByType = Output.ofNullable(lastModifiedByType);
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder resourceUri(Output<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Output.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public Builder type(Output<Either<String,Type>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,Type> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public EndpointArgs build() {
            return new EndpointArgs(createdAt, createdBy, createdByType, endpointName, lastModifiedAt, lastModifiedBy, lastModifiedByType, resourceId, resourceUri, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.IntegrationObjectTypeMapping;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationResult {
    private final @Nullable String createdAt;
    private final @Nullable String lastUpdatedAt;
    private final @Nullable String objectTypeName;
    private final @Nullable List<IntegrationObjectTypeMapping> objectTypeNames;
    private final @Nullable List<IntegrationTag> tags;

    @OutputCustomType.Constructor({"createdAt","lastUpdatedAt","objectTypeName","objectTypeNames","tags"})
    private GetIntegrationResult(
        @Nullable String createdAt,
        @Nullable String lastUpdatedAt,
        @Nullable String objectTypeName,
        @Nullable List<IntegrationObjectTypeMapping> objectTypeNames,
        @Nullable List<IntegrationTag> tags) {
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
        this.objectTypeName = objectTypeName;
        this.objectTypeNames = objectTypeNames;
        this.tags = tags;
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> getLastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    public Optional<String> getObjectTypeName() {
        return Optional.ofNullable(this.objectTypeName);
    }
    public List<IntegrationObjectTypeMapping> getObjectTypeNames() {
        return this.objectTypeNames == null ? List.of() : this.objectTypeNames;
    }
    public List<IntegrationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String lastUpdatedAt;
        private @Nullable String objectTypeName;
        private @Nullable List<IntegrationObjectTypeMapping> objectTypeNames;
        private @Nullable List<IntegrationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.objectTypeName = defaults.objectTypeName;
    	      this.objectTypeNames = defaults.objectTypeNames;
    	      this.tags = defaults.tags;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setLastUpdatedAt(@Nullable String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        public Builder setObjectTypeName(@Nullable String objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }

        public Builder setObjectTypeNames(@Nullable List<IntegrationObjectTypeMapping> objectTypeNames) {
            this.objectTypeNames = objectTypeNames;
            return this;
        }

        public Builder setTags(@Nullable List<IntegrationTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetIntegrationResult build() {
            return new GetIntegrationResult(createdAt, lastUpdatedAt, objectTypeName, objectTypeNames, tags);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.BatchReleaseCriteriaResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BatchConfigurationPropertiesResponse {
    /**
     * The name of the batch group.
     * 
     */
    private final String batchGroupName;
    /**
     * The artifact changed time.
     * 
     */
    private final @Nullable String changedTime;
    /**
     * The artifact creation time.
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable Object metadata;
    /**
     * The batch release criteria.
     * 
     */
    private final BatchReleaseCriteriaResponse releaseCriteria;

    @CustomType.Constructor
    private BatchConfigurationPropertiesResponse(
        @CustomType.Parameter("batchGroupName") String batchGroupName,
        @CustomType.Parameter("changedTime") @Nullable String changedTime,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("releaseCriteria") BatchReleaseCriteriaResponse releaseCriteria) {
        this.batchGroupName = batchGroupName;
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.metadata = metadata;
        this.releaseCriteria = releaseCriteria;
    }

    /**
     * The name of the batch group.
     * 
    */
    public String getBatchGroupName() {
        return this.batchGroupName;
    }
    /**
     * The artifact changed time.
     * 
    */
    public Optional<String> getChangedTime() {
        return Optional.ofNullable(this.changedTime);
    }
    /**
     * The artifact creation time.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The batch release criteria.
     * 
    */
    public BatchReleaseCriteriaResponse getReleaseCriteria() {
        return this.releaseCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String batchGroupName;
        private @Nullable String changedTime;
        private @Nullable String createdTime;
        private @Nullable Object metadata;
        private BatchReleaseCriteriaResponse releaseCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchGroupName = defaults.batchGroupName;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
    	      this.releaseCriteria = defaults.releaseCriteria;
        }

        public Builder batchGroupName(String batchGroupName) {
            this.batchGroupName = Objects.requireNonNull(batchGroupName);
            return this;
        }

        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder releaseCriteria(BatchReleaseCriteriaResponse releaseCriteria) {
            this.releaseCriteria = Objects.requireNonNull(releaseCriteria);
            return this;
        }
        public BatchConfigurationPropertiesResponse build() {
            return new BatchConfigurationPropertiesResponse(batchGroupName, changedTime, createdTime, metadata, releaseCriteria);
        }
    }
}

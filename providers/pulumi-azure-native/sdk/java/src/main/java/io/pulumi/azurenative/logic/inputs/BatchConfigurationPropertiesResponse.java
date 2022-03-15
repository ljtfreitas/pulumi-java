// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BatchReleaseCriteriaResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The batch configuration properties definition.
 * 
 */
public final class BatchConfigurationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchConfigurationPropertiesResponse Empty = new BatchConfigurationPropertiesResponse();

    /**
     * The name of the batch group.
     * 
     */
    @Import(name="batchGroupName", required=true)
      private final String batchGroupName;

    public String getBatchGroupName() {
        return this.batchGroupName;
    }

    /**
     * The artifact changed time.
     * 
     */
    @Import(name="changedTime")
      private final @Nullable String changedTime;

    public Optional<String> getChangedTime() {
        return this.changedTime == null ? Optional.empty() : Optional.ofNullable(this.changedTime);
    }

    /**
     * The artifact creation time.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    @Import(name="metadata")
      private final @Nullable Object metadata;

    public Optional<Object> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    /**
     * The batch release criteria.
     * 
     */
    @Import(name="releaseCriteria", required=true)
      private final BatchReleaseCriteriaResponse releaseCriteria;

    public BatchReleaseCriteriaResponse getReleaseCriteria() {
        return this.releaseCriteria;
    }

    public BatchConfigurationPropertiesResponse(
        String batchGroupName,
        @Nullable String changedTime,
        @Nullable String createdTime,
        @Nullable Object metadata,
        BatchReleaseCriteriaResponse releaseCriteria) {
        this.batchGroupName = Objects.requireNonNull(batchGroupName, "expected parameter 'batchGroupName' to be non-null");
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.metadata = metadata;
        this.releaseCriteria = Objects.requireNonNull(releaseCriteria, "expected parameter 'releaseCriteria' to be non-null");
    }

    private BatchConfigurationPropertiesResponse() {
        this.batchGroupName = null;
        this.changedTime = null;
        this.createdTime = null;
        this.metadata = null;
        this.releaseCriteria = null;
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

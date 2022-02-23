// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BatchReleaseCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The batch configuration properties definition.
 * 
 */
public final class BatchConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchConfigurationPropertiesArgs Empty = new BatchConfigurationPropertiesArgs();

    /**
     * The name of the batch group.
     * 
     */
    @InputImport(name="batchGroupName", required=true)
        private final Input<String> batchGroupName;

    public Input<String> getBatchGroupName() {
        return this.batchGroupName;
    }

    /**
     * The artifact changed time.
     * 
     */
    @InputImport(name="changedTime")
        private final @Nullable Input<String> changedTime;

    public Input<String> getChangedTime() {
        return this.changedTime == null ? Input.empty() : this.changedTime;
    }

    /**
     * The artifact creation time.
     * 
     */
    @InputImport(name="createdTime")
        private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    @InputImport(name="metadata")
        private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The batch release criteria.
     * 
     */
    @InputImport(name="releaseCriteria", required=true)
        private final Input<BatchReleaseCriteriaArgs> releaseCriteria;

    public Input<BatchReleaseCriteriaArgs> getReleaseCriteria() {
        return this.releaseCriteria;
    }

    public BatchConfigurationPropertiesArgs(
        Input<String> batchGroupName,
        @Nullable Input<String> changedTime,
        @Nullable Input<String> createdTime,
        @Nullable Input<Object> metadata,
        Input<BatchReleaseCriteriaArgs> releaseCriteria) {
        this.batchGroupName = Objects.requireNonNull(batchGroupName, "expected parameter 'batchGroupName' to be non-null");
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.metadata = metadata;
        this.releaseCriteria = Objects.requireNonNull(releaseCriteria, "expected parameter 'releaseCriteria' to be non-null");
    }

    private BatchConfigurationPropertiesArgs() {
        this.batchGroupName = Input.empty();
        this.changedTime = Input.empty();
        this.createdTime = Input.empty();
        this.metadata = Input.empty();
        this.releaseCriteria = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> batchGroupName;
        private @Nullable Input<String> changedTime;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<Object> metadata;
        private Input<BatchReleaseCriteriaArgs> releaseCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchGroupName = defaults.batchGroupName;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
    	      this.releaseCriteria = defaults.releaseCriteria;
        }

        public Builder setBatchGroupName(Input<String> batchGroupName) {
            this.batchGroupName = Objects.requireNonNull(batchGroupName);
            return this;
        }

        public Builder setBatchGroupName(String batchGroupName) {
            this.batchGroupName = Input.of(Objects.requireNonNull(batchGroupName));
            return this;
        }

        public Builder setChangedTime(@Nullable Input<String> changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder setChangedTime(@Nullable String changedTime) {
            this.changedTime = Input.ofNullable(changedTime);
            return this;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setReleaseCriteria(Input<BatchReleaseCriteriaArgs> releaseCriteria) {
            this.releaseCriteria = Objects.requireNonNull(releaseCriteria);
            return this;
        }

        public Builder setReleaseCriteria(BatchReleaseCriteriaArgs releaseCriteria) {
            this.releaseCriteria = Input.of(Objects.requireNonNull(releaseCriteria));
            return this;
        }
        public BatchConfigurationPropertiesArgs build() {
            return new BatchConfigurationPropertiesArgs(batchGroupName, changedTime, createdTime, metadata, releaseCriteria);
        }
    }
}

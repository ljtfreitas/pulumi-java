// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.WorkflowTriggerRecurrenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BatchReleaseCriteriaResponse {
    /**
     * The batch size in bytes.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * The message count.
     * 
     */
    private final @Nullable Integer messageCount;
    /**
     * The recurrence.
     * 
     */
    private final @Nullable WorkflowTriggerRecurrenceResponse recurrence;

    @OutputCustomType.Constructor({"batchSize","messageCount","recurrence"})
    private BatchReleaseCriteriaResponse(
        @Nullable Integer batchSize,
        @Nullable Integer messageCount,
        @Nullable WorkflowTriggerRecurrenceResponse recurrence) {
        this.batchSize = batchSize;
        this.messageCount = messageCount;
        this.recurrence = recurrence;
    }

    /**
     * The batch size in bytes.
     * 
     */
    public Optional<Integer> getBatchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * The message count.
     * 
     */
    public Optional<Integer> getMessageCount() {
        return Optional.ofNullable(this.messageCount);
    }
    /**
     * The recurrence.
     * 
     */
    public Optional<WorkflowTriggerRecurrenceResponse> getRecurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchReleaseCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchSize;
        private @Nullable Integer messageCount;
        private @Nullable WorkflowTriggerRecurrenceResponse recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchReleaseCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.messageCount = defaults.messageCount;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setMessageCount(@Nullable Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        public Builder setRecurrence(@Nullable WorkflowTriggerRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public BatchReleaseCriteriaResponse build() {
            return new BatchReleaseCriteriaResponse(batchSize, messageCount, recurrence);
        }
    }
}

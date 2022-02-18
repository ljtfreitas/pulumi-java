// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Referenced tumbling window trigger dependency.
 * 
 */
public final class TumblingWindowTriggerDependencyReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TumblingWindowTriggerDependencyReferenceResponse Empty = new TumblingWindowTriggerDependencyReferenceResponse();

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    @InputImport(name="offset")
    private final @Nullable String offset;

    public Optional<String> getOffset() {
        return this.offset == null ? Optional.empty() : Optional.ofNullable(this.offset);
    }

    /**
     * Referenced trigger.
     * 
     */
    @InputImport(name="referenceTrigger", required=true)
    private final TriggerReferenceResponse referenceTrigger;

    public TriggerReferenceResponse getReferenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    @InputImport(name="size")
    private final @Nullable String size;

    public Optional<String> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * The type of dependency reference.
     * Expected value is 'TumblingWindowTriggerDependencyReference'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TumblingWindowTriggerDependencyReferenceResponse(
        @Nullable String offset,
        TriggerReferenceResponse referenceTrigger,
        @Nullable String size,
        String type) {
        this.offset = offset;
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TumblingWindowTriggerDependencyReferenceResponse() {
        this.offset = null;
        this.referenceTrigger = null;
        this.size = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerDependencyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offset;
        private TriggerReferenceResponse referenceTrigger;
        private @Nullable String size;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerDependencyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setOffset(@Nullable String offset) {
            this.offset = offset;
            return this;
        }

        public Builder setReferenceTrigger(TriggerReferenceResponse referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TumblingWindowTriggerDependencyReferenceResponse build() {
            return new TumblingWindowTriggerDependencyReferenceResponse(offset, referenceTrigger, size, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineSourceTriggerDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineSourceTriggerDescriptorResponse Empty = new PipelineSourceTriggerDescriptorResponse();

    /**
     * The timestamp when the source update happened.
     * 
     */
    @InputImport(name="timestamp")
    private final @Nullable String timestamp;

    public Optional<String> getTimestamp() {
        return this.timestamp == null ? Optional.empty() : Optional.ofNullable(this.timestamp);
    }

    public PipelineSourceTriggerDescriptorResponse(@Nullable String timestamp) {
        this.timestamp = timestamp;
    }

    private PipelineSourceTriggerDescriptorResponse() {
        this.timestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSourceTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSourceTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestamp = defaults.timestamp;
        }

        public Builder setTimestamp(@Nullable String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public PipelineSourceTriggerDescriptorResponse build() {
            return new PipelineSourceTriggerDescriptorResponse(timestamp);
        }
    }
}

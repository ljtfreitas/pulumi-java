// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PipelineSourceTriggerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineSourceTriggerPropertiesResponse Empty = new PipelineSourceTriggerPropertiesResponse();

    /**
     * The current status of the source trigger.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public PipelineSourceTriggerPropertiesResponse(String status) {
        this.status = status == null ? "Enabled" : Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PipelineSourceTriggerPropertiesResponse() {
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSourceTriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSourceTriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PipelineSourceTriggerPropertiesResponse build() {
            return new PipelineSourceTriggerPropertiesResponse(status);
        }
    }
}

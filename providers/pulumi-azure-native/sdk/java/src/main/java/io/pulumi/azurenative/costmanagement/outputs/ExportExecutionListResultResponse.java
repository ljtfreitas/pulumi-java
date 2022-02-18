// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ExportExecutionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ExportExecutionListResultResponse {
    /**
     * A list of export executions.
     * 
     */
    private final List<ExportExecutionResponse> value;

    @OutputCustomType.Constructor({"value"})
    private ExportExecutionListResultResponse(List<ExportExecutionResponse> value) {
        this.value = Objects.requireNonNull(value);
    }

    /**
     * A list of export executions.
     * 
     */
    public List<ExportExecutionResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportExecutionListResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ExportExecutionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportExecutionListResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(List<ExportExecutionResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ExportExecutionListResultResponse build() {
            return new ExportExecutionListResultResponse(value);
        }
    }
}

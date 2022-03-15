// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an incident label
 * 
 */
public final class IncidentLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentLabelArgs Empty = new IncidentLabelArgs();

    /**
     * The name of the label
     * 
     */
    @Import(name="labelName", required=true)
      private final Output<String> labelName;

    public Output<String> getLabelName() {
        return this.labelName;
    }

    public IncidentLabelArgs(Output<String> labelName) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
    }

    private IncidentLabelArgs() {
        this.labelName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder labelName(Output<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder labelName(String labelName) {
            this.labelName = Output.of(Objects.requireNonNull(labelName));
            return this;
        }
        public IncidentLabelArgs build() {
            return new IncidentLabelArgs(labelName);
        }
    }
}

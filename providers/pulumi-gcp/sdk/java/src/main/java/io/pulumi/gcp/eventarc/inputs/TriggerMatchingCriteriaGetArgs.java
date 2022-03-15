// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TriggerMatchingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerMatchingCriteriaGetArgs Empty = new TriggerMatchingCriteriaGetArgs();

    /**
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
     * 
     */
    @Import(name="attribute", required=true)
      private final Output<String> attribute;

    public Output<String> getAttribute() {
        return this.attribute;
    }

    /**
     * Required. The value for the attribute.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public TriggerMatchingCriteriaGetArgs(
        Output<String> attribute,
        Output<String> value) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TriggerMatchingCriteriaGetArgs() {
        this.attribute = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerMatchingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attribute;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerMatchingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.value = defaults.value;
        }

        public Builder attribute(Output<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder attribute(String attribute) {
            this.attribute = Output.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public TriggerMatchingCriteriaGetArgs build() {
            return new TriggerMatchingCriteriaGetArgs(attribute, value);
        }
    }
}

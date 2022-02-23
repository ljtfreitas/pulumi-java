// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowOperatorPropertiesKeys;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An object used to store task related info
 * 
 */
public final class FlowTaskPropertiesObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowTaskPropertiesObjectArgs Empty = new FlowTaskPropertiesObjectArgs();

    @InputImport(name="key", required=true)
        private final Input<FlowOperatorPropertiesKeys> key;

    public Input<FlowOperatorPropertiesKeys> getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
        private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public FlowTaskPropertiesObjectArgs(
        Input<FlowOperatorPropertiesKeys> key,
        Input<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private FlowTaskPropertiesObjectArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTaskPropertiesObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FlowOperatorPropertiesKeys> key;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTaskPropertiesObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<FlowOperatorPropertiesKeys> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(FlowOperatorPropertiesKeys key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public FlowTaskPropertiesObjectArgs build() {
            return new FlowTaskPropertiesObjectArgs(key, value);
        }
    }
}

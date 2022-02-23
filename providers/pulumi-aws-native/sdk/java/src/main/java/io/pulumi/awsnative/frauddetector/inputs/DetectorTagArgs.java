// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DetectorTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorTagArgs Empty = new DetectorTagArgs();

    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
        private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public DetectorTagArgs(
        Input<String> key,
        Input<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private DetectorTagArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
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
        public DetectorTagArgs build() {
            return new DetectorTagArgs(key, value);
        }
    }
}

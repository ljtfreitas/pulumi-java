// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsNodePoolConfigTaintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigTaintGetArgs Empty = new AwsNodePoolConfigTaintGetArgs();

    @InputImport(name="effect", required=true)
    private final Input<String> effect;

    public Input<String> getEffect() {
        return this.effect;
    }

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

    public AwsNodePoolConfigTaintGetArgs(
        Input<String> effect,
        Input<String> key,
        Input<String> value) {
        this.effect = Objects.requireNonNull(effect, "expected parameter 'effect' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AwsNodePoolConfigTaintGetArgs() {
        this.effect = Input.empty();
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigTaintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> effect;
        private Input<String> key;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigTaintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEffect(Input<String> effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setEffect(String effect) {
            this.effect = Input.of(Objects.requireNonNull(effect));
            return this;
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

        public AwsNodePoolConfigTaintGetArgs build() {
            return new AwsNodePoolConfigTaintGetArgs(effect, key, value);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs Empty = new InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs();

    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
        private final Input<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value;

    public Input<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> getValue() {
        return this.value;
    }

    public InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs(
        Input<String> key,
        Input<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs defaults) {
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

        public Builder setValue(Input<InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs(key, value);
        }
    }
}

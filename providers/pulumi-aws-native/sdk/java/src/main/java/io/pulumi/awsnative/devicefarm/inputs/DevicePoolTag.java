// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DevicePoolTag extends io.pulumi.resources.InvokeArgs {

    public static final DevicePoolTag Empty = new DevicePoolTag();

    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public DevicePoolTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private DevicePoolTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public DevicePoolTag build() {
            return new DevicePoolTag(key, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A map to describe the settings of an action.
 * 
 */
public final class KeyValuePairResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyValuePairResponse Empty = new KeyValuePairResponse();

    /**
     * The name of the setting for the action.
     * 
     */
    @InputImport(name="key", required=true)
        private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * The value of the setting for the action.
     * 
     */
    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public KeyValuePairResponse(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private KeyValuePairResponse() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValuePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyValuePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public KeyValuePairResponse build() {
            return new KeyValuePairResponse(key, value);
        }
    }
}

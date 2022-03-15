// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StackSetTag {
    /**
     * A string used to identify this tag. You can specify a maximum of 127 characters for a tag key.
     * 
     */
    private final String key;
    /**
     * A string containing the value for this tag. You can specify a maximum of 256 characters for a tag value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private StackSetTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * A string used to identify this tag. You can specify a maximum of 127 characters for a tag key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A string containing the value for this tag. You can specify a maximum of 256 characters for a tag value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetTag defaults) {
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
        public StackSetTag build() {
            return new StackSetTag(key, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AcceleratorTag {
    /**
     * Key of the tag. Value can be 1 to 127 characters.
     * 
     */
    private final String key;
    /**
     * Value for the tag. Value can be 1 to 255 characters.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private AcceleratorTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Key of the tag. Value can be 1 to 127 characters.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Value for the tag. Value can be 1 to 255 characters.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorTag defaults) {
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
        public AcceleratorTag build() {
            return new AcceleratorTag(key, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AwsNodePoolConfigTaint {
    /**
     * Required. The taint effect. Possible values: EFFECT_UNSPECIFIED, NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE
     * 
     */
    private final String effect;
    /**
     * Required. Key for the taint.
     * 
     */
    private final String key;
    /**
     * Required. Value for the taint.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"effect","key","value"})
    private AwsNodePoolConfigTaint(
        String effect,
        String key,
        String value) {
        this.effect = Objects.requireNonNull(effect);
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Required. The taint effect. Possible values: EFFECT_UNSPECIFIED, NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE
     * 
     */
    public String getEffect() {
        return this.effect;
    }
    /**
     * Required. Key for the taint.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Required. Value for the taint.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEffect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AwsNodePoolConfigTaint build() {
            return new AwsNodePoolConfigTaint(effect, key, value);
        }
    }
}

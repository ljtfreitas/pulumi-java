// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigTaint {
    /**
     * Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    private final String effect;
    /**
     * Key for taint.
     * 
     */
    private final String key;
    /**
     * Value for taint.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ClusterNodePoolNodeConfigTaint(
        @CustomType.Parameter("effect") String effect,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
    */
    public String getEffect() {
        return this.effect;
    }
    /**
     * Key for taint.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Value for taint.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterNodePoolNodeConfigTaint build() {
            return new ClusterNodePoolNodeConfigTaint(effect, key, value);
        }
    }
}

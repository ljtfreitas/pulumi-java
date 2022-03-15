// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GroupTag {
    /**
     * Key
     * 
     */
    private final String key;
    /**
     * Enables propagation of the tag to
     * Amazon EC2 instances launched via this ASG
     * 
     */
    private final Boolean propagateAtLaunch;
    /**
     * Value
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GroupTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("propagateAtLaunch") Boolean propagateAtLaunch,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.propagateAtLaunch = propagateAtLaunch;
        this.value = value;
    }

    /**
     * Key
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Enables propagation of the tag to
     * Amazon EC2 instances launched via this ASG
     * 
    */
    public Boolean getPropagateAtLaunch() {
        return this.propagateAtLaunch;
    }
    /**
     * Value
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Boolean propagateAtLaunch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.propagateAtLaunch = defaults.propagateAtLaunch;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder propagateAtLaunch(Boolean propagateAtLaunch) {
            this.propagateAtLaunch = Objects.requireNonNull(propagateAtLaunch);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GroupTag build() {
            return new GroupTag(key, propagateAtLaunch, value);
        }
    }
}

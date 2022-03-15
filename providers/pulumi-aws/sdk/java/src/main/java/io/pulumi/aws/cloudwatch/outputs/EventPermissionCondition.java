// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventPermissionCondition {
    /**
     * Key for the condition. Valid values: `aws:PrincipalOrgID`.
     * 
     */
    private final String key;
    /**
     * Type of condition. Value values: `StringEquals`.
     * 
     */
    private final String type;
    /**
     * Value for the key.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EventPermissionCondition(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.type = type;
        this.value = value;
    }

    /**
     * Key for the condition. Valid values: `aws:PrincipalOrgID`.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Type of condition. Value values: `StringEquals`.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value for the key.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventPermissionCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventPermissionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public EventPermissionCondition build() {
            return new EventPermissionCondition(key, type, value);
        }
    }
}

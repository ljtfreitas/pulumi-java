// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationObjectStorageTag {
    /**
     * The key for an AWS resource tag.
     * 
     */
    private final String key;
    /**
     * The value for an AWS resource tag.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private LocationObjectStorageTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key for an AWS resource tag.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value for an AWS resource tag.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationObjectStorageTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationObjectStorageTag defaults) {
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
        public LocationObjectStorageTag build() {
            return new LocationObjectStorageTag(key, value);
        }
    }
}

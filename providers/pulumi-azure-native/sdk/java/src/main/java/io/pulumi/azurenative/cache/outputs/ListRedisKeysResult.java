// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListRedisKeysResult {
    /**
     * The current primary key that clients can use to authenticate with Redis cache.
     * 
     */
    private final String primaryKey;
    /**
     * The current secondary key that clients can use to authenticate with Redis cache.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private ListRedisKeysResult(
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * The current primary key that clients can use to authenticate with Redis cache.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The current secondary key that clients can use to authenticate with Redis cache.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRedisKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRedisKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public ListRedisKeysResult build() {
            return new ListRedisKeysResult(primaryKey, secondaryKey);
        }
    }
}

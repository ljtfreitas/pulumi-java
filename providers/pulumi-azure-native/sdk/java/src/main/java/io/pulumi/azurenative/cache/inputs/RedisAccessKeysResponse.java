// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Redis cache access keys.
 * 
 */
public final class RedisAccessKeysResponse extends io.pulumi.resources.InvokeArgs {

    public static final RedisAccessKeysResponse Empty = new RedisAccessKeysResponse();

    /**
     * The current primary key that clients can use to authenticate with Redis cache.
     * 
     */
    @InputImport(name="primaryKey", required=true)
        private final String primaryKey;

    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * The current secondary key that clients can use to authenticate with Redis cache.
     * 
     */
    @InputImport(name="secondaryKey", required=true)
        private final String secondaryKey;

    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public RedisAccessKeysResponse(
        String primaryKey,
        String secondaryKey) {
        this.primaryKey = Objects.requireNonNull(primaryKey, "expected parameter 'primaryKey' to be non-null");
        this.secondaryKey = Objects.requireNonNull(secondaryKey, "expected parameter 'secondaryKey' to be non-null");
    }

    private RedisAccessKeysResponse() {
        this.primaryKey = null;
        this.secondaryKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisAccessKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisAccessKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public RedisAccessKeysResponse build() {
            return new RedisAccessKeysResponse(primaryKey, secondaryKey);
        }
    }
}

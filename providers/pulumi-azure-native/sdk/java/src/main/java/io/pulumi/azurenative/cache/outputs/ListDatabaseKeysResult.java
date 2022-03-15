// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListDatabaseKeysResult {
    /**
     * The current primary key that clients can use to authenticate
     * 
     */
    private final String primaryKey;
    /**
     * The current secondary key that clients can use to authenticate
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private ListDatabaseKeysResult(
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * The current primary key that clients can use to authenticate
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The current secondary key that clients can use to authenticate
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDatabaseKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDatabaseKeysResult defaults) {
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
        public ListDatabaseKeysResult build() {
            return new ListDatabaseKeysResult(primaryKey, secondaryKey);
        }
    }
}

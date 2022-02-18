// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListAdminKeyResult {
    /**
     * The primary admin API key of the search service.
     * 
     */
    private final String primaryKey;
    /**
     * The secondary admin API key of the search service.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor({"primaryKey","secondaryKey"})
    private ListAdminKeyResult(
        String primaryKey,
        String secondaryKey) {
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    /**
     * The primary admin API key of the search service.
     * 
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The secondary admin API key of the search service.
     * 
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAdminKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAdminKeyResult defaults) {
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

        public ListAdminKeyResult build() {
            return new ListAdminKeyResult(primaryKey, secondaryKey);
        }
    }
}

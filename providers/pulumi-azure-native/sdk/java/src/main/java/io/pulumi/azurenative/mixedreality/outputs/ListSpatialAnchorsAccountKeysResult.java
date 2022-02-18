// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListSpatialAnchorsAccountKeysResult {
    /**
     * value of primary key.
     * 
     */
    private final String primaryKey;
    /**
     * value of secondary key.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor({"primaryKey","secondaryKey"})
    private ListSpatialAnchorsAccountKeysResult(
        String primaryKey,
        String secondaryKey) {
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    /**
     * value of primary key.
     * 
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * value of secondary key.
     * 
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSpatialAnchorsAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSpatialAnchorsAccountKeysResult defaults) {
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

        public ListSpatialAnchorsAccountKeysResult build() {
            return new ListSpatialAnchorsAccountKeysResult(primaryKey, secondaryKey);
        }
    }
}

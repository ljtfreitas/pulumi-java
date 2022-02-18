// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListDatabaseAccountKeysResult {
    /**
     * Base 64 encoded value of the primary read-write key.
     * 
     */
    private final String primaryMasterKey;
    /**
     * Base 64 encoded value of the primary read-only key.
     * 
     */
    private final String primaryReadonlyMasterKey;
    /**
     * Base 64 encoded value of the secondary read-write key.
     * 
     */
    private final String secondaryMasterKey;
    /**
     * Base 64 encoded value of the secondary read-only key.
     * 
     */
    private final String secondaryReadonlyMasterKey;

    @OutputCustomType.Constructor({"primaryMasterKey","primaryReadonlyMasterKey","secondaryMasterKey","secondaryReadonlyMasterKey"})
    private ListDatabaseAccountKeysResult(
        String primaryMasterKey,
        String primaryReadonlyMasterKey,
        String secondaryMasterKey,
        String secondaryReadonlyMasterKey) {
        this.primaryMasterKey = Objects.requireNonNull(primaryMasterKey);
        this.primaryReadonlyMasterKey = Objects.requireNonNull(primaryReadonlyMasterKey);
        this.secondaryMasterKey = Objects.requireNonNull(secondaryMasterKey);
        this.secondaryReadonlyMasterKey = Objects.requireNonNull(secondaryReadonlyMasterKey);
    }

    /**
     * Base 64 encoded value of the primary read-write key.
     * 
     */
    public String getPrimaryMasterKey() {
        return this.primaryMasterKey;
    }
    /**
     * Base 64 encoded value of the primary read-only key.
     * 
     */
    public String getPrimaryReadonlyMasterKey() {
        return this.primaryReadonlyMasterKey;
    }
    /**
     * Base 64 encoded value of the secondary read-write key.
     * 
     */
    public String getSecondaryMasterKey() {
        return this.secondaryMasterKey;
    }
    /**
     * Base 64 encoded value of the secondary read-only key.
     * 
     */
    public String getSecondaryReadonlyMasterKey() {
        return this.secondaryReadonlyMasterKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDatabaseAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryMasterKey;
        private String primaryReadonlyMasterKey;
        private String secondaryMasterKey;
        private String secondaryReadonlyMasterKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDatabaseAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryMasterKey = defaults.primaryMasterKey;
    	      this.primaryReadonlyMasterKey = defaults.primaryReadonlyMasterKey;
    	      this.secondaryMasterKey = defaults.secondaryMasterKey;
    	      this.secondaryReadonlyMasterKey = defaults.secondaryReadonlyMasterKey;
        }

        public Builder setPrimaryMasterKey(String primaryMasterKey) {
            this.primaryMasterKey = Objects.requireNonNull(primaryMasterKey);
            return this;
        }

        public Builder setPrimaryReadonlyMasterKey(String primaryReadonlyMasterKey) {
            this.primaryReadonlyMasterKey = Objects.requireNonNull(primaryReadonlyMasterKey);
            return this;
        }

        public Builder setSecondaryMasterKey(String secondaryMasterKey) {
            this.secondaryMasterKey = Objects.requireNonNull(secondaryMasterKey);
            return this;
        }

        public Builder setSecondaryReadonlyMasterKey(String secondaryReadonlyMasterKey) {
            this.secondaryReadonlyMasterKey = Objects.requireNonNull(secondaryReadonlyMasterKey);
            return this;
        }

        public ListDatabaseAccountKeysResult build() {
            return new ListDatabaseAccountKeysResult(primaryMasterKey, primaryReadonlyMasterKey, secondaryMasterKey, secondaryReadonlyMasterKey);
        }
    }
}

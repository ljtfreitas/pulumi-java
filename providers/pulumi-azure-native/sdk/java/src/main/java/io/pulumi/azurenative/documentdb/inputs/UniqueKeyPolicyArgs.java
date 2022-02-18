// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.UniqueKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
 * 
 */
public final class UniqueKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UniqueKeyPolicyArgs Empty = new UniqueKeyPolicyArgs();

    /**
     * List of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @InputImport(name="uniqueKeys")
    private final @Nullable Input<List<UniqueKeyArgs>> uniqueKeys;

    public Input<List<UniqueKeyArgs>> getUniqueKeys() {
        return this.uniqueKeys == null ? Input.empty() : this.uniqueKeys;
    }

    public UniqueKeyPolicyArgs(@Nullable Input<List<UniqueKeyArgs>> uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
    }

    private UniqueKeyPolicyArgs() {
        this.uniqueKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UniqueKeyArgs>> uniqueKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uniqueKeys = defaults.uniqueKeys;
        }

        public Builder setUniqueKeys(@Nullable Input<List<UniqueKeyArgs>> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            return this;
        }

        public Builder setUniqueKeys(@Nullable List<UniqueKeyArgs> uniqueKeys) {
            this.uniqueKeys = Input.ofNullable(uniqueKeys);
            return this;
        }

        public UniqueKeyPolicyArgs build() {
            return new UniqueKeyPolicyArgs(uniqueKeys);
        }
    }
}

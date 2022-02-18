// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class MongoIndexKeysResponse {
    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
     */
    private final @Nullable List<String> keys;

    @OutputCustomType.Constructor({"keys"})
    private MongoIndexKeysResponse(@Nullable List<String> keys) {
        this.keys = keys;
    }

    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
     */
    public List<String> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }

        public MongoIndexKeysResponse build() {
            return new MongoIndexKeysResponse(keys);
        }
    }
}

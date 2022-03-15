// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection resource object
 * 
 */
public final class MongoIndexKeysResponse extends io.pulumi.resources.InvokeArgs {

    public static final MongoIndexKeysResponse Empty = new MongoIndexKeysResponse();

    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
     */
    @Import(name="keys")
      private final @Nullable List<String> keys;

    public List<String> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public MongoIndexKeysResponse(@Nullable List<String> keys) {
        this.keys = keys;
    }

    private MongoIndexKeysResponse() {
        this.keys = List.of();
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

        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public MongoIndexKeysResponse build() {
            return new MongoIndexKeysResponse(keys);
        }
    }
}

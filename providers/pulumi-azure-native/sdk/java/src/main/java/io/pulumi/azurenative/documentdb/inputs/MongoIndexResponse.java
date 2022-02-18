// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.MongoIndexKeysResponse;
import io.pulumi.azurenative.documentdb.inputs.MongoIndexOptionsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index key
 * 
 */
public final class MongoIndexResponse extends io.pulumi.resources.InvokeArgs {

    public static final MongoIndexResponse Empty = new MongoIndexResponse();

    /**
     * Cosmos DB MongoDB collection index keys
     * 
     */
    @InputImport(name="key")
    private final @Nullable MongoIndexKeysResponse key;

    public Optional<MongoIndexKeysResponse> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * Cosmos DB MongoDB collection index key options
     * 
     */
    @InputImport(name="options")
    private final @Nullable MongoIndexOptionsResponse options;

    public Optional<MongoIndexOptionsResponse> getOptions() {
        return this.options == null ? Optional.empty() : Optional.ofNullable(this.options);
    }

    public MongoIndexResponse(
        @Nullable MongoIndexKeysResponse key,
        @Nullable MongoIndexOptionsResponse options) {
        this.key = key;
        this.options = options;
    }

    private MongoIndexResponse() {
        this.key = null;
        this.options = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MongoIndexKeysResponse key;
        private @Nullable MongoIndexOptionsResponse options;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.options = defaults.options;
        }

        public Builder setKey(@Nullable MongoIndexKeysResponse key) {
            this.key = key;
            return this;
        }

        public Builder setOptions(@Nullable MongoIndexOptionsResponse options) {
            this.options = options;
            return this;
        }

        public MongoIndexResponse build() {
            return new MongoIndexResponse(key, options);
        }
    }
}

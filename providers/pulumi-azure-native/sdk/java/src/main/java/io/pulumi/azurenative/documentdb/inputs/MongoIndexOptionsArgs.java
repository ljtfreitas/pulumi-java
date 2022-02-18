// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index options
 * 
 */
public final class MongoIndexOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoIndexOptionsArgs Empty = new MongoIndexOptionsArgs();

    /**
     * Expire after seconds
     * 
     */
    @InputImport(name="expireAfterSeconds")
    private final @Nullable Input<Integer> expireAfterSeconds;

    public Input<Integer> getExpireAfterSeconds() {
        return this.expireAfterSeconds == null ? Input.empty() : this.expireAfterSeconds;
    }

    /**
     * Is unique or not
     * 
     */
    @InputImport(name="unique")
    private final @Nullable Input<Boolean> unique;

    public Input<Boolean> getUnique() {
        return this.unique == null ? Input.empty() : this.unique;
    }

    public MongoIndexOptionsArgs(
        @Nullable Input<Integer> expireAfterSeconds,
        @Nullable Input<Boolean> unique) {
        this.expireAfterSeconds = expireAfterSeconds;
        this.unique = unique;
    }

    private MongoIndexOptionsArgs() {
        this.expireAfterSeconds = Input.empty();
        this.unique = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> expireAfterSeconds;
        private @Nullable Input<Boolean> unique;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterSeconds = defaults.expireAfterSeconds;
    	      this.unique = defaults.unique;
        }

        public Builder setExpireAfterSeconds(@Nullable Input<Integer> expireAfterSeconds) {
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }

        public Builder setExpireAfterSeconds(@Nullable Integer expireAfterSeconds) {
            this.expireAfterSeconds = Input.ofNullable(expireAfterSeconds);
            return this;
        }

        public Builder setUnique(@Nullable Input<Boolean> unique) {
            this.unique = unique;
            return this;
        }

        public Builder setUnique(@Nullable Boolean unique) {
            this.unique = Input.ofNullable(unique);
            return this;
        }

        public MongoIndexOptionsArgs build() {
            return new MongoIndexOptionsArgs(expireAfterSeconds, unique);
        }
    }
}

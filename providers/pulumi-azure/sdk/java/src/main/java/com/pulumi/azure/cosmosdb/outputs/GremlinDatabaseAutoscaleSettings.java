// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GremlinDatabaseAutoscaleSettings {
    /**
     * @return The maximum throughput of the Gremlin database (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
     * 
     */
    private final @Nullable Integer maxThroughput;

    @CustomType.Constructor
    private GremlinDatabaseAutoscaleSettings(@CustomType.Parameter("maxThroughput") @Nullable Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
    }

    /**
     * @return The maximum throughput of the Gremlin database (RU/s). Must be between `1,000` and `1,000,000`. Must be set in increments of `1,000`. Conflicts with `throughput`.
     * 
     */
    public Optional<Integer> maxThroughput() {
        return Optional.ofNullable(this.maxThroughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinDatabaseAutoscaleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinDatabaseAutoscaleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxThroughput = defaults.maxThroughput;
        }

        public Builder maxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }        public GremlinDatabaseAutoscaleSettings build() {
            return new GremlinDatabaseAutoscaleSettings(maxThroughput);
        }
    }
}

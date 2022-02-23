// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CosmosDbSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CosmosDbSettingsResponse Empty = new CosmosDbSettingsResponse();

    /**
     * The throughput of the collections in cosmosdb database
     * 
     */
    @InputImport(name="collectionsThroughput")
        private final @Nullable Integer collectionsThroughput;

    public Optional<Integer> getCollectionsThroughput() {
        return this.collectionsThroughput == null ? Optional.empty() : Optional.ofNullable(this.collectionsThroughput);
    }

    public CosmosDbSettingsResponse(@Nullable Integer collectionsThroughput) {
        this.collectionsThroughput = collectionsThroughput;
    }

    private CosmosDbSettingsResponse() {
        this.collectionsThroughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer collectionsThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionsThroughput = defaults.collectionsThroughput;
        }

        public Builder setCollectionsThroughput(@Nullable Integer collectionsThroughput) {
            this.collectionsThroughput = collectionsThroughput;
            return this;
        }
        public CosmosDbSettingsResponse build() {
            return new CosmosDbSettingsResponse(collectionsThroughput);
        }
    }
}

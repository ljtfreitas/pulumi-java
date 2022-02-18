// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.CosmosDbSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceManagedResourcesSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceManagedResourcesSettingsArgs Empty = new ServiceManagedResourcesSettingsArgs();

    /**
     * The settings for the service managed cosmosdb account.
     * 
     */
    @InputImport(name="cosmosDb")
    private final @Nullable Input<CosmosDbSettingsArgs> cosmosDb;

    public Input<CosmosDbSettingsArgs> getCosmosDb() {
        return this.cosmosDb == null ? Input.empty() : this.cosmosDb;
    }

    public ServiceManagedResourcesSettingsArgs(@Nullable Input<CosmosDbSettingsArgs> cosmosDb) {
        this.cosmosDb = cosmosDb;
    }

    private ServiceManagedResourcesSettingsArgs() {
        this.cosmosDb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceManagedResourcesSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CosmosDbSettingsArgs> cosmosDb;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceManagedResourcesSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cosmosDb = defaults.cosmosDb;
        }

        public Builder setCosmosDb(@Nullable Input<CosmosDbSettingsArgs> cosmosDb) {
            this.cosmosDb = cosmosDb;
            return this;
        }

        public Builder setCosmosDb(@Nullable CosmosDbSettingsArgs cosmosDb) {
            this.cosmosDb = Input.ofNullable(cosmosDb);
            return this;
        }

        public ServiceManagedResourcesSettingsArgs build() {
            return new ServiceManagedResourcesSettingsArgs(cosmosDb);
        }
    }
}

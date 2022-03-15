// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.inputs;

import io.pulumi.azurenative.resourceconnector.enums.Provider;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains infrastructure information about the Appliance
 * 
 */
public final class AppliancePropertiesInfrastructureConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppliancePropertiesInfrastructureConfigArgs Empty = new AppliancePropertiesInfrastructureConfigArgs();

    /**
     * Information about the connected appliance.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<Either<String,Provider>> provider;

    public Output<Either<String,Provider>> getProvider() {
        return this.provider == null ? Output.empty() : this.provider;
    }

    public AppliancePropertiesInfrastructureConfigArgs(@Nullable Output<Either<String,Provider>> provider) {
        this.provider = provider;
    }

    private AppliancePropertiesInfrastructureConfigArgs() {
        this.provider = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppliancePropertiesInfrastructureConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Provider>> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(AppliancePropertiesInfrastructureConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
        }

        public Builder provider(@Nullable Output<Either<String,Provider>> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(@Nullable Either<String,Provider> provider) {
            this.provider = Output.ofNullable(provider);
            return this;
        }
        public AppliancePropertiesInfrastructureConfigArgs build() {
            return new AppliancePropertiesInfrastructureConfigArgs(provider);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProviderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * A CMAF encryption configuration.
 * 
 */
public final class PackagingConfigurationMssEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationMssEncryptionArgs Empty = new PackagingConfigurationMssEncryptionArgs();

    @Import(name="spekeKeyProvider", required=true)
      private final Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<PackagingConfigurationSpekeKeyProviderArgs> getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public PackagingConfigurationMssEncryptionArgs(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private PackagingConfigurationMssEncryptionArgs() {
        this.spekeKeyProvider = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationMssEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationMssEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder spekeKeyProvider(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProviderArgs spekeKeyProvider) {
            this.spekeKeyProvider = Output.of(Objects.requireNonNull(spekeKeyProvider));
            return this;
        }
        public PackagingConfigurationMssEncryptionArgs build() {
            return new PackagingConfigurationMssEncryptionArgs(spekeKeyProvider);
        }
    }
}

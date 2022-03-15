// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAADIdentityProviderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the configuration of the identity providers to be used in the OpenShift cluster.
 * 
 */
public final class OpenShiftManagedClusterIdentityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterIdentityProviderArgs Empty = new OpenShiftManagedClusterIdentityProviderArgs();

    /**
     * Name of the provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration of the provider.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<OpenShiftManagedClusterAADIdentityProviderArgs> provider;

    public Output<OpenShiftManagedClusterAADIdentityProviderArgs> getProvider() {
        return this.provider == null ? Output.empty() : this.provider;
    }

    public OpenShiftManagedClusterIdentityProviderArgs(
        @Nullable Output<String> name,
        @Nullable Output<OpenShiftManagedClusterAADIdentityProviderArgs> provider) {
        this.name = name;
        this.provider = provider;
    }

    private OpenShiftManagedClusterIdentityProviderArgs() {
        this.name = Output.empty();
        this.provider = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<OpenShiftManagedClusterAADIdentityProviderArgs> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterIdentityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder provider(@Nullable Output<OpenShiftManagedClusterAADIdentityProviderArgs> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(@Nullable OpenShiftManagedClusterAADIdentityProviderArgs provider) {
            this.provider = Output.ofNullable(provider);
            return this;
        }
        public OpenShiftManagedClusterIdentityProviderArgs build() {
            return new OpenShiftManagedClusterIdentityProviderArgs(name, provider);
        }
    }
}

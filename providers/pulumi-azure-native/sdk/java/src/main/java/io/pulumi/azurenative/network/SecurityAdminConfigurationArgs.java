// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.DeleteExistingNSGs;
import io.pulumi.azurenative.network.enums.SecurityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityAdminConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityAdminConfigurationArgs Empty = new SecurityAdminConfigurationArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName")
      private final @Nullable Output<String> configurationName;

    public Output<String> getConfigurationName() {
        return this.configurationName == null ? Output.empty() : this.configurationName;
    }

    /**
     * Flag if need to delete existing network security groups.
     * 
     */
    @Import(name="deleteExistingNSGs")
      private final @Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs;

    public Output<Either<String,DeleteExistingNSGs>> getDeleteExistingNSGs() {
        return this.deleteExistingNSGs == null ? Output.empty() : this.deleteExistingNSGs;
    }

    /**
     * A description of the security configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A display name of the security configuration.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
      private final Output<String> networkManagerName;

    public Output<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Security Type.
     * 
     */
    @Import(name="securityType")
      private final @Nullable Output<Either<String,SecurityType>> securityType;

    public Output<Either<String,SecurityType>> getSecurityType() {
        return this.securityType == null ? Output.empty() : this.securityType;
    }

    public SecurityAdminConfigurationArgs(
        @Nullable Output<String> configurationName,
        @Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> networkManagerName,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,SecurityType>> securityType) {
        this.configurationName = configurationName;
        this.deleteExistingNSGs = deleteExistingNSGs;
        this.description = description;
        this.displayName = displayName;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityType = securityType;
    }

    private SecurityAdminConfigurationArgs() {
        this.configurationName = Output.empty();
        this.deleteExistingNSGs = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.networkManagerName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.securityType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAdminConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationName;
        private @Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> networkManagerName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,SecurityType>> securityType;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAdminConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.deleteExistingNSGs = defaults.deleteExistingNSGs;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityType = defaults.securityType;
        }

        public Builder configurationName(@Nullable Output<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = Output.ofNullable(configurationName);
            return this;
        }

        public Builder deleteExistingNSGs(@Nullable Output<Either<String,DeleteExistingNSGs>> deleteExistingNSGs) {
            this.deleteExistingNSGs = deleteExistingNSGs;
            return this;
        }

        public Builder deleteExistingNSGs(@Nullable Either<String,DeleteExistingNSGs> deleteExistingNSGs) {
            this.deleteExistingNSGs = Output.ofNullable(deleteExistingNSGs);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder networkManagerName(Output<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Output.of(Objects.requireNonNull(networkManagerName));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder securityType(@Nullable Output<Either<String,SecurityType>> securityType) {
            this.securityType = securityType;
            return this;
        }

        public Builder securityType(@Nullable Either<String,SecurityType> securityType) {
            this.securityType = Output.ofNullable(securityType);
            return this;
        }
        public SecurityAdminConfigurationArgs build() {
            return new SecurityAdminConfigurationArgs(configurationName, deleteExistingNSGs, description, displayName, networkManagerName, resourceGroupName, securityType);
        }
    }
}

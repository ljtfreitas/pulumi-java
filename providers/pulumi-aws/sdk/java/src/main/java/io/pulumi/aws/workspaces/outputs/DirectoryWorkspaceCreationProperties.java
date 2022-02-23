// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectoryWorkspaceCreationProperties {
    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     * 
     */
    private final @Nullable String customSecurityGroupId;
    /**
     * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
     * 
     */
    private final @Nullable String defaultOu;
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     * 
     */
    private final @Nullable Boolean enableInternetAccess;
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
     * 
     */
    private final @Nullable Boolean enableMaintenanceMode;
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     * 
     */
    private final @Nullable Boolean userEnabledAsLocalAdministrator;

    @OutputCustomType.Constructor({"customSecurityGroupId","defaultOu","enableInternetAccess","enableMaintenanceMode","userEnabledAsLocalAdministrator"})
    private DirectoryWorkspaceCreationProperties(
        @Nullable String customSecurityGroupId,
        @Nullable String defaultOu,
        @Nullable Boolean enableInternetAccess,
        @Nullable Boolean enableMaintenanceMode,
        @Nullable Boolean userEnabledAsLocalAdministrator) {
        this.customSecurityGroupId = customSecurityGroupId;
        this.defaultOu = defaultOu;
        this.enableInternetAccess = enableInternetAccess;
        this.enableMaintenanceMode = enableMaintenanceMode;
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }

    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     * 
     */
    public Optional<String> getCustomSecurityGroupId() {
        return Optional.ofNullable(this.customSecurityGroupId);
    }
    /**
     * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
     * 
     */
    public Optional<String> getDefaultOu() {
        return Optional.ofNullable(this.defaultOu);
    }
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     * 
     */
    public Optional<Boolean> getEnableInternetAccess() {
        return Optional.ofNullable(this.enableInternetAccess);
    }
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
     * 
     */
    public Optional<Boolean> getEnableMaintenanceMode() {
        return Optional.ofNullable(this.enableMaintenanceMode);
    }
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     * 
     */
    public Optional<Boolean> getUserEnabledAsLocalAdministrator() {
        return Optional.ofNullable(this.userEnabledAsLocalAdministrator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryWorkspaceCreationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customSecurityGroupId;
        private @Nullable String defaultOu;
        private @Nullable Boolean enableInternetAccess;
        private @Nullable Boolean enableMaintenanceMode;
        private @Nullable Boolean userEnabledAsLocalAdministrator;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryWorkspaceCreationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.defaultOu = defaults.defaultOu;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.enableMaintenanceMode = defaults.enableMaintenanceMode;
    	      this.userEnabledAsLocalAdministrator = defaults.userEnabledAsLocalAdministrator;
        }

        public Builder setCustomSecurityGroupId(@Nullable String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }

        public Builder setDefaultOu(@Nullable String defaultOu) {
            this.defaultOu = defaultOu;
            return this;
        }

        public Builder setEnableInternetAccess(@Nullable Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        public Builder setEnableMaintenanceMode(@Nullable Boolean enableMaintenanceMode) {
            this.enableMaintenanceMode = enableMaintenanceMode;
            return this;
        }

        public Builder setUserEnabledAsLocalAdministrator(@Nullable Boolean userEnabledAsLocalAdministrator) {
            this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
            return this;
        }
        public DirectoryWorkspaceCreationProperties build() {
            return new DirectoryWorkspaceCreationProperties(customSecurityGroupId, defaultOu, enableInternetAccess, enableMaintenanceMode, userEnabledAsLocalAdministrator);
        }
    }
}

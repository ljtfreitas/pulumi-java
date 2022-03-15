// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDirectoryWorkspaceCreationProperty {
    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     * 
     */
    private final String customSecurityGroupId;
    /**
     * The default organizational unit (OU) for your WorkSpace directories.
     * 
     */
    private final String defaultOu;
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     * 
     */
    private final Boolean enableInternetAccess;
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html).
     * 
     */
    private final Boolean enableMaintenanceMode;
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     * 
     */
    private final Boolean userEnabledAsLocalAdministrator;

    @CustomType.Constructor
    private GetDirectoryWorkspaceCreationProperty(
        @CustomType.Parameter("customSecurityGroupId") String customSecurityGroupId,
        @CustomType.Parameter("defaultOu") String defaultOu,
        @CustomType.Parameter("enableInternetAccess") Boolean enableInternetAccess,
        @CustomType.Parameter("enableMaintenanceMode") Boolean enableMaintenanceMode,
        @CustomType.Parameter("userEnabledAsLocalAdministrator") Boolean userEnabledAsLocalAdministrator) {
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
    public String getCustomSecurityGroupId() {
        return this.customSecurityGroupId;
    }
    /**
     * The default organizational unit (OU) for your WorkSpace directories.
     * 
    */
    public String getDefaultOu() {
        return this.defaultOu;
    }
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     * 
    */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html).
     * 
    */
    public Boolean getEnableMaintenanceMode() {
        return this.enableMaintenanceMode;
    }
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     * 
    */
    public Boolean getUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryWorkspaceCreationProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customSecurityGroupId;
        private String defaultOu;
        private Boolean enableInternetAccess;
        private Boolean enableMaintenanceMode;
        private Boolean userEnabledAsLocalAdministrator;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryWorkspaceCreationProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.defaultOu = defaults.defaultOu;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.enableMaintenanceMode = defaults.enableMaintenanceMode;
    	      this.userEnabledAsLocalAdministrator = defaults.userEnabledAsLocalAdministrator;
        }

        public Builder customSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = Objects.requireNonNull(customSecurityGroupId);
            return this;
        }

        public Builder defaultOu(String defaultOu) {
            this.defaultOu = Objects.requireNonNull(defaultOu);
            return this;
        }

        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = Objects.requireNonNull(enableInternetAccess);
            return this;
        }

        public Builder enableMaintenanceMode(Boolean enableMaintenanceMode) {
            this.enableMaintenanceMode = Objects.requireNonNull(enableMaintenanceMode);
            return this;
        }

        public Builder userEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
            this.userEnabledAsLocalAdministrator = Objects.requireNonNull(userEnabledAsLocalAdministrator);
            return this;
        }
        public GetDirectoryWorkspaceCreationProperty build() {
            return new GetDirectoryWorkspaceCreationProperty(customSecurityGroupId, defaultOu, enableInternetAccess, enableMaintenanceMode, userEnabledAsLocalAdministrator);
        }
    }
}

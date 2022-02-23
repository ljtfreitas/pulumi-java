// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsGetArgs;
import io.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesGetArgs;
import io.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryState extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryState Empty = new DirectoryState();

    /**
     * The directory alias.
     * 
     */
    @InputImport(name="alias")
    private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * The user name for the service account.
     * 
     */
    @InputImport(name="customerUserName")
    private final @Nullable Input<String> customerUserName;

    public Input<String> getCustomerUserName() {
        return this.customerUserName == null ? Input.empty() : this.customerUserName;
    }

    /**
     * The directory identifier for registration in WorkSpaces service.
     * 
     */
    @InputImport(name="directoryId")
    private final @Nullable Input<String> directoryId;

    public Input<String> getDirectoryId() {
        return this.directoryId == null ? Input.empty() : this.directoryId;
    }

    /**
     * The name of the directory.
     * 
     */
    @InputImport(name="directoryName")
    private final @Nullable Input<String> directoryName;

    public Input<String> getDirectoryName() {
        return this.directoryName == null ? Input.empty() : this.directoryName;
    }

    /**
     * The directory type.
     * 
     */
    @InputImport(name="directoryType")
    private final @Nullable Input<String> directoryType;

    public Input<String> getDirectoryType() {
        return this.directoryType == null ? Input.empty() : this.directoryType;
    }

    /**
     * The IP addresses of the DNS servers for the directory.
     * 
     */
    @InputImport(name="dnsIpAddresses")
    private final @Nullable Input<List<String>> dnsIpAddresses;

    public Input<List<String>> getDnsIpAddresses() {
        return this.dnsIpAddresses == null ? Input.empty() : this.dnsIpAddresses;
    }

    /**
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    @InputImport(name="iamRoleId")
    private final @Nullable Input<String> iamRoleId;

    public Input<String> getIamRoleId() {
        return this.iamRoleId == null ? Input.empty() : this.iamRoleId;
    }

    /**
     * The identifiers of the IP access control groups associated with the directory.
     * 
     */
    @InputImport(name="ipGroupIds")
    private final @Nullable Input<List<String>> ipGroupIds;

    public Input<List<String>> getIpGroupIds() {
        return this.ipGroupIds == null ? Input.empty() : this.ipGroupIds;
    }

    /**
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    @InputImport(name="registrationCode")
    private final @Nullable Input<String> registrationCode;

    public Input<String> getRegistrationCode() {
        return this.registrationCode == null ? Input.empty() : this.registrationCode;
    }

    /**
     * Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    @InputImport(name="selfServicePermissions")
    private final @Nullable Input<DirectorySelfServicePermissionsGetArgs> selfServicePermissions;

    public Input<DirectorySelfServicePermissionsGetArgs> getSelfServicePermissions() {
        return this.selfServicePermissions == null ? Input.empty() : this.selfServicePermissions;
    }

    /**
     * The identifiers of the subnets where the directory resides.
     * 
     */
    @InputImport(name="subnetIds")
    private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    @InputImport(name="workspaceAccessProperties")
    private final @Nullable Input<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties;

    public Input<DirectoryWorkspaceAccessPropertiesGetArgs> getWorkspaceAccessProperties() {
        return this.workspaceAccessProperties == null ? Input.empty() : this.workspaceAccessProperties;
    }

    /**
     * Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    @InputImport(name="workspaceCreationProperties")
    private final @Nullable Input<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties;

    public Input<DirectoryWorkspaceCreationPropertiesGetArgs> getWorkspaceCreationProperties() {
        return this.workspaceCreationProperties == null ? Input.empty() : this.workspaceCreationProperties;
    }

    /**
     * The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    @InputImport(name="workspaceSecurityGroupId")
    private final @Nullable Input<String> workspaceSecurityGroupId;

    public Input<String> getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId == null ? Input.empty() : this.workspaceSecurityGroupId;
    }

    public DirectoryState(
        @Nullable Input<String> alias,
        @Nullable Input<String> customerUserName,
        @Nullable Input<String> directoryId,
        @Nullable Input<String> directoryName,
        @Nullable Input<String> directoryType,
        @Nullable Input<List<String>> dnsIpAddresses,
        @Nullable Input<String> iamRoleId,
        @Nullable Input<List<String>> ipGroupIds,
        @Nullable Input<String> registrationCode,
        @Nullable Input<DirectorySelfServicePermissionsGetArgs> selfServicePermissions,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties,
        @Nullable Input<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties,
        @Nullable Input<String> workspaceSecurityGroupId) {
        this.alias = alias;
        this.customerUserName = customerUserName;
        this.directoryId = directoryId;
        this.directoryName = directoryName;
        this.directoryType = directoryType;
        this.dnsIpAddresses = dnsIpAddresses;
        this.iamRoleId = iamRoleId;
        this.ipGroupIds = ipGroupIds;
        this.registrationCode = registrationCode;
        this.selfServicePermissions = selfServicePermissions;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.workspaceAccessProperties = workspaceAccessProperties;
        this.workspaceCreationProperties = workspaceCreationProperties;
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    private DirectoryState() {
        this.alias = Input.empty();
        this.customerUserName = Input.empty();
        this.directoryId = Input.empty();
        this.directoryName = Input.empty();
        this.directoryType = Input.empty();
        this.dnsIpAddresses = Input.empty();
        this.iamRoleId = Input.empty();
        this.ipGroupIds = Input.empty();
        this.registrationCode = Input.empty();
        this.selfServicePermissions = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.workspaceAccessProperties = Input.empty();
        this.workspaceCreationProperties = Input.empty();
        this.workspaceSecurityGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private @Nullable Input<String> customerUserName;
        private @Nullable Input<String> directoryId;
        private @Nullable Input<String> directoryName;
        private @Nullable Input<String> directoryType;
        private @Nullable Input<List<String>> dnsIpAddresses;
        private @Nullable Input<String> iamRoleId;
        private @Nullable Input<List<String>> ipGroupIds;
        private @Nullable Input<String> registrationCode;
        private @Nullable Input<DirectorySelfServicePermissionsGetArgs> selfServicePermissions;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties;
        private @Nullable Input<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties;
        private @Nullable Input<String> workspaceSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.customerUserName = defaults.customerUserName;
    	      this.directoryId = defaults.directoryId;
    	      this.directoryName = defaults.directoryName;
    	      this.directoryType = defaults.directoryType;
    	      this.dnsIpAddresses = defaults.dnsIpAddresses;
    	      this.iamRoleId = defaults.iamRoleId;
    	      this.ipGroupIds = defaults.ipGroupIds;
    	      this.registrationCode = defaults.registrationCode;
    	      this.selfServicePermissions = defaults.selfServicePermissions;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.workspaceAccessProperties = defaults.workspaceAccessProperties;
    	      this.workspaceCreationProperties = defaults.workspaceCreationProperties;
    	      this.workspaceSecurityGroupId = defaults.workspaceSecurityGroupId;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setCustomerUserName(@Nullable Input<String> customerUserName) {
            this.customerUserName = customerUserName;
            return this;
        }

        public Builder setCustomerUserName(@Nullable String customerUserName) {
            this.customerUserName = Input.ofNullable(customerUserName);
            return this;
        }

        public Builder setDirectoryId(@Nullable Input<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        public Builder setDirectoryId(@Nullable String directoryId) {
            this.directoryId = Input.ofNullable(directoryId);
            return this;
        }

        public Builder setDirectoryName(@Nullable Input<String> directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder setDirectoryName(@Nullable String directoryName) {
            this.directoryName = Input.ofNullable(directoryName);
            return this;
        }

        public Builder setDirectoryType(@Nullable Input<String> directoryType) {
            this.directoryType = directoryType;
            return this;
        }

        public Builder setDirectoryType(@Nullable String directoryType) {
            this.directoryType = Input.ofNullable(directoryType);
            return this;
        }

        public Builder setDnsIpAddresses(@Nullable Input<List<String>> dnsIpAddresses) {
            this.dnsIpAddresses = dnsIpAddresses;
            return this;
        }

        public Builder setDnsIpAddresses(@Nullable List<String> dnsIpAddresses) {
            this.dnsIpAddresses = Input.ofNullable(dnsIpAddresses);
            return this;
        }

        public Builder setIamRoleId(@Nullable Input<String> iamRoleId) {
            this.iamRoleId = iamRoleId;
            return this;
        }

        public Builder setIamRoleId(@Nullable String iamRoleId) {
            this.iamRoleId = Input.ofNullable(iamRoleId);
            return this;
        }

        public Builder setIpGroupIds(@Nullable Input<List<String>> ipGroupIds) {
            this.ipGroupIds = ipGroupIds;
            return this;
        }

        public Builder setIpGroupIds(@Nullable List<String> ipGroupIds) {
            this.ipGroupIds = Input.ofNullable(ipGroupIds);
            return this;
        }

        public Builder setRegistrationCode(@Nullable Input<String> registrationCode) {
            this.registrationCode = registrationCode;
            return this;
        }

        public Builder setRegistrationCode(@Nullable String registrationCode) {
            this.registrationCode = Input.ofNullable(registrationCode);
            return this;
        }

        public Builder setSelfServicePermissions(@Nullable Input<DirectorySelfServicePermissionsGetArgs> selfServicePermissions) {
            this.selfServicePermissions = selfServicePermissions;
            return this;
        }

        public Builder setSelfServicePermissions(@Nullable DirectorySelfServicePermissionsGetArgs selfServicePermissions) {
            this.selfServicePermissions = Input.ofNullable(selfServicePermissions);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setWorkspaceAccessProperties(@Nullable Input<DirectoryWorkspaceAccessPropertiesGetArgs> workspaceAccessProperties) {
            this.workspaceAccessProperties = workspaceAccessProperties;
            return this;
        }

        public Builder setWorkspaceAccessProperties(@Nullable DirectoryWorkspaceAccessPropertiesGetArgs workspaceAccessProperties) {
            this.workspaceAccessProperties = Input.ofNullable(workspaceAccessProperties);
            return this;
        }

        public Builder setWorkspaceCreationProperties(@Nullable Input<DirectoryWorkspaceCreationPropertiesGetArgs> workspaceCreationProperties) {
            this.workspaceCreationProperties = workspaceCreationProperties;
            return this;
        }

        public Builder setWorkspaceCreationProperties(@Nullable DirectoryWorkspaceCreationPropertiesGetArgs workspaceCreationProperties) {
            this.workspaceCreationProperties = Input.ofNullable(workspaceCreationProperties);
            return this;
        }

        public Builder setWorkspaceSecurityGroupId(@Nullable Input<String> workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = workspaceSecurityGroupId;
            return this;
        }

        public Builder setWorkspaceSecurityGroupId(@Nullable String workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = Input.ofNullable(workspaceSecurityGroupId);
            return this;
        }
        public DirectoryState build() {
            return new DirectoryState(alias, customerUserName, directoryId, directoryName, directoryType, dnsIpAddresses, iamRoleId, ipGroupIds, registrationCode, selfServicePermissions, subnetIds, tags, tagsAll, workspaceAccessProperties, workspaceCreationProperties, workspaceSecurityGroupId);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.ComplianceStatusResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.HelmOperatorPropertiesResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSourceControlConfigurationResult {
    /**
     * Compliance Status of the Configuration
     * 
     */
    private final ComplianceStatusResponse complianceStatus;
    /**
     * Name-value pairs of protected configuration settings for the configuration
     * 
     */
    private final @Nullable Map<String,String> configurationProtectedSettings;
    /**
     * Option to enable Helm Operator for this git configuration.
     * 
     */
    private final @Nullable Boolean enableHelmOperator;
    /**
     * Properties for Helm operator.
     * 
     */
    private final @Nullable HelmOperatorPropertiesResponse helmOperatorProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Instance name of the operator - identifying the specific configuration.
     * 
     */
    private final @Nullable String operatorInstanceName;
    /**
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    private final @Nullable String operatorNamespace;
    /**
     * Any Parameters for the Operator instance in string format.
     * 
     */
    private final @Nullable String operatorParams;
    /**
     * Scope at which the operator will be installed.
     * 
     */
    private final @Nullable String operatorScope;
    /**
     * Type of the operator
     * 
     */
    private final @Nullable String operatorType;
    /**
     * The provisioning state of the resource provider.
     * 
     */
    private final String provisioningState;
    /**
     * Public Key associated with this SourceControl configuration (either generated within the cluster or provided by the user).
     * 
     */
    private final String repositoryPublicKey;
    /**
     * Url of the SourceControl Repository.
     * 
     */
    private final @Nullable String repositoryUrl;
    /**
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    private final @Nullable String sshKnownHostsContents;
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"complianceStatus","configurationProtectedSettings","enableHelmOperator","helmOperatorProperties","id","name","operatorInstanceName","operatorNamespace","operatorParams","operatorScope","operatorType","provisioningState","repositoryPublicKey","repositoryUrl","sshKnownHostsContents","systemData","type"})
    private GetSourceControlConfigurationResult(
        ComplianceStatusResponse complianceStatus,
        @Nullable Map<String,String> configurationProtectedSettings,
        @Nullable Boolean enableHelmOperator,
        @Nullable HelmOperatorPropertiesResponse helmOperatorProperties,
        String id,
        String name,
        @Nullable String operatorInstanceName,
        @Nullable String operatorNamespace,
        @Nullable String operatorParams,
        @Nullable String operatorScope,
        @Nullable String operatorType,
        String provisioningState,
        String repositoryPublicKey,
        @Nullable String repositoryUrl,
        @Nullable String sshKnownHostsContents,
        SystemDataResponse systemData,
        String type) {
        this.complianceStatus = Objects.requireNonNull(complianceStatus);
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.enableHelmOperator = enableHelmOperator;
        this.helmOperatorProperties = helmOperatorProperties;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.operatorInstanceName = operatorInstanceName;
        this.operatorNamespace = operatorNamespace;
        this.operatorParams = operatorParams;
        this.operatorScope = operatorScope;
        this.operatorType = operatorType;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.repositoryPublicKey = Objects.requireNonNull(repositoryPublicKey);
        this.repositoryUrl = repositoryUrl;
        this.sshKnownHostsContents = sshKnownHostsContents;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Compliance Status of the Configuration
     * 
     */
    public ComplianceStatusResponse getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Name-value pairs of protected configuration settings for the configuration
     * 
     */
    public Map<String,String> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Map.of() : this.configurationProtectedSettings;
    }
    /**
     * Option to enable Helm Operator for this git configuration.
     * 
     */
    public Optional<Boolean> getEnableHelmOperator() {
        return Optional.ofNullable(this.enableHelmOperator);
    }
    /**
     * Properties for Helm operator.
     * 
     */
    public Optional<HelmOperatorPropertiesResponse> getHelmOperatorProperties() {
        return Optional.ofNullable(this.helmOperatorProperties);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Instance name of the operator - identifying the specific configuration.
     * 
     */
    public Optional<String> getOperatorInstanceName() {
        return Optional.ofNullable(this.operatorInstanceName);
    }
    /**
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    public Optional<String> getOperatorNamespace() {
        return Optional.ofNullable(this.operatorNamespace);
    }
    /**
     * Any Parameters for the Operator instance in string format.
     * 
     */
    public Optional<String> getOperatorParams() {
        return Optional.ofNullable(this.operatorParams);
    }
    /**
     * Scope at which the operator will be installed.
     * 
     */
    public Optional<String> getOperatorScope() {
        return Optional.ofNullable(this.operatorScope);
    }
    /**
     * Type of the operator
     * 
     */
    public Optional<String> getOperatorType() {
        return Optional.ofNullable(this.operatorType);
    }
    /**
     * The provisioning state of the resource provider.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Key associated with this SourceControl configuration (either generated within the cluster or provided by the user).
     * 
     */
    public String getRepositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    /**
     * Url of the SourceControl Repository.
     * 
     */
    public Optional<String> getRepositoryUrl() {
        return Optional.ofNullable(this.repositoryUrl);
    }
    /**
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    public Optional<String> getSshKnownHostsContents() {
        return Optional.ofNullable(this.sshKnownHostsContents);
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComplianceStatusResponse complianceStatus;
        private @Nullable Map<String,String> configurationProtectedSettings;
        private @Nullable Boolean enableHelmOperator;
        private @Nullable HelmOperatorPropertiesResponse helmOperatorProperties;
        private String id;
        private String name;
        private @Nullable String operatorInstanceName;
        private @Nullable String operatorNamespace;
        private @Nullable String operatorParams;
        private @Nullable String operatorScope;
        private @Nullable String operatorType;
        private String provisioningState;
        private String repositoryPublicKey;
        private @Nullable String repositoryUrl;
        private @Nullable String sshKnownHostsContents;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.enableHelmOperator = defaults.enableHelmOperator;
    	      this.helmOperatorProperties = defaults.helmOperatorProperties;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.operatorInstanceName = defaults.operatorInstanceName;
    	      this.operatorNamespace = defaults.operatorNamespace;
    	      this.operatorParams = defaults.operatorParams;
    	      this.operatorScope = defaults.operatorScope;
    	      this.operatorType = defaults.operatorType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.repositoryPublicKey = defaults.repositoryPublicKey;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sshKnownHostsContents = defaults.sshKnownHostsContents;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setComplianceStatus(ComplianceStatusResponse complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder setConfigurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder setEnableHelmOperator(@Nullable Boolean enableHelmOperator) {
            this.enableHelmOperator = enableHelmOperator;
            return this;
        }

        public Builder setHelmOperatorProperties(@Nullable HelmOperatorPropertiesResponse helmOperatorProperties) {
            this.helmOperatorProperties = helmOperatorProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperatorInstanceName(@Nullable String operatorInstanceName) {
            this.operatorInstanceName = operatorInstanceName;
            return this;
        }

        public Builder setOperatorNamespace(@Nullable String operatorNamespace) {
            this.operatorNamespace = operatorNamespace;
            return this;
        }

        public Builder setOperatorParams(@Nullable String operatorParams) {
            this.operatorParams = operatorParams;
            return this;
        }

        public Builder setOperatorScope(@Nullable String operatorScope) {
            this.operatorScope = operatorScope;
            return this;
        }

        public Builder setOperatorType(@Nullable String operatorType) {
            this.operatorType = operatorType;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRepositoryPublicKey(String repositoryPublicKey) {
            this.repositoryPublicKey = Objects.requireNonNull(repositoryPublicKey);
            return this;
        }

        public Builder setRepositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder setSshKnownHostsContents(@Nullable String sshKnownHostsContents) {
            this.sshKnownHostsContents = sshKnownHostsContents;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSourceControlConfigurationResult build() {
            return new GetSourceControlConfigurationResult(complianceStatus, configurationProtectedSettings, enableHelmOperator, helmOperatorProperties, id, name, operatorInstanceName, operatorNamespace, operatorParams, operatorScope, operatorType, provisioningState, repositoryPublicKey, repositoryUrl, sshKnownHostsContents, systemData, type);
        }
    }
}

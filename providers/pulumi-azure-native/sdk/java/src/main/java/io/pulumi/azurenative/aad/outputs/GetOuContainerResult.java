// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.ContainerAccountResponse;
import io.pulumi.azurenative.aad.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOuContainerResult {
    /**
     * The list of container accounts
     * 
     */
    private final @Nullable List<ContainerAccountResponse> accounts;
    /**
     * The OuContainer name
     * 
     */
    private final String containerId;
    /**
     * The Deployment id
     * 
     */
    private final String deploymentId;
    /**
     * Distinguished Name of OuContainer instance
     * 
     */
    private final String distinguishedName;
    /**
     * The domain name of Domain Services.
     * 
     */
    private final String domainName;
    /**
     * Resource etag
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Status of OuContainer instance
     * 
     */
    private final String serviceStatus;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure Active Directory tenant id
     * 
     */
    private final String tenantId;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accounts","containerId","deploymentId","distinguishedName","domainName","etag","id","location","name","provisioningState","serviceStatus","systemData","tags","tenantId","type"})
    private GetOuContainerResult(
        @Nullable List<ContainerAccountResponse> accounts,
        String containerId,
        String deploymentId,
        String distinguishedName,
        String domainName,
        @Nullable String etag,
        String id,
        @Nullable String location,
        String name,
        String provisioningState,
        String serviceStatus,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String tenantId,
        String type) {
        this.accounts = accounts;
        this.containerId = Objects.requireNonNull(containerId);
        this.deploymentId = Objects.requireNonNull(deploymentId);
        this.distinguishedName = Objects.requireNonNull(distinguishedName);
        this.domainName = Objects.requireNonNull(domainName);
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.serviceStatus = Objects.requireNonNull(serviceStatus);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The list of container accounts
     * 
     */
    public List<ContainerAccountResponse> getAccounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * The OuContainer name
     * 
     */
    public String getContainerId() {
        return this.containerId;
    }
    /**
     * The Deployment id
     * 
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Distinguished Name of OuContainer instance
     * 
     */
    public String getDistinguishedName() {
        return this.distinguishedName;
    }
    /**
     * The domain name of Domain Services.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Resource etag
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Status of OuContainer instance
     * 
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure Active Directory tenant id
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOuContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerAccountResponse> accounts;
        private String containerId;
        private String deploymentId;
        private String distinguishedName;
        private String domainName;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String serviceStatus;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOuContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.containerId = defaults.containerId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.distinguishedName = defaults.distinguishedName;
    	      this.domainName = defaults.domainName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceStatus = defaults.serviceStatus;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAccounts(@Nullable List<ContainerAccountResponse> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder setContainerId(String containerId) {
            this.containerId = Objects.requireNonNull(containerId);
            return this;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder setDistinguishedName(String distinguishedName) {
            this.distinguishedName = Objects.requireNonNull(distinguishedName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setServiceStatus(String serviceStatus) {
            this.serviceStatus = Objects.requireNonNull(serviceStatus);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetOuContainerResult build() {
            return new GetOuContainerResult(accounts, containerId, deploymentId, distinguishedName, domainName, etag, id, location, name, provisioningState, serviceStatus, systemData, tags, tenantId, type);
        }
    }
}

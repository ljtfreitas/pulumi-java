// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.azurenative.powerplatform.outputs.EnterprisePolicyIdentityResponse;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseEncryption;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseLockbox;
import io.pulumi.azurenative.powerplatform.outputs.PropertiesResponseNetworkInjection;
import io.pulumi.azurenative.powerplatform.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnterprisePolicyResult {
    /**
     * The encryption settings for a configuration store.
     * 
     */
    private final @Nullable PropertiesResponseEncryption encryption;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the EnterprisePolicy.
     * 
     */
    private final @Nullable EnterprisePolicyIdentityResponse identity;
    /**
     * The kind (type) of Enterprise Policy.
     * 
     */
    private final String kind;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Settings concerning lockbox.
     * 
     */
    private final @Nullable PropertiesResponseLockbox lockbox;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Settings concerning network injection.
     * 
     */
    private final @Nullable PropertiesResponseNetworkInjection networkInjection;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"encryption","id","identity","kind","location","lockbox","name","networkInjection","systemData","tags","type"})
    private GetEnterprisePolicyResult(
        @Nullable PropertiesResponseEncryption encryption,
        String id,
        @Nullable EnterprisePolicyIdentityResponse identity,
        String kind,
        String location,
        @Nullable PropertiesResponseLockbox lockbox,
        String name,
        @Nullable PropertiesResponseNetworkInjection networkInjection,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.encryption = encryption;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.lockbox = lockbox;
        this.name = Objects.requireNonNull(name);
        this.networkInjection = networkInjection;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The encryption settings for a configuration store.
     * 
     */
    public Optional<PropertiesResponseEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the EnterprisePolicy.
     * 
     */
    public Optional<EnterprisePolicyIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind (type) of Enterprise Policy.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Settings concerning lockbox.
     * 
     */
    public Optional<PropertiesResponseLockbox> getLockbox() {
        return Optional.ofNullable(this.lockbox);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Settings concerning network injection.
     * 
     */
    public Optional<PropertiesResponseNetworkInjection> getNetworkInjection() {
        return Optional.ofNullable(this.networkInjection);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetEnterprisePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PropertiesResponseEncryption encryption;
        private String id;
        private @Nullable EnterprisePolicyIdentityResponse identity;
        private String kind;
        private String location;
        private @Nullable PropertiesResponseLockbox lockbox;
        private String name;
        private @Nullable PropertiesResponseNetworkInjection networkInjection;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnterprisePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.lockbox = defaults.lockbox;
    	      this.name = defaults.name;
    	      this.networkInjection = defaults.networkInjection;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEncryption(@Nullable PropertiesResponseEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable EnterprisePolicyIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLockbox(@Nullable PropertiesResponseLockbox lockbox) {
            this.lockbox = lockbox;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkInjection(@Nullable PropertiesResponseNetworkInjection networkInjection) {
            this.networkInjection = networkInjection;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetEnterprisePolicyResult build() {
            return new GetEnterprisePolicyResult(encryption, id, identity, kind, location, lockbox, name, networkInjection, systemData, tags, type);
        }
    }
}

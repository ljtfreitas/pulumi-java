// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.datamigration.inputs.ServiceSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Name of the resource group
     * 
     */
    @InputImport(name="groupName", required=true)
        private final Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName;
    }

    /**
     * The resource kind. Only 'vm' (the default) is supported.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    @InputImport(name="publicKey")
        private final @Nullable Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    /**
     * Name of the service
     * 
     */
    @InputImport(name="serviceName")
        private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * Service SKU
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<ServiceSkuArgs> sku;

    public Input<ServiceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    @InputImport(name="virtualSubnetId", required=true)
        private final Input<String> virtualSubnetId;

    public Input<String> getVirtualSubnetId() {
        return this.virtualSubnetId;
    }

    public ServiceArgs(
        Input<String> groupName,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> publicKey,
        @Nullable Input<String> serviceName,
        @Nullable Input<ServiceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        Input<String> virtualSubnetId) {
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.kind = kind;
        this.location = location;
        this.publicKey = publicKey;
        this.serviceName = serviceName;
        this.sku = sku;
        this.tags = tags;
        this.virtualSubnetId = Objects.requireNonNull(virtualSubnetId, "expected parameter 'virtualSubnetId' to be non-null");
    }

    private ServiceArgs() {
        this.groupName = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.publicKey = Input.empty();
        this.serviceName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.virtualSubnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> groupName;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> publicKey;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<ServiceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> virtualSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.publicKey = defaults.publicKey;
    	      this.serviceName = defaults.serviceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.virtualSubnetId = defaults.virtualSubnetId;
        }

        public Builder setGroupName(Input<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Input.of(Objects.requireNonNull(groupName));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPublicKey(@Nullable Input<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setSku(@Nullable Input<ServiceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ServiceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setVirtualSubnetId(Input<String> virtualSubnetId) {
            this.virtualSubnetId = Objects.requireNonNull(virtualSubnetId);
            return this;
        }

        public Builder setVirtualSubnetId(String virtualSubnetId) {
            this.virtualSubnetId = Input.of(Objects.requireNonNull(virtualSubnetId));
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(groupName, kind, location, publicKey, serviceName, sku, tags, virtualSubnetId);
        }
    }
}

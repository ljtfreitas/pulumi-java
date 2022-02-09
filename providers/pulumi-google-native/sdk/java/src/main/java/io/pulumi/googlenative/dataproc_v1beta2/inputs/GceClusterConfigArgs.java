// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.enums.GceClusterConfigPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NodeGroupAffinityArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GceClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GceClusterConfigArgs Empty = new GceClusterConfigArgs();

    @InputImport(name="internalIpOnly")
    private final @Nullable Input<Boolean> internalIpOnly;

    public Input<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Input.empty() : this.internalIpOnly;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="networkUri")
    private final @Nullable Input<String> networkUri;

    public Input<String> getNetworkUri() {
        return this.networkUri == null ? Input.empty() : this.networkUri;
    }

    @InputImport(name="nodeGroupAffinity")
    private final @Nullable Input<NodeGroupAffinityArgs> nodeGroupAffinity;

    public Input<NodeGroupAffinityArgs> getNodeGroupAffinity() {
        return this.nodeGroupAffinity == null ? Input.empty() : this.nodeGroupAffinity;
    }

    @InputImport(name="privateIpv6GoogleAccess")
    private final @Nullable Input<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Input<GceClusterConfigPrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    @InputImport(name="reservationAffinity")
    private final @Nullable Input<ReservationAffinityArgs> reservationAffinity;

    public Input<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    @InputImport(name="serviceAccountScopes")
    private final @Nullable Input<List<String>> serviceAccountScopes;

    public Input<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Input.empty() : this.serviceAccountScopes;
    }

    @InputImport(name="shieldedInstanceConfig")
    private final @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    @InputImport(name="subnetworkUri")
    private final @Nullable Input<String> subnetworkUri;

    public Input<String> getSubnetworkUri() {
        return this.subnetworkUri == null ? Input.empty() : this.subnetworkUri;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="zoneUri")
    private final @Nullable Input<String> zoneUri;

    public Input<String> getZoneUri() {
        return this.zoneUri == null ? Input.empty() : this.zoneUri;
    }

    public GceClusterConfigArgs(
        @Nullable Input<Boolean> internalIpOnly,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> networkUri,
        @Nullable Input<NodeGroupAffinityArgs> nodeGroupAffinity,
        @Nullable Input<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Input<ReservationAffinityArgs> reservationAffinity,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<List<String>> serviceAccountScopes,
        @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Input<String> subnetworkUri,
        @Nullable Input<List<String>> tags,
        @Nullable Input<String> zoneUri) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.networkUri = networkUri;
        this.nodeGroupAffinity = nodeGroupAffinity;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnetworkUri = subnetworkUri;
        this.tags = tags;
        this.zoneUri = zoneUri;
    }

    private GceClusterConfigArgs() {
        this.internalIpOnly = Input.empty();
        this.metadata = Input.empty();
        this.networkUri = Input.empty();
        this.nodeGroupAffinity = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.reservationAffinity = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceAccountScopes = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.subnetworkUri = Input.empty();
        this.tags = Input.empty();
        this.zoneUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GceClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> internalIpOnly;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> networkUri;
        private @Nullable Input<NodeGroupAffinityArgs> nodeGroupAffinity;
        private @Nullable Input<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Input<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<List<String>> serviceAccountScopes;
        private @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Input<String> subnetworkUri;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<String> zoneUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GceClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.networkUri = defaults.networkUri;
    	      this.nodeGroupAffinity = defaults.nodeGroupAffinity;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnetworkUri = defaults.subnetworkUri;
    	      this.tags = defaults.tags;
    	      this.zoneUri = defaults.zoneUri;
        }

        public Builder setInternalIpOnly(@Nullable Input<Boolean> internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder setInternalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = Input.ofNullable(internalIpOnly);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setNetworkUri(@Nullable Input<String> networkUri) {
            this.networkUri = networkUri;
            return this;
        }

        public Builder setNetworkUri(@Nullable String networkUri) {
            this.networkUri = Input.ofNullable(networkUri);
            return this;
        }

        public Builder setNodeGroupAffinity(@Nullable Input<NodeGroupAffinityArgs> nodeGroupAffinity) {
            this.nodeGroupAffinity = nodeGroupAffinity;
            return this;
        }

        public Builder setNodeGroupAffinity(@Nullable NodeGroupAffinityArgs nodeGroupAffinity) {
            this.nodeGroupAffinity = Input.ofNullable(nodeGroupAffinity);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable Input<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable GceClusterConfigPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setReservationAffinity(@Nullable Input<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder setReservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable Input<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Input.ofNullable(serviceAccountScopes);
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder setSubnetworkUri(@Nullable Input<String> subnetworkUri) {
            this.subnetworkUri = subnetworkUri;
            return this;
        }

        public Builder setSubnetworkUri(@Nullable String subnetworkUri) {
            this.subnetworkUri = Input.ofNullable(subnetworkUri);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZoneUri(@Nullable Input<String> zoneUri) {
            this.zoneUri = zoneUri;
            return this;
        }

        public Builder setZoneUri(@Nullable String zoneUri) {
            this.zoneUri = Input.ofNullable(zoneUri);
            return this;
        }

        public GceClusterConfigArgs build() {
            return new GceClusterConfigArgs(internalIpOnly, metadata, networkUri, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetworkUri, tags, zoneUri);
        }
    }
}
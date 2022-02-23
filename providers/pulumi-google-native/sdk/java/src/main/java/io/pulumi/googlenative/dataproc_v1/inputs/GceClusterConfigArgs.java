// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.enums.GceClusterConfigPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.dataproc_v1.inputs.ConfidentialInstanceConfigArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.NodeGroupAffinityArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.ShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common config settings for resources of Compute Engine cluster instances, applicable to all instances in the cluster.
 * 
 */
public final class GceClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GceClusterConfigArgs Empty = new GceClusterConfigArgs();

    /**
     * Optional. Confidential Instance Config for clusters using Confidential VMs (https://cloud.google.com/compute/confidential-vm/docs).
     * 
     */
    @InputImport(name="confidentialInstanceConfig")
      private final @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Input<ConfidentialInstanceConfigArgs> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Input.empty() : this.confidentialInstanceConfig;
    }

    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @InputImport(name="internalIpOnly")
      private final @Nullable Input<Boolean> internalIpOnly;

    public Input<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Input.empty() : this.internalIpOnly;
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    @InputImport(name="networkUri")
      private final @Nullable Input<String> networkUri;

    public Input<String> getNetworkUri() {
        return this.networkUri == null ? Input.empty() : this.networkUri;
    }

    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    @InputImport(name="nodeGroupAffinity")
      private final @Nullable Input<NodeGroupAffinityArgs> nodeGroupAffinity;

    public Input<NodeGroupAffinityArgs> getNodeGroupAffinity() {
        return this.nodeGroupAffinity == null ? Input.empty() : this.nodeGroupAffinity;
    }

    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Input<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Input<GceClusterConfigPrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    @InputImport(name="reservationAffinity")
      private final @Nullable Input<ReservationAffinityArgs> reservationAffinity;

    public Input<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    @InputImport(name="serviceAccountScopes")
      private final @Nullable Input<List<String>> serviceAccountScopes;

    public Input<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Input.empty() : this.serviceAccountScopes;
    }

    /**
     * Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
      private final @Nullable Input<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    @InputImport(name="subnetworkUri")
      private final @Nullable Input<String> subnetworkUri;

    public Input<String> getSubnetworkUri() {
        return this.subnetworkUri == null ? Input.empty() : this.subnetworkUri;
    }

    /**
     * The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    @InputImport(name="zoneUri")
      private final @Nullable Input<String> zoneUri;

    public Input<String> getZoneUri() {
        return this.zoneUri == null ? Input.empty() : this.zoneUri;
    }

    public GceClusterConfigArgs(
        @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig,
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
        this.confidentialInstanceConfig = confidentialInstanceConfig;
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
        this.confidentialInstanceConfig = Input.empty();
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
        private @Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;
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
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
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

        public Builder setConfidentialInstanceConfig(@Nullable Input<ConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder setConfidentialInstanceConfig(@Nullable ConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Input.ofNullable(confidentialInstanceConfig);
            return this;
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
            return new GceClusterConfigArgs(confidentialInstanceConfig, internalIpOnly, metadata, networkUri, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetworkUri, tags, zoneUri);
        }
    }
}

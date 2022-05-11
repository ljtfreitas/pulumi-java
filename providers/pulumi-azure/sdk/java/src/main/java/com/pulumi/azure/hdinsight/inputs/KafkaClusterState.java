// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterMonitorArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterRestProxyArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterSecurityProfileArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs;
import com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountGen2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterState extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterState Empty = new KafkaClusterState();

    /**
     * Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterVersion")
    private @Nullable Output<String> clusterVersion;

    /**
     * @return Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }

    /**
     * A `component_version` block as defined below.
     * 
     */
    @Import(name="componentVersion")
    private @Nullable Output<KafkaClusterComponentVersionArgs> componentVersion;

    /**
     * @return A `component_version` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterComponentVersionArgs>> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }

    /**
     * Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="encryptionInTransitEnabled")
    private @Nullable Output<Boolean> encryptionInTransitEnabled;

    /**
     * @return Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> encryptionInTransitEnabled() {
        return Optional.ofNullable(this.encryptionInTransitEnabled);
    }

    /**
     * A `gateway` block as defined below.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<KafkaClusterGatewayArgs> gateway;

    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterGatewayArgs>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Import(name="httpsEndpoint")
    private @Nullable Output<String> httpsEndpoint;

    /**
     * @return The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Optional<Output<String>> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }

    /**
     * The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Import(name="kafkaRestProxyEndpoint")
    private @Nullable Output<String> kafkaRestProxyEndpoint;

    /**
     * @return The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Optional<Output<String>> kafkaRestProxyEndpoint() {
        return Optional.ofNullable(this.kafkaRestProxyEndpoint);
    }

    /**
     * Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `metastores` block as defined below.
     * 
     */
    @Import(name="metastores")
    private @Nullable Output<KafkaClusterMetastoresArgs> metastores;

    /**
     * @return A `metastores` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterMetastoresArgs>> metastores() {
        return Optional.ofNullable(this.metastores);
    }

    /**
     * A `monitor` block as defined below.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<KafkaClusterMonitorArgs> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterMonitorArgs>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `rest_proxy` block as defined below.
     * 
     */
    @Import(name="restProxy")
    private @Nullable Output<KafkaClusterRestProxyArgs> restProxy;

    /**
     * @return A `rest_proxy` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterRestProxyArgs>> restProxy() {
        return Optional.ofNullable(this.restProxy);
    }

    /**
     * A `roles` block as defined below.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<KafkaClusterRolesArgs> roles;

    /**
     * @return A `roles` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterRolesArgs>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * A `security_profile` block as defined below.
     * 
     */
    @Import(name="securityProfile")
    private @Nullable Output<KafkaClusterSecurityProfileArgs> securityProfile;

    /**
     * @return A `security_profile` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterSecurityProfileArgs>> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }

    /**
     * The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    @Import(name="sshEndpoint")
    private @Nullable Output<String> sshEndpoint;

    /**
     * @return The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
     * 
     */
    public Optional<Output<String>> sshEndpoint() {
        return Optional.ofNullable(this.sshEndpoint);
    }

    /**
     * A `storage_account_gen2` block as defined below.
     * 
     */
    @Import(name="storageAccountGen2")
    private @Nullable Output<KafkaClusterStorageAccountGen2Args> storageAccountGen2;

    /**
     * @return A `storage_account_gen2` block as defined below.
     * 
     */
    public Optional<Output<KafkaClusterStorageAccountGen2Args>> storageAccountGen2() {
        return Optional.ofNullable(this.storageAccountGen2);
    }

    /**
     * One or more `storage_account` block as defined below.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<KafkaClusterStorageAccountArgs>> storageAccounts;

    /**
     * @return One or more `storage_account` block as defined below.
     * 
     */
    public Optional<Output<List<KafkaClusterStorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * A map of Tags which should be assigned to this HDInsight Kafka Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of Tags which should be assigned to this HDInsight Kafka Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tlsMinVersion")
    private @Nullable Output<String> tlsMinVersion;

    /**
     * @return The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tlsMinVersion() {
        return Optional.ofNullable(this.tlsMinVersion);
    }

    private KafkaClusterState() {}

    private KafkaClusterState(KafkaClusterState $) {
        this.clusterVersion = $.clusterVersion;
        this.componentVersion = $.componentVersion;
        this.encryptionInTransitEnabled = $.encryptionInTransitEnabled;
        this.gateway = $.gateway;
        this.httpsEndpoint = $.httpsEndpoint;
        this.kafkaRestProxyEndpoint = $.kafkaRestProxyEndpoint;
        this.location = $.location;
        this.metastores = $.metastores;
        this.monitor = $.monitor;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.restProxy = $.restProxy;
        this.roles = $.roles;
        this.securityProfile = $.securityProfile;
        this.sshEndpoint = $.sshEndpoint;
        this.storageAccountGen2 = $.storageAccountGen2;
        this.storageAccounts = $.storageAccounts;
        this.tags = $.tags;
        this.tier = $.tier;
        this.tlsMinVersion = $.tlsMinVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterState $;

        public Builder() {
            $ = new KafkaClusterState();
        }

        public Builder(KafkaClusterState defaults) {
            $ = new KafkaClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(@Nullable Output<KafkaClusterComponentVersionArgs> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(KafkaClusterComponentVersionArgs componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param encryptionInTransitEnabled Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryptionInTransitEnabled(@Nullable Output<Boolean> encryptionInTransitEnabled) {
            $.encryptionInTransitEnabled = encryptionInTransitEnabled;
            return this;
        }

        /**
         * @param encryptionInTransitEnabled Whether encryption in transit is enabled for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder encryptionInTransitEnabled(Boolean encryptionInTransitEnabled) {
            return encryptionInTransitEnabled(Output.of(encryptionInTransitEnabled));
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<KafkaClusterGatewayArgs> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(KafkaClusterGatewayArgs gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(@Nullable Output<String> httpsEndpoint) {
            $.httpsEndpoint = httpsEndpoint;
            return this;
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(String httpsEndpoint) {
            return httpsEndpoint(Output.of(httpsEndpoint));
        }

        /**
         * @param kafkaRestProxyEndpoint The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestProxyEndpoint(@Nullable Output<String> kafkaRestProxyEndpoint) {
            $.kafkaRestProxyEndpoint = kafkaRestProxyEndpoint;
            return this;
        }

        /**
         * @param kafkaRestProxyEndpoint The Kafka Rest Proxy Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestProxyEndpoint(String kafkaRestProxyEndpoint) {
            return kafkaRestProxyEndpoint(Output.of(kafkaRestProxyEndpoint));
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(@Nullable Output<KafkaClusterMetastoresArgs> metastores) {
            $.metastores = metastores;
            return this;
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(KafkaClusterMetastoresArgs metastores) {
            return metastores(Output.of(metastores));
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<KafkaClusterMonitorArgs> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(KafkaClusterMonitorArgs monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param name Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name for this HDInsight Kafka Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight Kafka Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param restProxy A `rest_proxy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder restProxy(@Nullable Output<KafkaClusterRestProxyArgs> restProxy) {
            $.restProxy = restProxy;
            return this;
        }

        /**
         * @param restProxy A `rest_proxy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder restProxy(KafkaClusterRestProxyArgs restProxy) {
            return restProxy(Output.of(restProxy));
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<KafkaClusterRolesArgs> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(KafkaClusterRolesArgs roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param securityProfile A `security_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(@Nullable Output<KafkaClusterSecurityProfileArgs> securityProfile) {
            $.securityProfile = securityProfile;
            return this;
        }

        /**
         * @param securityProfile A `security_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(KafkaClusterSecurityProfileArgs securityProfile) {
            return securityProfile(Output.of(securityProfile));
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(@Nullable Output<String> sshEndpoint) {
            $.sshEndpoint = sshEndpoint;
            return this;
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(String sshEndpoint) {
            return sshEndpoint(Output.of(sshEndpoint));
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(@Nullable Output<KafkaClusterStorageAccountGen2Args> storageAccountGen2) {
            $.storageAccountGen2 = storageAccountGen2;
            return this;
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(KafkaClusterStorageAccountGen2Args storageAccountGen2) {
            return storageAccountGen2(Output.of(storageAccountGen2));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<KafkaClusterStorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<KafkaClusterStorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(KafkaClusterStorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight Kafka Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight Kafka Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param tlsMinVersion The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(@Nullable Output<String> tlsMinVersion) {
            $.tlsMinVersion = tlsMinVersion;
            return this;
        }

        /**
         * @param tlsMinVersion The minimal supported TLS version. Possible values are `1.0`, `1.1` or `1.2`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(String tlsMinVersion) {
            return tlsMinVersion(Output.of(tlsMinVersion));
        }

        public KafkaClusterState build() {
            return $;
        }
    }

}

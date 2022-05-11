// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric;

import com.pulumi.azure.servicefabric.inputs.ClusterAzureActiveDirectoryArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterCertificateArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateCommonNameArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateThumbprintArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterDiagnosticsConfigArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterFabricSettingArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * A List of one or more features which should be enabled, such as `DnsService`.
     * 
     */
    @Import(name="addOnFeatures")
    private @Nullable Output<List<String>> addOnFeatures;

    /**
     * @return A List of one or more features which should be enabled, such as `DnsService`.
     * 
     */
    public Optional<Output<List<String>>> addOnFeatures() {
        return Optional.ofNullable(this.addOnFeatures);
    }

    /**
     * An `azure_active_directory` block as defined below.
     * 
     */
    @Import(name="azureActiveDirectory")
    private @Nullable Output<ClusterAzureActiveDirectoryArgs> azureActiveDirectory;

    /**
     * @return An `azure_active_directory` block as defined below.
     * 
     */
    public Optional<Output<ClusterAzureActiveDirectoryArgs>> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }

    /**
     * A `certificate` block as defined below. Conflicts with `certificate_common_names`.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<ClusterCertificateArgs> certificate;

    /**
     * @return A `certificate` block as defined below. Conflicts with `certificate_common_names`.
     * 
     */
    public Optional<Output<ClusterCertificateArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * A `certificate_common_names` block as defined below. Conflicts with `certificate`.
     * 
     */
    @Import(name="certificateCommonNames")
    private @Nullable Output<ClusterCertificateCommonNamesArgs> certificateCommonNames;

    /**
     * @return A `certificate_common_names` block as defined below. Conflicts with `certificate`.
     * 
     */
    public Optional<Output<ClusterCertificateCommonNamesArgs>> certificateCommonNames() {
        return Optional.ofNullable(this.certificateCommonNames);
    }

    /**
     * A `client_certificate_common_name` block as defined below.
     * 
     */
    @Import(name="clientCertificateCommonNames")
    private @Nullable Output<List<ClusterClientCertificateCommonNameArgs>> clientCertificateCommonNames;

    /**
     * @return A `client_certificate_common_name` block as defined below.
     * 
     */
    public Optional<Output<List<ClusterClientCertificateCommonNameArgs>>> clientCertificateCommonNames() {
        return Optional.ofNullable(this.clientCertificateCommonNames);
    }

    /**
     * One or more `client_certificate_thumbprint` blocks as defined below.
     * 
     */
    @Import(name="clientCertificateThumbprints")
    private @Nullable Output<List<ClusterClientCertificateThumbprintArgs>> clientCertificateThumbprints;

    /**
     * @return One or more `client_certificate_thumbprint` blocks as defined below.
     * 
     */
    public Optional<Output<List<ClusterClientCertificateThumbprintArgs>>> clientCertificateThumbprints() {
        return Optional.ofNullable(this.clientCertificateThumbprints);
    }

    /**
     * Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
     * 
     */
    @Import(name="clusterCodeVersion")
    private @Nullable Output<String> clusterCodeVersion;

    /**
     * @return Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
     * 
     */
    public Optional<Output<String>> clusterCodeVersion() {
        return Optional.ofNullable(this.clusterCodeVersion);
    }

    /**
     * A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="diagnosticsConfig")
    private @Nullable Output<ClusterDiagnosticsConfigArgs> diagnosticsConfig;

    /**
     * @return A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<ClusterDiagnosticsConfigArgs>> diagnosticsConfig() {
        return Optional.ofNullable(this.diagnosticsConfig);
    }

    /**
     * One or more `fabric_settings` blocks as defined below.
     * 
     */
    @Import(name="fabricSettings")
    private @Nullable Output<List<ClusterFabricSettingArgs>> fabricSettings;

    /**
     * @return One or more `fabric_settings` blocks as defined below.
     * 
     */
    public Optional<Output<List<ClusterFabricSettingArgs>>> fabricSettings() {
        return Optional.ofNullable(this.fabricSettings);
    }

    /**
     * Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managementEndpoint", required=true)
    private Output<String> managementEndpoint;

    /**
     * @return Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `node_type` blocks as defined below.
     * 
     */
    @Import(name="nodeTypes", required=true)
    private Output<List<ClusterNodeTypeArgs>> nodeTypes;

    /**
     * @return One or more `node_type` blocks as defined below.
     * 
     */
    public Output<List<ClusterNodeTypeArgs>> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
     * 
     */
    @Import(name="reliabilityLevel", required=true)
    private Output<String> reliabilityLevel;

    /**
     * @return Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
     * 
     */
    public Output<String> reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
     * 
     */
    @Import(name="reverseProxyCertificate")
    private @Nullable Output<ClusterReverseProxyCertificateArgs> reverseProxyCertificate;

    /**
     * @return A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
     * 
     */
    public Optional<Output<ClusterReverseProxyCertificateArgs>> reverseProxyCertificate() {
        return Optional.ofNullable(this.reverseProxyCertificate);
    }

    /**
     * A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
     * 
     */
    @Import(name="reverseProxyCertificateCommonNames")
    private @Nullable Output<ClusterReverseProxyCertificateCommonNamesArgs> reverseProxyCertificateCommonNames;

    /**
     * @return A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
     * 
     */
    public Optional<Output<ClusterReverseProxyCertificateCommonNamesArgs>> reverseProxyCertificateCommonNames() {
        return Optional.ofNullable(this.reverseProxyCertificateCommonNames);
    }

    /**
     * Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    @Import(name="serviceFabricZonalUpgradeMode")
    private @Nullable Output<String> serviceFabricZonalUpgradeMode;

    /**
     * @return Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    public Optional<Output<String>> serviceFabricZonalUpgradeMode() {
        return Optional.ofNullable(this.serviceFabricZonalUpgradeMode);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
     * 
     */
    @Import(name="upgradeMode", required=true)
    private Output<String> upgradeMode;

    /**
     * @return Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
     * 
     */
    public Output<String> upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * A `upgrade_policy` block as defined below.
     * 
     */
    @Import(name="upgradePolicy")
    private @Nullable Output<ClusterUpgradePolicyArgs> upgradePolicy;

    /**
     * @return A `upgrade_policy` block as defined below.
     * 
     */
    public Optional<Output<ClusterUpgradePolicyArgs>> upgradePolicy() {
        return Optional.ofNullable(this.upgradePolicy);
    }

    /**
     * Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vmImage", required=true)
    private Output<String> vmImage;

    /**
     * @return Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmImage() {
        return this.vmImage;
    }

    /**
     * Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    @Import(name="vmssZonalUpgradeMode")
    private @Nullable Output<String> vmssZonalUpgradeMode;

    /**
     * @return Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    public Optional<Output<String>> vmssZonalUpgradeMode() {
        return Optional.ofNullable(this.vmssZonalUpgradeMode);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.addOnFeatures = $.addOnFeatures;
        this.azureActiveDirectory = $.azureActiveDirectory;
        this.certificate = $.certificate;
        this.certificateCommonNames = $.certificateCommonNames;
        this.clientCertificateCommonNames = $.clientCertificateCommonNames;
        this.clientCertificateThumbprints = $.clientCertificateThumbprints;
        this.clusterCodeVersion = $.clusterCodeVersion;
        this.diagnosticsConfig = $.diagnosticsConfig;
        this.fabricSettings = $.fabricSettings;
        this.location = $.location;
        this.managementEndpoint = $.managementEndpoint;
        this.name = $.name;
        this.nodeTypes = $.nodeTypes;
        this.reliabilityLevel = $.reliabilityLevel;
        this.resourceGroupName = $.resourceGroupName;
        this.reverseProxyCertificate = $.reverseProxyCertificate;
        this.reverseProxyCertificateCommonNames = $.reverseProxyCertificateCommonNames;
        this.serviceFabricZonalUpgradeMode = $.serviceFabricZonalUpgradeMode;
        this.tags = $.tags;
        this.upgradeMode = $.upgradeMode;
        this.upgradePolicy = $.upgradePolicy;
        this.vmImage = $.vmImage;
        this.vmssZonalUpgradeMode = $.vmssZonalUpgradeMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addOnFeatures A List of one or more features which should be enabled, such as `DnsService`.
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(@Nullable Output<List<String>> addOnFeatures) {
            $.addOnFeatures = addOnFeatures;
            return this;
        }

        /**
         * @param addOnFeatures A List of one or more features which should be enabled, such as `DnsService`.
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(List<String> addOnFeatures) {
            return addOnFeatures(Output.of(addOnFeatures));
        }

        /**
         * @param addOnFeatures A List of one or more features which should be enabled, such as `DnsService`.
         * 
         * @return builder
         * 
         */
        public Builder addOnFeatures(String... addOnFeatures) {
            return addOnFeatures(List.of(addOnFeatures));
        }

        /**
         * @param azureActiveDirectory An `azure_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(@Nullable Output<ClusterAzureActiveDirectoryArgs> azureActiveDirectory) {
            $.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        /**
         * @param azureActiveDirectory An `azure_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(ClusterAzureActiveDirectoryArgs azureActiveDirectory) {
            return azureActiveDirectory(Output.of(azureActiveDirectory));
        }

        /**
         * @param certificate A `certificate` block as defined below. Conflicts with `certificate_common_names`.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<ClusterCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate A `certificate` block as defined below. Conflicts with `certificate_common_names`.
         * 
         * @return builder
         * 
         */
        public Builder certificate(ClusterCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateCommonNames A `certificate_common_names` block as defined below. Conflicts with `certificate`.
         * 
         * @return builder
         * 
         */
        public Builder certificateCommonNames(@Nullable Output<ClusterCertificateCommonNamesArgs> certificateCommonNames) {
            $.certificateCommonNames = certificateCommonNames;
            return this;
        }

        /**
         * @param certificateCommonNames A `certificate_common_names` block as defined below. Conflicts with `certificate`.
         * 
         * @return builder
         * 
         */
        public Builder certificateCommonNames(ClusterCertificateCommonNamesArgs certificateCommonNames) {
            return certificateCommonNames(Output.of(certificateCommonNames));
        }

        /**
         * @param clientCertificateCommonNames A `client_certificate_common_name` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateCommonNames(@Nullable Output<List<ClusterClientCertificateCommonNameArgs>> clientCertificateCommonNames) {
            $.clientCertificateCommonNames = clientCertificateCommonNames;
            return this;
        }

        /**
         * @param clientCertificateCommonNames A `client_certificate_common_name` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateCommonNames(List<ClusterClientCertificateCommonNameArgs> clientCertificateCommonNames) {
            return clientCertificateCommonNames(Output.of(clientCertificateCommonNames));
        }

        /**
         * @param clientCertificateCommonNames A `client_certificate_common_name` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateCommonNames(ClusterClientCertificateCommonNameArgs... clientCertificateCommonNames) {
            return clientCertificateCommonNames(List.of(clientCertificateCommonNames));
        }

        /**
         * @param clientCertificateThumbprints One or more `client_certificate_thumbprint` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateThumbprints(@Nullable Output<List<ClusterClientCertificateThumbprintArgs>> clientCertificateThumbprints) {
            $.clientCertificateThumbprints = clientCertificateThumbprints;
            return this;
        }

        /**
         * @param clientCertificateThumbprints One or more `client_certificate_thumbprint` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateThumbprints(List<ClusterClientCertificateThumbprintArgs> clientCertificateThumbprints) {
            return clientCertificateThumbprints(Output.of(clientCertificateThumbprints));
        }

        /**
         * @param clientCertificateThumbprints One or more `client_certificate_thumbprint` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateThumbprints(ClusterClientCertificateThumbprintArgs... clientCertificateThumbprints) {
            return clientCertificateThumbprints(List.of(clientCertificateThumbprints));
        }

        /**
         * @param clusterCodeVersion Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterCodeVersion(@Nullable Output<String> clusterCodeVersion) {
            $.clusterCodeVersion = clusterCodeVersion;
            return this;
        }

        /**
         * @param clusterCodeVersion Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterCodeVersion(String clusterCodeVersion) {
            return clusterCodeVersion(Output.of(clusterCodeVersion));
        }

        /**
         * @param diagnosticsConfig A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsConfig(@Nullable Output<ClusterDiagnosticsConfigArgs> diagnosticsConfig) {
            $.diagnosticsConfig = diagnosticsConfig;
            return this;
        }

        /**
         * @param diagnosticsConfig A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsConfig(ClusterDiagnosticsConfigArgs diagnosticsConfig) {
            return diagnosticsConfig(Output.of(diagnosticsConfig));
        }

        /**
         * @param fabricSettings One or more `fabric_settings` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder fabricSettings(@Nullable Output<List<ClusterFabricSettingArgs>> fabricSettings) {
            $.fabricSettings = fabricSettings;
            return this;
        }

        /**
         * @param fabricSettings One or more `fabric_settings` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder fabricSettings(List<ClusterFabricSettingArgs> fabricSettings) {
            return fabricSettings(Output.of(fabricSettings));
        }

        /**
         * @param fabricSettings One or more `fabric_settings` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder fabricSettings(ClusterFabricSettingArgs... fabricSettings) {
            return fabricSettings(List.of(fabricSettings));
        }

        /**
         * @param location Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementEndpoint Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoint(Output<String> managementEndpoint) {
            $.managementEndpoint = managementEndpoint;
            return this;
        }

        /**
         * @param managementEndpoint Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoint(String managementEndpoint) {
            return managementEndpoint(Output.of(managementEndpoint));
        }

        /**
         * @param name The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(Output<List<ClusterNodeTypeArgs>> nodeTypes) {
            $.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(List<ClusterNodeTypeArgs> nodeTypes) {
            return nodeTypes(Output.of(nodeTypes));
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(ClusterNodeTypeArgs... nodeTypes) {
            return nodeTypes(List.of(nodeTypes));
        }

        /**
         * @param reliabilityLevel Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
         * 
         * @return builder
         * 
         */
        public Builder reliabilityLevel(Output<String> reliabilityLevel) {
            $.reliabilityLevel = reliabilityLevel;
            return this;
        }

        /**
         * @param reliabilityLevel Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
         * 
         * @return builder
         * 
         */
        public Builder reliabilityLevel(String reliabilityLevel) {
            return reliabilityLevel(Output.of(reliabilityLevel));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param reverseProxyCertificate A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
         * 
         * @return builder
         * 
         */
        public Builder reverseProxyCertificate(@Nullable Output<ClusterReverseProxyCertificateArgs> reverseProxyCertificate) {
            $.reverseProxyCertificate = reverseProxyCertificate;
            return this;
        }

        /**
         * @param reverseProxyCertificate A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
         * 
         * @return builder
         * 
         */
        public Builder reverseProxyCertificate(ClusterReverseProxyCertificateArgs reverseProxyCertificate) {
            return reverseProxyCertificate(Output.of(reverseProxyCertificate));
        }

        /**
         * @param reverseProxyCertificateCommonNames A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
         * 
         * @return builder
         * 
         */
        public Builder reverseProxyCertificateCommonNames(@Nullable Output<ClusterReverseProxyCertificateCommonNamesArgs> reverseProxyCertificateCommonNames) {
            $.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
            return this;
        }

        /**
         * @param reverseProxyCertificateCommonNames A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
         * 
         * @return builder
         * 
         */
        public Builder reverseProxyCertificateCommonNames(ClusterReverseProxyCertificateCommonNamesArgs reverseProxyCertificateCommonNames) {
            return reverseProxyCertificateCommonNames(Output.of(reverseProxyCertificateCommonNames));
        }

        /**
         * @param serviceFabricZonalUpgradeMode Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
         * 
         * @return builder
         * 
         */
        public Builder serviceFabricZonalUpgradeMode(@Nullable Output<String> serviceFabricZonalUpgradeMode) {
            $.serviceFabricZonalUpgradeMode = serviceFabricZonalUpgradeMode;
            return this;
        }

        /**
         * @param serviceFabricZonalUpgradeMode Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
         * 
         * @return builder
         * 
         */
        public Builder serviceFabricZonalUpgradeMode(String serviceFabricZonalUpgradeMode) {
            return serviceFabricZonalUpgradeMode(Output.of(serviceFabricZonalUpgradeMode));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param upgradeMode Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeMode(Output<String> upgradeMode) {
            $.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * @param upgradeMode Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeMode(String upgradeMode) {
            return upgradeMode(Output.of(upgradeMode));
        }

        /**
         * @param upgradePolicy A `upgrade_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder upgradePolicy(@Nullable Output<ClusterUpgradePolicyArgs> upgradePolicy) {
            $.upgradePolicy = upgradePolicy;
            return this;
        }

        /**
         * @param upgradePolicy A `upgrade_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder upgradePolicy(ClusterUpgradePolicyArgs upgradePolicy) {
            return upgradePolicy(Output.of(upgradePolicy));
        }

        /**
         * @param vmImage Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(Output<String> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        /**
         * @param vmImage Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(String vmImage) {
            return vmImage(Output.of(vmImage));
        }

        /**
         * @param vmssZonalUpgradeMode Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
         * 
         * @return builder
         * 
         */
        public Builder vmssZonalUpgradeMode(@Nullable Output<String> vmssZonalUpgradeMode) {
            $.vmssZonalUpgradeMode = vmssZonalUpgradeMode;
            return this;
        }

        /**
         * @param vmssZonalUpgradeMode Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
         * 
         * @return builder
         * 
         */
        public Builder vmssZonalUpgradeMode(String vmssZonalUpgradeMode) {
            return vmssZonalUpgradeMode(Output.of(vmssZonalUpgradeMode));
        }

        public ClusterArgs build() {
            $.managementEndpoint = Objects.requireNonNull($.managementEndpoint, "expected parameter 'managementEndpoint' to be non-null");
            $.nodeTypes = Objects.requireNonNull($.nodeTypes, "expected parameter 'nodeTypes' to be non-null");
            $.reliabilityLevel = Objects.requireNonNull($.reliabilityLevel, "expected parameter 'reliabilityLevel' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.upgradeMode = Objects.requireNonNull($.upgradeMode, "expected parameter 'upgradeMode' to be non-null");
            $.vmImage = Objects.requireNonNull($.vmImage, "expected parameter 'vmImage' to be non-null");
            return $;
        }
    }

}

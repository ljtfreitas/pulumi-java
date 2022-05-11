// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerinstance.ContainerGroupArgs;
import com.pulumi.azurenative.containerinstance.outputs.ContainerGroupDiagnosticsResponse;
import com.pulumi.azurenative.containerinstance.outputs.ContainerGroupIdentityResponse;
import com.pulumi.azurenative.containerinstance.outputs.ContainerGroupNetworkProfileResponse;
import com.pulumi.azurenative.containerinstance.outputs.ContainerGroupResponseInstanceView;
import com.pulumi.azurenative.containerinstance.outputs.ContainerResponse;
import com.pulumi.azurenative.containerinstance.outputs.DnsConfigurationResponse;
import com.pulumi.azurenative.containerinstance.outputs.EncryptionPropertiesResponse;
import com.pulumi.azurenative.containerinstance.outputs.ImageRegistryCredentialResponse;
import com.pulumi.azurenative.containerinstance.outputs.InitContainerDefinitionResponse;
import com.pulumi.azurenative.containerinstance.outputs.IpAddressResponse;
import com.pulumi.azurenative.containerinstance.outputs.VolumeResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A container group.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### ContainerGroupsCreateOrUpdate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var containerGroup = new ContainerGroup(&#34;containerGroup&#34;, ContainerGroupArgs.builder()        
 *             .containerGroupName(&#34;demo1&#34;)
 *             .containers(Map.ofEntries(
 *                 Map.entry(&#34;command&#34;, ),
 *                 Map.entry(&#34;environmentVariables&#34;, ),
 *                 Map.entry(&#34;image&#34;, &#34;nginx&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;demo1&#34;),
 *                 Map.entry(&#34;ports&#34;, Map.of(&#34;port&#34;, 80)),
 *                 Map.entry(&#34;resources&#34;, Map.of(&#34;requests&#34;, Map.ofEntries(
 *                     Map.entry(&#34;cpu&#34;, 1),
 *                     Map.entry(&#34;gpu&#34;, Map.ofEntries(
 *                         Map.entry(&#34;count&#34;, 1),
 *                         Map.entry(&#34;sku&#34;, &#34;K80&#34;)
 *                     )),
 *                     Map.entry(&#34;memoryInGB&#34;, 1.5)
 *                 ))),
 *                 Map.entry(&#34;volumeMounts&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;mountPath&#34;, &#34;/mnt/volume1&#34;),
 *                         Map.entry(&#34;name&#34;, &#34;volume1&#34;),
 *                         Map.entry(&#34;readOnly&#34;, false)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;mountPath&#34;, &#34;/mnt/volume2&#34;),
 *                         Map.entry(&#34;name&#34;, &#34;volume2&#34;),
 *                         Map.entry(&#34;readOnly&#34;, false)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;mountPath&#34;, &#34;/mnt/volume3&#34;),
 *                         Map.entry(&#34;name&#34;, &#34;volume3&#34;),
 *                         Map.entry(&#34;readOnly&#34;, true)
 *                     ))
 *             ))
 *             .diagnostics(Map.of(&#34;logAnalytics&#34;, Map.ofEntries(
 *                 Map.entry(&#34;logType&#34;, &#34;ContainerInsights&#34;),
 *                 Map.entry(&#34;metadata&#34;, Map.of(&#34;test-key&#34;, &#34;test-metadata-value&#34;)),
 *                 Map.entry(&#34;workspaceId&#34;, &#34;workspaceid&#34;),
 *                 Map.entry(&#34;workspaceKey&#34;, &#34;workspaceKey&#34;)
 *             )))
 *             .dnsConfig(Map.ofEntries(
 *                 Map.entry(&#34;nameServers&#34;, &#34;1.1.1.1&#34;),
 *                 Map.entry(&#34;options&#34;, &#34;ndots:2&#34;),
 *                 Map.entry(&#34;searchDomains&#34;, &#34;cluster.local svc.cluster.local&#34;)
 *             ))
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;SystemAssigned, UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name&#34;, ))
 *             ))
 *             .imageRegistryCredentials()
 *             .ipAddress(Map.ofEntries(
 *                 Map.entry(&#34;dnsNameLabel&#34;, &#34;dnsnamelabel1&#34;),
 *                 Map.entry(&#34;ports&#34;, Map.ofEntries(
 *                     Map.entry(&#34;port&#34;, 80),
 *                     Map.entry(&#34;protocol&#34;, &#34;TCP&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;Public&#34;)
 *             ))
 *             .location(&#34;west us&#34;)
 *             .networkProfile(Map.of(&#34;id&#34;, &#34;test-network-profile-id&#34;))
 *             .osType(&#34;Linux&#34;)
 *             .resourceGroupName(&#34;demo&#34;)
 *             .volumes(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;azureFile&#34;, Map.ofEntries(
 *                         Map.entry(&#34;shareName&#34;, &#34;shareName&#34;),
 *                         Map.entry(&#34;storageAccountKey&#34;, &#34;accountKey&#34;),
 *                         Map.entry(&#34;storageAccountName&#34;, &#34;accountName&#34;)
 *                     )),
 *                     Map.entry(&#34;name&#34;, &#34;volume1&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;emptyDir&#34;, ),
 *                     Map.entry(&#34;name&#34;, &#34;volume2&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;volume3&#34;),
 *                     Map.entry(&#34;secret&#34;, Map.ofEntries(
 *                         Map.entry(&#34;secretKey1&#34;, &#34;SecretValue1InBase64&#34;),
 *                         Map.entry(&#34;secretKey2&#34;, &#34;SecretValue2InBase64&#34;)
 *                     ))
 *                 ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerinstance:ContainerGroup demo1 /subscriptions/subid/resourceGroups/demo/providers/Microsoft.ContainerInstance/containerGroups/demo1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerinstance:ContainerGroup")
public class ContainerGroup extends com.pulumi.resources.CustomResource {
    /**
     * The containers within the container group.
     * 
     */
    @Export(name="containers", type=List.class, parameters={ContainerResponse.class})
    private Output<List<ContainerResponse>> containers;

    /**
     * @return The containers within the container group.
     * 
     */
    public Output<List<ContainerResponse>> containers() {
        return this.containers;
    }
    /**
     * The diagnostic information for a container group.
     * 
     */
    @Export(name="diagnostics", type=ContainerGroupDiagnosticsResponse.class, parameters={})
    private Output</* @Nullable */ ContainerGroupDiagnosticsResponse> diagnostics;

    /**
     * @return The diagnostic information for a container group.
     * 
     */
    public Output<Optional<ContainerGroupDiagnosticsResponse>> diagnostics() {
        return Codegen.optional(this.diagnostics);
    }
    /**
     * The DNS config information for a container group.
     * 
     */
    @Export(name="dnsConfig", type=DnsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ DnsConfigurationResponse> dnsConfig;

    /**
     * @return The DNS config information for a container group.
     * 
     */
    public Output<Optional<DnsConfigurationResponse>> dnsConfig() {
        return Codegen.optional(this.dnsConfig);
    }
    /**
     * The encryption properties for a container group.
     * 
     */
    @Export(name="encryptionProperties", type=EncryptionPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionPropertiesResponse> encryptionProperties;

    /**
     * @return The encryption properties for a container group.
     * 
     */
    public Output<Optional<EncryptionPropertiesResponse>> encryptionProperties() {
        return Codegen.optional(this.encryptionProperties);
    }
    /**
     * The identity of the container group, if configured.
     * 
     */
    @Export(name="identity", type=ContainerGroupIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ContainerGroupIdentityResponse> identity;

    /**
     * @return The identity of the container group, if configured.
     * 
     */
    public Output<Optional<ContainerGroupIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The image registry credentials by which the container group is created from.
     * 
     */
    @Export(name="imageRegistryCredentials", type=List.class, parameters={ImageRegistryCredentialResponse.class})
    private Output</* @Nullable */ List<ImageRegistryCredentialResponse>> imageRegistryCredentials;

    /**
     * @return The image registry credentials by which the container group is created from.
     * 
     */
    public Output<Optional<List<ImageRegistryCredentialResponse>>> imageRegistryCredentials() {
        return Codegen.optional(this.imageRegistryCredentials);
    }
    /**
     * The init containers for a container group.
     * 
     */
    @Export(name="initContainers", type=List.class, parameters={InitContainerDefinitionResponse.class})
    private Output</* @Nullable */ List<InitContainerDefinitionResponse>> initContainers;

    /**
     * @return The init containers for a container group.
     * 
     */
    public Output<Optional<List<InitContainerDefinitionResponse>>> initContainers() {
        return Codegen.optional(this.initContainers);
    }
    /**
     * The instance view of the container group. Only valid in response.
     * 
     */
    @Export(name="instanceView", type=ContainerGroupResponseInstanceView.class, parameters={})
    private Output<ContainerGroupResponseInstanceView> instanceView;

    /**
     * @return The instance view of the container group. Only valid in response.
     * 
     */
    public Output<ContainerGroupResponseInstanceView> instanceView() {
        return this.instanceView;
    }
    /**
     * The IP address type of the container group.
     * 
     */
    @Export(name="ipAddress", type=IpAddressResponse.class, parameters={})
    private Output</* @Nullable */ IpAddressResponse> ipAddress;

    /**
     * @return The IP address type of the container group.
     * 
     */
    public Output<Optional<IpAddressResponse>> ipAddress() {
        return Codegen.optional(this.ipAddress);
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network profile information for a container group.
     * 
     */
    @Export(name="networkProfile", type=ContainerGroupNetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ ContainerGroupNetworkProfileResponse> networkProfile;

    /**
     * @return The network profile information for a container group.
     * 
     */
    public Output<Optional<ContainerGroupNetworkProfileResponse>> networkProfile() {
        return Codegen.optional(this.networkProfile);
    }
    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output<String> osType;

    /**
     * @return The operating system type required by the containers in the container group.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }
    /**
     * The provisioning state of the container group. This only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the container group. This only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    @Export(name="restartPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> restartPolicy;

    /**
     * @return Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    public Output<Optional<String>> restartPolicy() {
        return Codegen.optional(this.restartPolicy);
    }
    /**
     * The SKU for a container group.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The SKU for a container group.
     * 
     */
    public Output<Optional<String>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The list of volumes that can be mounted by containers in this container group.
     * 
     */
    @Export(name="volumes", type=List.class, parameters={VolumeResponse.class})
    private Output</* @Nullable */ List<VolumeResponse>> volumes;

    /**
     * @return The list of volumes that can be mounted by containers in this container group.
     * 
     */
    public Output<Optional<List<VolumeResponse>>> volumes() {
        return Codegen.optional(this.volumes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerGroup(String name) {
        this(name, ContainerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerGroup(String name, ContainerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerGroup(String name, ContainerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerinstance:ContainerGroup", name, args == null ? ContainerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerinstance:ContainerGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:containerinstance/v20170801preview:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20171001preview:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20171201preview:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20180201preview:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20180401:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20180601:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20180901:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20181001:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20191201:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20201101:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20210301:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20210701:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20210901:ContainerGroup").build()),
                Output.of(Alias.builder().type("azure-native:containerinstance/v20211001:ContainerGroup").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContainerGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerGroup(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databoxedge.KubernetesRoleArgs;
import com.pulumi.azurenative.databoxedge.outputs.KubernetesClusterInfoResponse;
import com.pulumi.azurenative.databoxedge.outputs.KubernetesRoleResourcesResponse;
import com.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Kubernetes role.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### RolePut
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
 *         var kubernetesRole = new KubernetesRole(&#34;kubernetesRole&#34;, KubernetesRoleArgs.builder()        
 *             .deviceName(&#34;testedgedevice&#34;)
 *             .name(&#34;IoTRole1&#34;)
 *             .resourceGroupName(&#34;GroupForEdgeAutomation&#34;)
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
 * $ pulumi import azure-native:databoxedge:KubernetesRole IoTRole1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/roles/IoTRole1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:KubernetesRole")
public class KubernetesRole extends com.pulumi.resources.CustomResource {
    /**
     * Host OS supported by the Kubernetes role.
     * 
     */
    @Export(name="hostPlatform", type=String.class, parameters={})
    private Output<String> hostPlatform;

    /**
     * @return Host OS supported by the Kubernetes role.
     * 
     */
    public Output<String> hostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the runtime is hosted.
     * 
     */
    @Export(name="hostPlatformType", type=String.class, parameters={})
    private Output<String> hostPlatformType;

    /**
     * @return Platform where the runtime is hosted.
     * 
     */
    public Output<String> hostPlatformType() {
        return this.hostPlatformType;
    }
    /**
     * Role type.
     * Expected value is &#39;Kubernetes&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Role type.
     * Expected value is &#39;Kubernetes&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Kubernetes cluster configuration
     * 
     */
    @Export(name="kubernetesClusterInfo", type=KubernetesClusterInfoResponse.class, parameters={})
    private Output<KubernetesClusterInfoResponse> kubernetesClusterInfo;

    /**
     * @return Kubernetes cluster configuration
     * 
     */
    public Output<KubernetesClusterInfoResponse> kubernetesClusterInfo() {
        return this.kubernetesClusterInfo;
    }
    /**
     * Kubernetes role resources
     * 
     */
    @Export(name="kubernetesRoleResources", type=KubernetesRoleResourcesResponse.class, parameters={})
    private Output<KubernetesRoleResourcesResponse> kubernetesRoleResources;

    /**
     * @return Kubernetes role resources
     * 
     */
    public Output<KubernetesRoleResourcesResponse> kubernetesRoleResources() {
        return this.kubernetesRoleResources;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of Kubernetes deployment
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of Kubernetes deployment
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Role status.
     * 
     */
    @Export(name="roleStatus", type=String.class, parameters={})
    private Output<String> roleStatus;

    /**
     * @return Role status.
     * 
     */
    public Output<String> roleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Role configured on ASE resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesRole(String name) {
        this(name, KubernetesRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesRole(String name, KubernetesRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesRole(String name, KubernetesRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:KubernetesRole", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private KubernetesRole(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:KubernetesRole", name, null, makeResourceOptions(options, id));
    }

    private static KubernetesRoleArgs makeArgs(KubernetesRoleArgs args) {
        var builder = args == null ? KubernetesRoleArgs.builder() : KubernetesRoleArgs.builder(args);
        return builder
            .kind("Kubernetes")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220301:KubernetesRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220401preview:KubernetesRole").build())
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
    public static KubernetesRole get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesRole(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppHostNameBindingSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A hostname binding object.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppHostNameBindingSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hostNameBindings/{hostName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppHostNameBindingSlot")
public class WebAppHostNameBindingSlot extends io.pulumi.resources.CustomResource {
    /**
     * Azure resource name.
     * 
     */
    @Export(name="azureResourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceName;

    /**
     * @return Azure resource name.
     * 
     */
    public Output</* @Nullable */ String> getAzureResourceName() {
        return this.azureResourceName;
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="azureResourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceType;

    /**
     * @return Azure resource type.
     * 
     */
    public Output</* @Nullable */ String> getAzureResourceType() {
        return this.azureResourceType;
    }
    /**
     * Custom DNS record type.
     * 
     */
    @Export(name="customHostNameDnsRecordType", type=String.class, parameters={})
    private Output</* @Nullable */ String> customHostNameDnsRecordType;

    /**
     * @return Custom DNS record type.
     * 
     */
    public Output</* @Nullable */ String> getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }
    /**
     * Fully qualified ARM domain resource URI.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainId;

    /**
     * @return Fully qualified ARM domain resource URI.
     * 
     */
    public Output</* @Nullable */ String> getDomainId() {
        return this.domainId;
    }
    /**
     * Hostname type.
     * 
     */
    @Export(name="hostNameType", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostNameType;

    /**
     * @return Hostname type.
     * 
     */
    public Output</* @Nullable */ String> getHostNameType() {
        return this.hostNameType;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * App Service app name.
     * 
     */
    @Export(name="siteName", type=String.class, parameters={})
    private Output</* @Nullable */ String> siteName;

    /**
     * @return App Service app name.
     * 
     */
    public Output</* @Nullable */ String> getSiteName() {
        return this.siteName;
    }
    /**
     * SSL type
     * 
     */
    @Export(name="sslState", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslState;

    /**
     * @return SSL type
     * 
     */
    public Output</* @Nullable */ String> getSslState() {
        return this.sslState;
    }
    /**
     * SSL certificate thumbprint
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprint;

    /**
     * @return SSL certificate thumbprint
     * 
     */
    public Output</* @Nullable */ String> getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    @Export(name="virtualIP", type=String.class, parameters={})
    private Output<String> virtualIP;

    /**
     * @return Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    public Output<String> getVirtualIP() {
        return this.virtualIP;
    }

    public interface BuilderApplicator {
        public void apply(WebAppHostNameBindingSlotArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppHostNameBindingSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppHostNameBindingSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppHostNameBindingSlot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppHostNameBindingSlot(String name) {
        this(name, WebAppHostNameBindingSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppHostNameBindingSlot(String name, WebAppHostNameBindingSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppHostNameBindingSlot(String name, WebAppHostNameBindingSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBindingSlot", name, args == null ? WebAppHostNameBindingSlotArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WebAppHostNameBindingSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBindingSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:web/v20150801:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20160801:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20180201:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20181101:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20190801:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20200601:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20200901:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20201001:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20201201:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20210101:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20210115:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20210201:WebAppHostNameBindingSlot").build()),
                Output.of(Alias.builder().setType("azure-native:web/v20210301:WebAppHostNameBindingSlot").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WebAppHostNameBindingSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHostNameBindingSlot(name, id, options);
    }
}

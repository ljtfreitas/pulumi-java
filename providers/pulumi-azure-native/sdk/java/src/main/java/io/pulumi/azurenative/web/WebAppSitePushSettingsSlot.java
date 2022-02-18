// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSitePushSettingsSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Push settings for the App.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSitePushSettingsSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/pushsettings 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSitePushSettingsSlot")
public class WebAppSitePushSettingsSlot extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @OutputExport(name="dynamicTagsJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> dynamicTagsJson;

    /**
     * @return Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    public Output</* @Nullable */ String> getDynamicTagsJson() {
        return this.dynamicTagsJson;
    }
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @OutputExport(name="isPushEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPushEnabled;

    /**
     * @return Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    public Output<Boolean> getIsPushEnabled() {
        return this.isPushEnabled;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
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
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @OutputExport(name="tagWhitelistJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagWhitelistJson;

    /**
     * @return Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    public Output</* @Nullable */ String> getTagWhitelistJson() {
        return this.tagWhitelistJson;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    @OutputExport(name="tagsRequiringAuth", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagsRequiringAuth;

    /**
     * @return Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    public Output</* @Nullable */ String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSitePushSettingsSlot(String name, WebAppSitePushSettingsSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettingsSlot", name, args == null ? WebAppSitePushSettingsSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppSitePushSettingsSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettingsSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppSitePushSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppSitePushSettingsSlot").build())
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
    public static WebAppSitePushSettingsSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSitePushSettingsSlot(name, id, options);
    }
}

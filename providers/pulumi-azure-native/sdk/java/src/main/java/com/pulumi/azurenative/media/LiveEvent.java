// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.media.LiveEventArgs;
import com.pulumi.azurenative.media.outputs.CrossSiteAccessPoliciesResponse;
import com.pulumi.azurenative.media.outputs.LiveEventEncodingResponse;
import com.pulumi.azurenative.media.outputs.LiveEventInputResponse;
import com.pulumi.azurenative.media.outputs.LiveEventPreviewResponse;
import com.pulumi.azurenative.media.outputs.LiveEventTranscriptionResponse;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The live event.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * ### Create a LiveEvent
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
 *         var liveEvent = new LiveEvent(&#34;liveEvent&#34;, LiveEventArgs.builder()        
 *             .accountName(&#34;slitestmedia10&#34;)
 *             .description(&#34;test event 1&#34;)
 *             .input(Map.ofEntries(
 *                 Map.entry(&#34;accessControl&#34;, Map.of(&#34;ip&#34;, Map.of(&#34;allow&#34;, Map.ofEntries(
 *                     Map.entry(&#34;address&#34;, &#34;0.0.0.0&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;AllowAll&#34;),
 *                     Map.entry(&#34;subnetPrefixLength&#34;, 0)
 *                 )))),
 *                 Map.entry(&#34;keyFrameIntervalDuration&#34;, &#34;PT6S&#34;),
 *                 Map.entry(&#34;streamingProtocol&#34;, &#34;RTMP&#34;)
 *             ))
 *             .liveEventName(&#34;myLiveEvent1&#34;)
 *             .location(&#34;West US&#34;)
 *             .preview(Map.of(&#34;accessControl&#34;, Map.of(&#34;ip&#34;, Map.of(&#34;allow&#34;, Map.ofEntries(
 *                 Map.entry(&#34;address&#34;, &#34;0.0.0.0&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;AllowAll&#34;),
 *                 Map.entry(&#34;subnetPrefixLength&#34;, 0)
 *             )))))
 *             .resourceGroupName(&#34;mediaresources&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tag1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;tag2&#34;, &#34;value2&#34;)
 *             ))
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
 * $ pulumi import azure-native:media:LiveEvent myLiveEvent1 /subscriptions/0a6ec948-5a62-437d-b9df-934dc7c1b722/resourceGroups/mediaresources/providers/Microsoft.Media/mediaservices/slitestmedia10/liveevents/myLiveEvent1 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:LiveEvent")
public class LiveEvent extends com.pulumi.resources.CustomResource {
    /**
     * The creation time for the live event
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The creation time for the live event
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Live event cross site access policies.
     * 
     */
    @Export(name="crossSiteAccessPolicies", type=CrossSiteAccessPoliciesResponse.class, parameters={})
    private Output</* @Nullable */ CrossSiteAccessPoliciesResponse> crossSiteAccessPolicies;

    /**
     * @return Live event cross site access policies.
     * 
     */
    public Output<Optional<CrossSiteAccessPoliciesResponse>> crossSiteAccessPolicies() {
        return Codegen.optional(this.crossSiteAccessPolicies);
    }
    /**
     * A description for the live event.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the live event.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    @Export(name="encoding", type=LiveEventEncodingResponse.class, parameters={})
    private Output</* @Nullable */ LiveEventEncodingResponse> encoding;

    /**
     * @return Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     */
    public Output<Optional<LiveEventEncodingResponse>> encoding() {
        return Codegen.optional(this.encoding);
    }
    /**
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    @Export(name="hostnamePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostnamePrefix;

    /**
     * @return When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     */
    public Output<Optional<String>> hostnamePrefix() {
        return Codegen.optional(this.hostnamePrefix);
    }
    /**
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    @Export(name="input", type=LiveEventInputResponse.class, parameters={})
    private Output<LiveEventInputResponse> input;

    /**
     * @return Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     */
    public Output<LiveEventInputResponse> input() {
        return this.input;
    }
    /**
     * The last modified time of the live event.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The last modified time of the live event.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    @Export(name="preview", type=LiveEventPreviewResponse.class, parameters={})
    private Output</* @Nullable */ LiveEventPreviewResponse> preview;

    /**
     * @return Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     */
    public Output<Optional<LiveEventPreviewResponse>> preview() {
        return Codegen.optional(this.preview);
    }
    /**
     * The provisioning state of the live event.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the live event.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     */
    public Output<String> resourceState() {
        return this.resourceState;
    }
    /**
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are &#39;Default&#39; and &#39;LowLatency&#39;.
     * 
     */
    @Export(name="streamOptions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> streamOptions;

    /**
     * @return The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are &#39;Default&#39; and &#39;LowLatency&#39;.
     * 
     */
    public Output<Optional<List<String>>> streamOptions() {
        return Codegen.optional(this.streamOptions);
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    @Export(name="transcriptions", type=List.class, parameters={LiveEventTranscriptionResponse.class})
    private Output</* @Nullable */ List<LiveEventTranscriptionResponse>> transcriptions;

    /**
     * @return Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     */
    public Output<Optional<List<LiveEventTranscriptionResponse>>> transcriptions() {
        return Codegen.optional(this.transcriptions);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    @Export(name="useStaticHostname", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useStaticHostname;

    /**
     * @return Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     * 
     */
    public Output<Optional<Boolean>> useStaticHostname() {
        return Codegen.optional(this.useStaticHostname);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiveEvent(String name) {
        this(name, LiveEventArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiveEvent(String name, LiveEventArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiveEvent(String name, LiveEventArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveEvent", name, args == null ? LiveEventArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LiveEvent(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveEvent", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180330preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180601preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180701:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20190501preview:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:LiveEvent").build()),
                Output.of(Alias.builder().type("azure-native:media/v20211101:LiveEvent").build())
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
    public static LiveEvent get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LiveEvent(name, id, options);
    }
}

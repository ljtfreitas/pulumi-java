// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.BaiduChannelArgs;
import com.pulumi.aws.pinpoint.inputs.BaiduChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint Baidu Channel resource.
 * 
 * ## Example Usage
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
 *         var app = new App(&#34;app&#34;);
 * 
 *         var channel = new BaiduChannel(&#34;channel&#34;, BaiduChannelArgs.builder()        
 *             .applicationId(app.getApplicationId())
 *             .apiKey(&#34;&#34;)
 *             .secretKey(&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Pinpoint Baidu Channel can be imported using the `application-id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:pinpoint/baiduChannel:BaiduChannel channel application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/baiduChannel:BaiduChannel")
public class BaiduChannel extends com.pulumi.resources.CustomResource {
    /**
     * Platform credential API key from Baidu.
     * 
     */
    @Export(name="apiKey", type=String.class, parameters={})
    private Output<String> apiKey;

    /**
     * @return Platform credential API key from Baidu.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Platform credential Secret key from Baidu.
     * 
     */
    @Export(name="secretKey", type=String.class, parameters={})
    private Output<String> secretKey;

    /**
     * @return Platform credential Secret key from Baidu.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BaiduChannel(String name) {
        this(name, BaiduChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BaiduChannel(String name, BaiduChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BaiduChannel(String name, BaiduChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/baiduChannel:BaiduChannel", name, args == null ? BaiduChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BaiduChannel(String name, Output<String> id, @Nullable BaiduChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/baiduChannel:BaiduChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BaiduChannel get(String name, Output<String> id, @Nullable BaiduChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BaiduChannel(name, id, state, options);
    }
}

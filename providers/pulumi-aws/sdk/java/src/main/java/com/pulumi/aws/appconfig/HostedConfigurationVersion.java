// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.HostedConfigurationVersionArgs;
import com.pulumi.aws.appconfig.inputs.HostedConfigurationVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppConfig Hosted Configuration Version resource.
 * 
 * ## Example Usage
 * ### Freeform
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new HostedConfigurationVersion(&#34;example&#34;, HostedConfigurationVersionArgs.builder()        
 *             .applicationId(aws_appconfig_application.getExample().getId())
 *             .configurationProfileId(aws_appconfig_configuration_profile.getExample().getConfiguration_profile_id())
 *             .description(&#34;Example Freeform Hosted Configuration Version&#34;)
 *             .contentType(&#34;application/json&#34;)
 *             .content(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;foo&#34;, &#34;bar&#34;),
 *                     jsonProperty(&#34;fruit&#34;, jsonArray(
 *                         &#34;apple&#34;, 
 *                         &#34;pear&#34;, 
 *                         &#34;orange&#34;
 *                     )),
 *                     jsonProperty(&#34;isThingEnabled&#34;, true)
 *                 )))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Feature Flags
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new HostedConfigurationVersion(&#34;example&#34;, HostedConfigurationVersionArgs.builder()        
 *             .applicationId(aws_appconfig_application.getExample().getId())
 *             .configurationProfileId(aws_appconfig_configuration_profile.getExample().getConfiguration_profile_id())
 *             .description(&#34;Example Freeform Hosted Configuration Version&#34;)
 *             .contentType(&#34;application/json&#34;)
 *             .content(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;flags&#34;, jsonObject(
 *                         jsonProperty(&#34;foo&#34;, jsonObject(
 *                             jsonProperty(&#34;name&#34;, &#34;foo&#34;),
 *                             jsonProperty(&#34;_deprecation&#34;, jsonObject(
 *                                 jsonProperty(&#34;status&#34;, &#34;planned&#34;)
 *                             ))
 *                         )),
 *                         jsonProperty(&#34;bar&#34;, jsonObject(
 *                             jsonProperty(&#34;name&#34;, &#34;bar&#34;)
 *                         ))
 *                     )),
 *                     jsonProperty(&#34;values&#34;, jsonObject(
 *                         jsonProperty(&#34;foo&#34;, jsonObject(
 *                             jsonProperty(&#34;enabled&#34;, &#34;true&#34;)
 *                         )),
 *                         jsonProperty(&#34;bar&#34;, jsonObject(
 *                             jsonProperty(&#34;enabled&#34;, &#34;true&#34;)
 *                         ))
 *                     )),
 *                     jsonProperty(&#34;version&#34;, &#34;1&#34;)
 *                 )))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AppConfig Hosted Configuration Versions can be imported by using the application ID, configuration profile ID, and version number separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion example 71abcde/11xxxxx/2
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion")
public class HostedConfigurationVersion extends com.pulumi.resources.CustomResource {
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
     * The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The configuration profile ID.
     * 
     */
    @Export(name="configurationProfileId", type=String.class, parameters={})
    private Output<String> configurationProfileId;

    /**
     * @return The configuration profile ID.
     * 
     */
    public Output<String> configurationProfileId() {
        return this.configurationProfileId;
    }
    /**
     * The content of the configuration or the configuration data.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The content of the configuration or the configuration data.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * A description of the configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The version number of the hosted configuration.
     * 
     */
    @Export(name="versionNumber", type=Integer.class, parameters={})
    private Output<Integer> versionNumber;

    /**
     * @return The version number of the hosted configuration.
     * 
     */
    public Output<Integer> versionNumber() {
        return this.versionNumber;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedConfigurationVersion(String name) {
        this(name, HostedConfigurationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedConfigurationVersion(String name, HostedConfigurationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedConfigurationVersion(String name, HostedConfigurationVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, args == null ? HostedConfigurationVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostedConfigurationVersion(String name, Output<String> id, @Nullable HostedConfigurationVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, state, makeResourceOptions(options, id));
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
    public static HostedConfigurationVersion get(String name, Output<String> id, @Nullable HostedConfigurationVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostedConfigurationVersion(name, id, state, options);
    }
}

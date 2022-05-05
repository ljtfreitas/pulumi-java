// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.ConfigurationSetArgs;
import com.pulumi.aws.ses.inputs.ConfigurationSetState;
import com.pulumi.aws.ses.outputs.ConfigurationSetDeliveryOptions;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SES configuration set resource.
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
 *         var test = new ConfigurationSet(&#34;test&#34;);
 * 
 *         }
 * }
 * ```
 * ### Require TLS Connections
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
 *         var test = new ConfigurationSet(&#34;test&#34;, ConfigurationSetArgs.builder()        
 *             .deliveryOptions(ConfigurationSetDeliveryOptions.builder()
 *                 .tlsPolicy(&#34;Require&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * SES Configuration Sets can be imported using their `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/configurationSet:ConfigurationSet test some-configuration-set-test
 * ```
 * 
 */
@ResourceType(type="aws:ses/configurationSet:ConfigurationSet")
public class ConfigurationSet extends com.pulumi.resources.CustomResource {
    /**
     * SES configuration set ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return SES configuration set ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="deliveryOptions", type=ConfigurationSetDeliveryOptions.class, parameters={})
    private Output</* @Nullable */ ConfigurationSetDeliveryOptions> deliveryOptions;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<Optional<ConfigurationSetDeliveryOptions>> deliveryOptions() {
        return Codegen.optional(this.deliveryOptions);
    }
    /**
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    @Export(name="lastFreshStart", type=String.class, parameters={})
    private Output<String> lastFreshStart;

    /**
     * @return The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    public Output<String> lastFreshStart() {
        return this.lastFreshStart;
    }
    /**
     * Name of the configuration set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the configuration set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @Export(name="reputationMetricsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reputationMetricsEnabled;

    /**
     * @return Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> reputationMetricsEnabled() {
        return Codegen.optional(this.reputationMetricsEnabled);
    }
    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @Export(name="sendingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendingEnabled;

    /**
     * @return Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    public Output<Optional<Boolean>> sendingEnabled() {
        return Codegen.optional(this.sendingEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationSet(String name) {
        this(name, ConfigurationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/configurationSet:ConfigurationSet", name, args == null ? ConfigurationSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationSet(String name, Output<String> id, @Nullable ConfigurationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/configurationSet:ConfigurationSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:ses/confgurationSet:ConfgurationSet").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConfigurationSet get(String name, Output<String> id, @Nullable ConfigurationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationSet(name, id, state, options);
    }
}

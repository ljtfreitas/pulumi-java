// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ConfgurationSetArgs;
import io.pulumi.aws.ses.inputs.ConfgurationSetState;
import io.pulumi.aws.ses.outputs.ConfgurationSetDeliveryOptions;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES configuration set resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES Configuration Sets can be imported using their `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/confgurationSet:ConfgurationSet test some-configuration-set-test
 * ```
 * 
 * @deprecated
 * aws.ses.ConfgurationSet has been deprecated in favor of aws.ses.ConfigurationSet
 * 
 */
@Deprecated /* aws.ses.ConfgurationSet has been deprecated in favor of aws.ses.ConfigurationSet */
@ResourceType(type="aws:ses/confgurationSet:ConfgurationSet")
public class ConfgurationSet extends io.pulumi.resources.CustomResource {
    /**
     * SES configuration set ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return SES configuration set ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @OutputExport(name="deliveryOptions", type=ConfgurationSetDeliveryOptions.class, parameters={})
    private Output</* @Nullable */ ConfgurationSetDeliveryOptions> deliveryOptions;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ ConfgurationSetDeliveryOptions> getDeliveryOptions() {
        return this.deliveryOptions;
    }
    /**
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    @OutputExport(name="lastFreshStart", type=String.class, parameters={})
    private Output<String> lastFreshStart;

    /**
     * @return The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start.
     * 
     */
    public Output<String> getLastFreshStart() {
        return this.lastFreshStart;
    }
    /**
     * Name of the configuration set.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the configuration set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @OutputExport(name="reputationMetricsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reputationMetricsEnabled;

    /**
     * @return Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }
    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @OutputExport(name="sendingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendingEnabled;

    /**
     * @return Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfgurationSet(String name, @Nullable ConfgurationSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/confgurationSet:ConfgurationSet", name, args == null ? ConfgurationSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConfgurationSet(String name, Input<String> id, @Nullable ConfgurationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/confgurationSet:ConfgurationSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ConfgurationSet get(String name, Input<String> id, @Nullable ConfgurationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfgurationSet(name, id, state, options);
    }
}
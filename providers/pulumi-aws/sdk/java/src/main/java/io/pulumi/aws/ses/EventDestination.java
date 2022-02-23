// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.EventDestinationArgs;
import io.pulumi.aws.ses.inputs.EventDestinationState;
import io.pulumi.aws.ses.outputs.EventDestinationCloudwatchDestination;
import io.pulumi.aws.ses.outputs.EventDestinationKinesisDestination;
import io.pulumi.aws.ses.outputs.EventDestinationSnsDestination;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SES event destination
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES event destinations can be imported using `configuration_set_name` together with the event destination's `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/eventDestination:EventDestination sns some-configuration-set-test/event-destination-sns
 * ```
 * 
 */
@ResourceType(type="aws:ses/eventDestination:EventDestination")
public class EventDestination extends io.pulumi.resources.CustomResource {
    /**
     * The SES event destination ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The SES event destination ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * CloudWatch destination for the events
     * 
     */
    @OutputExport(name="cloudwatchDestinations", type=List.class, parameters={EventDestinationCloudwatchDestination.class})
    private Output</* @Nullable */ List<EventDestinationCloudwatchDestination>> cloudwatchDestinations;

    /**
     * @return CloudWatch destination for the events
     * 
     */
    public Output</* @Nullable */ List<EventDestinationCloudwatchDestination>> getCloudwatchDestinations() {
        return this.cloudwatchDestinations;
    }
    /**
     * The name of the configuration set
     * 
     */
    @OutputExport(name="configurationSetName", type=String.class, parameters={})
    private Output<String> configurationSetName;

    /**
     * @return The name of the configuration set
     * 
     */
    public Output<String> getConfigurationSetName() {
        return this.configurationSetName;
    }
    /**
     * If true, the event destination will be enabled
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If true, the event destination will be enabled
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @OutputExport(name="kinesisDestination", type=EventDestinationKinesisDestination.class, parameters={})
    private Output</* @Nullable */ EventDestinationKinesisDestination> kinesisDestination;

    /**
     * @return Send the events to a kinesis firehose destination
     * 
     */
    public Output</* @Nullable */ EventDestinationKinesisDestination> getKinesisDestination() {
        return this.kinesisDestination;
    }
    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     * 
     */
    @OutputExport(name="matchingTypes", type=List.class, parameters={String.class})
    private Output<List<String>> matchingTypes;

    /**
     * @return A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     * 
     */
    public Output<List<String>> getMatchingTypes() {
        return this.matchingTypes;
    }
    /**
     * The name of the event destination
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the event destination
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Send the events to an SNS Topic destination
     * 
     */
    @OutputExport(name="snsDestination", type=EventDestinationSnsDestination.class, parameters={})
    private Output</* @Nullable */ EventDestinationSnsDestination> snsDestination;

    /**
     * @return Send the events to an SNS Topic destination
     * 
     */
    public Output</* @Nullable */ EventDestinationSnsDestination> getSnsDestination() {
        return this.snsDestination;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventDestination(String name, EventDestinationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/eventDestination:EventDestination", name, args == null ? EventDestinationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventDestination(String name, Input<String> id, @Nullable EventDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/eventDestination:EventDestination", name, state, makeResourceOptions(options, id));
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
    public static EventDestination get(String name, Input<String> id, @Nullable EventDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventDestination(name, id, state, options);
    }
}

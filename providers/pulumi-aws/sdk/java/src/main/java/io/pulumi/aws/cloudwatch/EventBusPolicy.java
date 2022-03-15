// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventBusPolicyArgs;
import io.pulumi.aws.cloudwatch.inputs.EventBusPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge resource policy to support cross-account events.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * > **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge permissions can be imported using the `event_bus_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventBusPolicy:EventBusPolicy DevAccountAccess example-event-bus
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventBusPolicy:EventBusPolicy")
public class EventBusPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Export(name="eventBusName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Output</* @Nullable */ String> getEventBusName() {
        return this.eventBusName;
    }
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public interface BuilderApplicator {
        public void apply(EventBusPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.EventBusPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.EventBusPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EventBusPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventBusPolicy(String name) {
        this(name, EventBusPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, args == null ? EventBusPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EventBusPolicy(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static EventBusPolicy get(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventBusPolicy(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appautoscaling.ScheduledActionArgs;
import com.pulumi.aws.appautoscaling.inputs.ScheduledActionState;
import com.pulumi.aws.appautoscaling.outputs.ScheduledActionScalableTargetAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Application AutoScaling ScheduledAction resource.
 * 
 * ## Example Usage
 * ### DynamoDB Table Autoscaling
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
 *         var dynamodbTarget = new Target(&#34;dynamodbTarget&#34;, TargetArgs.builder()        
 *             .maxCapacity(100)
 *             .minCapacity(5)
 *             .resourceId(&#34;table/tableName&#34;)
 *             .scalableDimension(&#34;dynamodb:table:ReadCapacityUnits&#34;)
 *             .serviceNamespace(&#34;dynamodb&#34;)
 *             .build());
 * 
 *         var dynamodbScheduledAction = new ScheduledAction(&#34;dynamodbScheduledAction&#34;, ScheduledActionArgs.builder()        
 *             .serviceNamespace(dynamodbTarget.getServiceNamespace())
 *             .resourceId(dynamodbTarget.getResourceId())
 *             .scalableDimension(dynamodbTarget.getScalableDimension())
 *             .schedule(&#34;at(2006-01-02T15:04:05)&#34;)
 *             .scalableTargetAction(ScheduledActionScalableTargetAction.builder()
 *                 .minCapacity(1)
 *                 .maxCapacity(200)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### ECS Service Autoscaling
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
 *         var ecsTarget = new Target(&#34;ecsTarget&#34;, TargetArgs.builder()        
 *             .maxCapacity(4)
 *             .minCapacity(1)
 *             .resourceId(&#34;service/clusterName/serviceName&#34;)
 *             .scalableDimension(&#34;ecs:service:DesiredCount&#34;)
 *             .serviceNamespace(&#34;ecs&#34;)
 *             .build());
 * 
 *         var ecsScheduledAction = new ScheduledAction(&#34;ecsScheduledAction&#34;, ScheduledActionArgs.builder()        
 *             .serviceNamespace(ecsTarget.getServiceNamespace())
 *             .resourceId(ecsTarget.getResourceId())
 *             .scalableDimension(ecsTarget.getScalableDimension())
 *             .schedule(&#34;at(2006-01-02T15:04:05)&#34;)
 *             .scalableTargetAction(ScheduledActionScalableTargetAction.builder()
 *                 .minCapacity(1)
 *                 .maxCapacity(10)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:appautoscaling/scheduledAction:ScheduledAction")
public class ScheduledAction extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the scheduled action.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the scheduled action.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> endTime;

    /**
     * @return The date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    public Output<Optional<String>> endTime() {
        return Codegen.optional(this.endTime);
    }
    /**
     * The name of the scheduled action.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the scheduled action.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
     * 
     */
    @Export(name="scalableDimension", type=String.class, parameters={})
    private Output<String> scalableDimension;

    /**
     * @return The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
     * 
     */
    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }
    /**
     * The new minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    @Export(name="scalableTargetAction", type=ScheduledActionScalableTargetAction.class, parameters={})
    private Output<ScheduledActionScalableTargetAction> scalableTargetAction;

    /**
     * @return The new minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    public Output<ScheduledActionScalableTargetAction> scalableTargetAction() {
        return this.scalableTargetAction;
    }
    /**
     * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output<String> schedule;

    /**
     * @return The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }
    /**
     * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
     * 
     */
    @Export(name="serviceNamespace", type=String.class, parameters={})
    private Output<String> serviceNamespace;

    /**
     * @return The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
     * 
     */
    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }
    /**
     * The date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    public Output<Optional<String>> startTime() {
        return Codegen.optional(this.startTime);
    }
    /**
     * The time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    @Export(name="timezone", type=String.class, parameters={})
    private Output</* @Nullable */ String> timezone;

    /**
     * @return The time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledAction(String name) {
        this(name, ScheduledActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAction(String name, ScheduledActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAction(String name, ScheduledActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/scheduledAction:ScheduledAction", name, args == null ? ScheduledActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledAction(String name, Output<String> id, @Nullable ScheduledActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/scheduledAction:ScheduledAction", name, state, makeResourceOptions(options, id));
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
    public static ScheduledAction get(String name, Output<String> id, @Nullable ScheduledActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAction(name, id, state, options);
    }
}

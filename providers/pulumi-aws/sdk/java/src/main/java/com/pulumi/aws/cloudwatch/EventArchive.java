// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventArchiveArgs;
import com.pulumi.aws.cloudwatch.inputs.EventArchiveState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge event archive resource.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
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
 *         var orderEventBus = new EventBus(&#34;orderEventBus&#34;);
 * 
 *         var orderEventArchive = new EventArchive(&#34;orderEventArchive&#34;, EventArchiveArgs.builder()        
 *             .eventSourceArn(orderEventBus.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ## Example all optional arguments
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
 *         var orderEventBus = new EventBus(&#34;orderEventBus&#34;);
 * 
 *         var orderEventArchive = new EventArchive(&#34;orderEventArchive&#34;, EventArchiveArgs.builder()        
 *             .description(&#34;Archived events from order service&#34;)
 *             .eventSourceArn(orderEventBus.getArn())
 *             .retentionDays(7)
 *             .eventPattern(&#34;&#34;&#34;
 * {
 *   &#34;source&#34;: [&#34;company.team.order&#34;]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Event Archive can be imported using their name, for example bash
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventArchive:EventArchive imported_event_archive order-archive
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventArchive:EventArchive")
public class EventArchive extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the event archive.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the event archive.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the new event archive.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the new event archive.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Instructs the new event archive to only capture events matched by this pattern. By default, it attempts to archive every event received in the `event_source_arn`.
     * 
     */
    @Export(name="eventPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventPattern;

    /**
     * @return Instructs the new event archive to only capture events matched by this pattern. By default, it attempts to archive every event received in the `event_source_arn`.
     * 
     */
    public Output<Optional<String>> eventPattern() {
        return Codegen.optional(this.eventPattern);
    }
    /**
     * Event bus source ARN from where these events should be archived.
     * 
     */
    @Export(name="eventSourceArn", type=String.class, parameters={})
    private Output<String> eventSourceArn;

    /**
     * @return Event bus source ARN from where these events should be archived.
     * 
     */
    public Output<String> eventSourceArn() {
        return this.eventSourceArn;
    }
    /**
     * The name of the new event archive. The archive name cannot exceed 48 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the new event archive. The archive name cannot exceed 48 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The maximum number of days to retain events in the new event archive. By default, it archives indefinitely.
     * 
     */
    @Export(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return The maximum number of days to retain events in the new event archive. By default, it archives indefinitely.
     * 
     */
    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventArchive(String name) {
        this(name, EventArchiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventArchive(String name, EventArchiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventArchive(String name, EventArchiveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventArchive:EventArchive", name, args == null ? EventArchiveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventArchive(String name, Output<String> id, @Nullable EventArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventArchive:EventArchive", name, state, makeResourceOptions(options, id));
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
    public static EventArchive get(String name, Output<String> id, @Nullable EventArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventArchive(name, id, state, options);
    }
}

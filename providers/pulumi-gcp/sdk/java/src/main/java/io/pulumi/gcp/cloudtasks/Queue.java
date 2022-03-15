// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudtasks.QueueArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueState;
import io.pulumi.gcp.cloudtasks.outputs.QueueAppEngineRoutingOverride;
import io.pulumi.gcp.cloudtasks.outputs.QueueRateLimits;
import io.pulumi.gcp.cloudtasks.outputs.QueueRetryConfig;
import io.pulumi.gcp.cloudtasks.outputs.QueueStackdriverLoggingConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A named resource to which messages are sent by publishers.
 * 
 * > **Warning:** This resource requires an App Engine application to be created on the
 * project you're provisioning it on. If you haven't already enabled it, you
 * can create a `gcp.appengine.Application` resource to do so. This
 * resource's location will be the same as the App Engine location specified.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Queue can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudtasks/queue:Queue default projects/{{project}}/locations/{{location}}/queues/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudtasks/queue:Queue default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudtasks/queue:Queue default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudtasks/queue:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    @Export(name="appEngineRoutingOverride", type=QueueAppEngineRoutingOverride.class, parameters={})
    private Output</* @Nullable */ QueueAppEngineRoutingOverride> appEngineRoutingOverride;

    /**
     * @return Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ QueueAppEngineRoutingOverride> getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride;
    }
    /**
     * The location of the queue
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the queue
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The queue name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The queue name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Rate limits for task dispatches.
     * The queue's actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue's state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    @Export(name="rateLimits", type=QueueRateLimits.class, parameters={})
    private Output<QueueRateLimits> rateLimits;

    /**
     * @return Rate limits for task dispatches.
     * The queue's actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue's state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    public Output<QueueRateLimits> getRateLimits() {
        return this.rateLimits;
    }
    /**
     * Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    @Export(name="retryConfig", type=QueueRetryConfig.class, parameters={})
    private Output<QueueRetryConfig> retryConfig;

    /**
     * @return Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    public Output<QueueRetryConfig> getRetryConfig() {
        return this.retryConfig;
    }
    /**
     * Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    @Export(name="stackdriverLoggingConfig", type=QueueStackdriverLoggingConfig.class, parameters={})
    private Output</* @Nullable */ QueueStackdriverLoggingConfig> stackdriverLoggingConfig;

    /**
     * @return Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ QueueStackdriverLoggingConfig> getStackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig;
    }

    public interface BuilderApplicator {
        public void apply(QueueArgs.Builder a);
    }
    private static io.pulumi.gcp.cloudtasks.QueueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.cloudtasks.QueueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Queue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudtasks/queue:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudtasks/queue:Queue", name, state, makeResourceOptions(options, id));
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
    public static Queue get(String name, Output<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, state, options);
    }
}

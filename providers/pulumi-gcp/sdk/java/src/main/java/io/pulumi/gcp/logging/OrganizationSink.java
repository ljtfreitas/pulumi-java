// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.OrganizationSinkArgs;
import io.pulumi.gcp.logging.inputs.OrganizationSinkState;
import io.pulumi.gcp.logging.outputs.OrganizationSinkBigqueryOptions;
import io.pulumi.gcp.logging.outputs.OrganizationSinkExclusion;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a organization-level logging sink. For more information see:
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.sinks)
 * * How-to Guides
 *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Organization-level logging sinks can be imported using this format
 * 
 * ```sh
 *  $ pulumi import gcp:logging/organizationSink:OrganizationSink my_sink organizations/{{organization_id}}/sinks/{{sink_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/organizationSink:OrganizationSink")
public class OrganizationSink extends io.pulumi.resources.CustomResource {
    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @Export(name="bigqueryOptions", type=OrganizationSinkBigqueryOptions.class, parameters={})
    private Output<OrganizationSinkBigqueryOptions> bigqueryOptions;

    /**
     * @return Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    public Output<OrganizationSinkBigqueryOptions> bigqueryOptions() {
        return this.bigqueryOptions;
    }
    /**
     * A description of this exclusion.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this exclusion.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @Export(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }
    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Output</* @Nullable */ Boolean> disabled() {
        return this.disabled;
    }
    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @Export(name="exclusions", type=List.class, parameters={OrganizationSinkExclusion.class})
    private Output</* @Nullable */ List<OrganizationSinkExclusion>> exclusions;

    /**
     * @return Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<OrganizationSinkExclusion>> exclusions() {
        return this.exclusions;
    }
    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output</* @Nullable */ String> filter;

    /**
     * @return An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public Output</* @Nullable */ String> filter() {
        return this.filter;
    }
    /**
     * Whether or not to include children organizations in the sink export. If true, logs
     * associated with child projects are also exported; otherwise only logs relating to the provided organization are included.
     * 
     */
    @Export(name="includeChildren", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> includeChildren;

    /**
     * @return Whether or not to include children organizations in the sink export. If true, logs
     * associated with child projects are also exported; otherwise only logs relating to the provided organization are included.
     * 
     */
    public Output</* @Nullable */ Boolean> includeChildren() {
        return this.includeChildren;
    }
    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The numeric ID of the organization to be exported to the sink.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization to be exported to the sink.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    @Export(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     * 
     */
    public Output<String> writerIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationSink(String name) {
        this(name, OrganizationSinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationSink(String name, OrganizationSinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationSink(String name, OrganizationSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/organizationSink:OrganizationSink", name, args == null ? OrganizationSinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationSink(String name, Output<String> id, @Nullable OrganizationSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/organizationSink:OrganizationSink", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static OrganizationSink get(String name, Output<String> id, @Nullable OrganizationSinkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationSink(name, id, state, options);
    }
}

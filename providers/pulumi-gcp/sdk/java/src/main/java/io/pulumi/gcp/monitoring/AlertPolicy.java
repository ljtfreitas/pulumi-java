// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.AlertPolicyArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyState;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyAlertStrategy;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyCondition;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyCreationRecord;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyDocumentation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A description of the conditions under which some aspect of your system is
 * considered to be "unhealthy" and the ways to notify people or services
 * about this state.
 * 
 * To get more information about AlertPolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.alertPolicies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/alerts/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AlertPolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/alertPolicy:AlertPolicy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/alertPolicy:AlertPolicy")
public class AlertPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Control over how this alert policy's notification channels are notified.
     * Structure is documented below.
     * 
     */
    @Export(name="alertStrategy", type=AlertPolicyAlertStrategy.class, parameters={})
    private Output</* @Nullable */ AlertPolicyAlertStrategy> alertStrategy;

    /**
     * @return Control over how this alert policy's notification channels are notified.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AlertPolicyAlertStrategy> getAlertStrategy() {
        return this.alertStrategy;
    }
    /**
     * How to combine the results of multiple conditions to
     * determine if an incident should be opened.
     * Possible values are `AND`, `OR`, and `AND_WITH_MATCHING_RESOURCE`.
     * 
     */
    @Export(name="combiner", type=String.class, parameters={})
    private Output<String> combiner;

    /**
     * @return How to combine the results of multiple conditions to
     * determine if an incident should be opened.
     * Possible values are `AND`, `OR`, and `AND_WITH_MATCHING_RESOURCE`.
     * 
     */
    public Output<String> getCombiner() {
        return this.combiner;
    }
    /**
     * A list of conditions for the policy. The conditions are combined by
     * AND or OR according to the combiner field. If the combined conditions
     * evaluate to true, then an incident is created. A policy can have from
     * one to six conditions.
     * Structure is documented below.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={AlertPolicyCondition.class})
    private Output<List<AlertPolicyCondition>> conditions;

    /**
     * @return A list of conditions for the policy. The conditions are combined by
     * AND or OR according to the combiner field. If the combined conditions
     * evaluate to true, then an incident is created. A policy can have from
     * one to six conditions.
     * Structure is documented below.
     * 
     */
    public Output<List<AlertPolicyCondition>> getConditions() {
        return this.conditions;
    }
    /**
     * A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be
     * ignored.
     * 
     */
    @Export(name="creationRecords", type=List.class, parameters={AlertPolicyCreationRecord.class})
    private Output<List<AlertPolicyCreationRecord>> creationRecords;

    /**
     * @return A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be
     * ignored.
     * 
     */
    public Output<List<AlertPolicyCreationRecord>> getCreationRecords() {
        return this.creationRecords;
    }
    /**
     * A short name or phrase used to identify the
     * condition in dashboards, notifications, and
     * incidents. To avoid confusion, don't use the same
     * display name for multiple conditions in the same
     * policy.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A short name or phrase used to identify the
     * condition in dashboards, notifications, and
     * incidents. To avoid confusion, don't use the same
     * display name for multiple conditions in the same
     * policy.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Documentation that is included with notifications and incidents related
     * to this policy. Best practice is for the documentation to include information
     * to help responders understand, mitigate, escalate, and correct the underlying
     * problems detected by the alerting policy. Notification channels that have
     * limited capacity might not show this documentation.
     * Structure is documented below.
     * 
     */
    @Export(name="documentation", type=AlertPolicyDocumentation.class, parameters={})
    private Output</* @Nullable */ AlertPolicyDocumentation> documentation;

    /**
     * @return Documentation that is included with notifications and incidents related
     * to this policy. Best practice is for the documentation to include information
     * to help responders understand, mitigate, escalate, and correct the underlying
     * problems detected by the alerting policy. Notification channels that have
     * limited capacity might not show this documentation.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AlertPolicyDocumentation> getDocumentation() {
        return this.documentation;
    }
    /**
     * Whether or not the policy is enabled. The default is true.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether or not the policy is enabled. The default is true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * - 
     * The unique resource name for this condition.
     * Its syntax is:
     * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
     * [CONDITION_ID] is assigned by Stackdriver Monitoring when
     * the condition is created as part of a new or updated alerting
     * policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return -
     * The unique resource name for this condition.
     * Its syntax is:
     * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
     * [CONDITION_ID] is assigned by Stackdriver Monitoring when
     * the condition is created as part of a new or updated alerting
     * policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Identifies the notification channels to which notifications should be
     * sent when incidents are opened or closed or when new violations occur
     * on an already opened incident. Each element of this array corresponds
     * to the name field in each of the NotificationChannel objects that are
     * returned from the notificationChannels.list method. The syntax of the
     * entries in this field is
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`
     * 
     */
    @Export(name="notificationChannels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notificationChannels;

    /**
     * @return Identifies the notification channels to which notifications should be
     * sent when incidents are opened or closed or when new violations occur
     * on an already opened incident. Each element of this array corresponds
     * to the name field in each of the NotificationChannel objects that are
     * returned from the notificationChannels.list method. The syntax of the
     * entries in this field is
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`
     * 
     */
    public Output</* @Nullable */ List<String>> getNotificationChannels() {
        return this.notificationChannels;
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
     * This field is intended to be used for organizing and identifying the AlertPolicy
     * objects.The field can contain up to 64 entries. Each key and value is limited
     * to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values
     * can contain only lowercase letters, numerals, underscores, and dashes. Keys
     * must begin with a letter.
     * 
     */
    @Export(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> userLabels;

    /**
     * @return This field is intended to be used for organizing and identifying the AlertPolicy
     * objects.The field can contain up to 64 entries. Each key and value is limited
     * to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values
     * can contain only lowercase letters, numerals, underscores, and dashes. Keys
     * must begin with a letter.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getUserLabels() {
        return this.userLabels;
    }

    public interface BuilderApplicator {
        public void apply(AlertPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.monitoring.AlertPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.monitoring.AlertPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AlertPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertPolicy(String name) {
        this(name, AlertPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertPolicy(String name, AlertPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertPolicy(String name, AlertPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/alertPolicy:AlertPolicy", name, args == null ? AlertPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AlertPolicy(String name, Output<String> id, @Nullable AlertPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/alertPolicy:AlertPolicy", name, state, makeResourceOptions(options, id));
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
    public static AlertPolicy get(String name, Output<String> id, @Nullable AlertPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AlertPolicy(name, id, state, options);
    }
}

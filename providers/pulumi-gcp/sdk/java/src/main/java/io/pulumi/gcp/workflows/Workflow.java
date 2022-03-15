// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.workflows;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.workflows.WorkflowArgs;
import io.pulumi.gcp.workflows.inputs.WorkflowState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Workflow program to be executed by Workflows.
 * 
 * To get more information about Workflow, see:
 * 
 * * [API documentation](https://cloud.google.com/workflows/docs/reference/rest/v1/projects.locations.workflows)
 * * How-to Guides
 *     * [Managing Workflows](https://cloud.google.com/workflows/docs/creating-updating-workflow)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:workflows/workflow:Workflow")
public class Workflow extends io.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the workflow was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the workflow was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Workflow.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the Workflow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Workflow.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
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
     * The region of the workflow.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the workflow.
     * 
     */
    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    /**
     * The revision of the workflow. A new one is generated if the service account or source contents is changed.
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return The revision of the workflow. A new one is generated if the service account or source contents is changed.
     * 
     */
    public Output<String> getRevisionId() {
        return this.revisionId;
    }
    /**
     * Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Workflow code to be executed. The size limit is 32KB.
     * 
     */
    @Export(name="sourceContents", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceContents;

    /**
     * @return Workflow code to be executed. The size limit is 32KB.
     * 
     */
    public Output</* @Nullable */ String> getSourceContents() {
        return this.sourceContents;
    }
    /**
     * State of the workflow deployment.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the workflow deployment.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The timestamp of when the workflow was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the workflow was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable WorkflowArgs.Builder a);
    }
    private static io.pulumi.gcp.workflows.WorkflowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.workflows.WorkflowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workflow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, @Nullable WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, @Nullable WorkflowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workflows/workflow:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable WorkflowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workflows/workflow:Workflow", name, state, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable WorkflowState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, state, options);
    }
}

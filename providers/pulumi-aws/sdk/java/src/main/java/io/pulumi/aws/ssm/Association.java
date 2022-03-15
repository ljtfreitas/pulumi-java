// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.AssociationArgs;
import io.pulumi.aws.ssm.inputs.AssociationState;
import io.pulumi.aws.ssm.outputs.AssociationOutputLocation;
import io.pulumi.aws.ssm.outputs.AssociationTarget;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Associates an SSM Document to an instance or EC2 tag.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SSM associations can be imported using the `association_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/association:Association test-association 10abcdef-0abc-1234-5678-90abcdef123456
 * ```
 * 
 */
@ResourceType(type="aws:ssm/association:Association")
public class Association extends io.pulumi.resources.CustomResource {
    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     * 
     */
    @Export(name="applyOnlyAtCronInterval", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> applyOnlyAtCronInterval;

    /**
     * @return By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getApplyOnlyAtCronInterval() {
        return this.applyOnlyAtCronInterval;
    }
    /**
     * The ID of the SSM association.
     * 
     */
    @Export(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    /**
     * @return The ID of the SSM association.
     * 
     */
    public Output<String> getAssociationId() {
        return this.associationId;
    }
    /**
     * The descriptive name for the association.
     * 
     */
    @Export(name="associationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> associationName;

    /**
     * @return The descriptive name for the association.
     * 
     */
    public Output</* @Nullable */ String> getAssociationName() {
        return this.associationName;
    }
    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     * 
     */
    @Export(name="automationTargetParameterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> automationTargetParameterName;

    /**
     * @return Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     * 
     */
    public Output</* @Nullable */ String> getAutomationTargetParameterName() {
        return this.automationTargetParameterName;
    }
    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     * 
     */
    @Export(name="complianceSeverity", type=String.class, parameters={})
    private Output</* @Nullable */ String> complianceSeverity;

    /**
     * @return The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     * 
     */
    public Output</* @Nullable */ String> getComplianceSeverity() {
        return this.complianceSeverity;
    }
    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * 
     */
    @Export(name="documentVersion", type=String.class, parameters={})
    private Output<String> documentVersion;

    /**
     * @return The document version you want to associate with the target(s). Can be a specific version or the default version.
     * 
     */
    public Output<String> getDocumentVersion() {
        return this.documentVersion;
    }
    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceId;

    /**
     * @return The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     * 
     */
    public Output</* @Nullable */ String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @Export(name="maxConcurrency", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxConcurrency;

    /**
     * @return The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    public Output</* @Nullable */ String> getMaxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @Export(name="maxErrors", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxErrors;

    /**
     * @return The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    public Output</* @Nullable */ String> getMaxErrors() {
        return this.maxErrors;
    }
    /**
     * The name of the SSM document to apply.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SSM document to apply.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An output location block. Output Location is documented below.
     * 
     */
    @Export(name="outputLocation", type=AssociationOutputLocation.class, parameters={})
    private Output</* @Nullable */ AssociationOutputLocation> outputLocation;

    /**
     * @return An output location block. Output Location is documented below.
     * 
     */
    public Output</* @Nullable */ AssociationOutputLocation> getOutputLocation() {
        return this.outputLocation;
    }
    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> parameters;

    /**
     * @return A block of arbitrary string parameters to pass to the SSM document.
     * 
     */
    public Output<Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * A cron expression when the association will be applied to the target(s).
     * 
     */
    @Export(name="scheduleExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduleExpression;

    /**
     * @return A cron expression when the association will be applied to the target(s).
     * 
     */
    public Output</* @Nullable */ String> getScheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * 
     */
    @Export(name="targets", type=List.class, parameters={AssociationTarget.class})
    private Output<List<AssociationTarget>> targets;

    /**
     * @return A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * 
     */
    public Output<List<AssociationTarget>> getTargets() {
        return this.targets;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AssociationArgs.Builder a);
    }
    private static io.pulumi.aws.ssm.AssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ssm.AssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Association(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Association(String name) {
        this(name, AssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Association(String name, @Nullable AssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Association(String name, @Nullable AssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/association:Association", name, args == null ? AssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Association(String name, Output<String> id, @Nullable AssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/association:Association", name, state, makeResourceOptions(options, id));
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
    public static Association get(String name, Output<String> id, @Nullable AssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Association(name, id, state, options);
    }
}

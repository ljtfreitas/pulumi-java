// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssm.AssociationArgs;
import io.pulumi.awsnative.ssm.enums.AssociationComplianceSeverity;
import io.pulumi.awsnative.ssm.enums.AssociationSyncCompliance;
import io.pulumi.awsnative.ssm.outputs.AssociationInstanceAssociationOutputLocation;
import io.pulumi.awsnative.ssm.outputs.AssociationTarget;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ssm:Association")
public class Association extends io.pulumi.resources.CustomResource {
    @Export(name="applyOnlyAtCronInterval", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> applyOnlyAtCronInterval;

    public Output</* @Nullable */ Boolean> getApplyOnlyAtCronInterval() {
        return this.applyOnlyAtCronInterval;
    }
    /**
     * Unique identifier of the association.
     * 
     */
    @Export(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    /**
     * @return Unique identifier of the association.
     * 
     */
    public Output<String> getAssociationId() {
        return this.associationId;
    }
    /**
     * The name of the association.
     * 
     */
    @Export(name="associationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> associationName;

    /**
     * @return The name of the association.
     * 
     */
    public Output</* @Nullable */ String> getAssociationName() {
        return this.associationName;
    }
    @Export(name="automationTargetParameterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> automationTargetParameterName;

    public Output</* @Nullable */ String> getAutomationTargetParameterName() {
        return this.automationTargetParameterName;
    }
    @Export(name="calendarNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> calendarNames;

    public Output</* @Nullable */ List<String>> getCalendarNames() {
        return this.calendarNames;
    }
    @Export(name="complianceSeverity", type=AssociationComplianceSeverity.class, parameters={})
    private Output</* @Nullable */ AssociationComplianceSeverity> complianceSeverity;

    public Output</* @Nullable */ AssociationComplianceSeverity> getComplianceSeverity() {
        return this.complianceSeverity;
    }
    /**
     * The version of the SSM document to associate with the target.
     * 
     */
    @Export(name="documentVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentVersion;

    /**
     * @return The version of the SSM document to associate with the target.
     * 
     */
    public Output</* @Nullable */ String> getDocumentVersion() {
        return this.documentVersion;
    }
    /**
     * The ID of the instance that the SSM document is associated with.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceId;

    /**
     * @return The ID of the instance that the SSM document is associated with.
     * 
     */
    public Output</* @Nullable */ String> getInstanceId() {
        return this.instanceId;
    }
    @Export(name="maxConcurrency", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxConcurrency;

    public Output</* @Nullable */ String> getMaxConcurrency() {
        return this.maxConcurrency;
    }
    @Export(name="maxErrors", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxErrors;

    public Output</* @Nullable */ String> getMaxErrors() {
        return this.maxErrors;
    }
    /**
     * The name of the SSM document.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SSM document.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="outputLocation", type=AssociationInstanceAssociationOutputLocation.class, parameters={})
    private Output</* @Nullable */ AssociationInstanceAssociationOutputLocation> outputLocation;

    public Output</* @Nullable */ AssociationInstanceAssociationOutputLocation> getOutputLocation() {
        return this.outputLocation;
    }
    /**
     * Parameter values that the SSM document uses at runtime.
     * 
     */
    @Export(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return Parameter values that the SSM document uses at runtime.
     * 
     */
    public Output</* @Nullable */ Object> getParameters() {
        return this.parameters;
    }
    /**
     * A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    @Export(name="scheduleExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduleExpression;

    /**
     * @return A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    public Output</* @Nullable */ String> getScheduleExpression() {
        return this.scheduleExpression;
    }
    @Export(name="syncCompliance", type=AssociationSyncCompliance.class, parameters={})
    private Output</* @Nullable */ AssociationSyncCompliance> syncCompliance;

    public Output</* @Nullable */ AssociationSyncCompliance> getSyncCompliance() {
        return this.syncCompliance;
    }
    /**
     * The targets that the SSM document sends commands to.
     * 
     */
    @Export(name="targets", type=List.class, parameters={AssociationTarget.class})
    private Output</* @Nullable */ List<AssociationTarget>> targets;

    /**
     * @return The targets that the SSM document sends commands to.
     * 
     */
    public Output</* @Nullable */ List<AssociationTarget>> getTargets() {
        return this.targets;
    }
    @Export(name="waitForSuccessTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> waitForSuccessTimeoutSeconds;

    public Output</* @Nullable */ Integer> getWaitForSuccessTimeoutSeconds() {
        return this.waitForSuccessTimeoutSeconds;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.ssm.AssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ssm.AssociationArgs.builder();
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
        super("aws-native:ssm:Association", name, args == null ? AssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Association(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:Association", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Association get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Association(name, id, options);
    }
}

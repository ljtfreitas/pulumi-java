// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.stepfunctions.StateMachineArgs;
import io.pulumi.awsnative.stepfunctions.enums.StateMachineType;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineDefinition;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineDefinitionSubstitutions;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineLoggingConfiguration;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineS3Location;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineTagsEntry;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineTracingConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for StateMachine
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:stepfunctions:StateMachine")
public class StateMachine extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="definition", type=StateMachineDefinition.class, parameters={})
    private Output</* @Nullable */ StateMachineDefinition> definition;

    public Output</* @Nullable */ StateMachineDefinition> getDefinition() {
        return this.definition;
    }
    @Export(name="definitionS3Location", type=StateMachineS3Location.class, parameters={})
    private Output</* @Nullable */ StateMachineS3Location> definitionS3Location;

    public Output</* @Nullable */ StateMachineS3Location> getDefinitionS3Location() {
        return this.definitionS3Location;
    }
    @Export(name="definitionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> definitionString;

    public Output</* @Nullable */ String> getDefinitionString() {
        return this.definitionString;
    }
    @Export(name="definitionSubstitutions", type=StateMachineDefinitionSubstitutions.class, parameters={})
    private Output</* @Nullable */ StateMachineDefinitionSubstitutions> definitionSubstitutions;

    public Output</* @Nullable */ StateMachineDefinitionSubstitutions> getDefinitionSubstitutions() {
        return this.definitionSubstitutions;
    }
    @Export(name="loggingConfiguration", type=StateMachineLoggingConfiguration.class, parameters={})
    private Output</* @Nullable */ StateMachineLoggingConfiguration> loggingConfiguration;

    public Output</* @Nullable */ StateMachineLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @Export(name="stateMachineName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stateMachineName;

    public Output</* @Nullable */ String> getStateMachineName() {
        return this.stateMachineName;
    }
    @Export(name="stateMachineType", type=StateMachineType.class, parameters={})
    private Output</* @Nullable */ StateMachineType> stateMachineType;

    public Output</* @Nullable */ StateMachineType> getStateMachineType() {
        return this.stateMachineType;
    }
    @Export(name="tags", type=List.class, parameters={StateMachineTagsEntry.class})
    private Output</* @Nullable */ List<StateMachineTagsEntry>> tags;

    public Output</* @Nullable */ List<StateMachineTagsEntry>> getTags() {
        return this.tags;
    }
    @Export(name="tracingConfiguration", type=StateMachineTracingConfiguration.class, parameters={})
    private Output</* @Nullable */ StateMachineTracingConfiguration> tracingConfiguration;

    public Output</* @Nullable */ StateMachineTracingConfiguration> getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(StateMachineArgs.Builder a);
    }
    private static io.pulumi.awsnative.stepfunctions.StateMachineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.stepfunctions.StateMachineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StateMachine(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StateMachine(String name) {
        this(name, StateMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StateMachine(String name, StateMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StateMachine(String name, StateMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:stepfunctions:StateMachine", name, args == null ? StateMachineArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StateMachine(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:stepfunctions:StateMachine", name, null, makeResourceOptions(options, id));
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
    public static StateMachine get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StateMachine(name, id, options);
    }
}

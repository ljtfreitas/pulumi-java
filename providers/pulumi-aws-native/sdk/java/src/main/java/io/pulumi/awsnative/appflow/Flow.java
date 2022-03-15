// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appflow.FlowArgs;
import io.pulumi.awsnative.appflow.outputs.FlowDestinationFlowConfig;
import io.pulumi.awsnative.appflow.outputs.FlowSourceFlowConfig;
import io.pulumi.awsnative.appflow.outputs.FlowTag;
import io.pulumi.awsnative.appflow.outputs.FlowTask;
import io.pulumi.awsnative.appflow.outputs.FlowTriggerConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::AppFlow::Flow.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:appflow:Flow")
public class Flow extends io.pulumi.resources.CustomResource {
    /**
     * Description of the flow.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the flow.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * List of Destination connectors of the flow.
     * 
     */
    @Export(name="destinationFlowConfigList", type=List.class, parameters={FlowDestinationFlowConfig.class})
    private Output<List<FlowDestinationFlowConfig>> destinationFlowConfigList;

    /**
     * @return List of Destination connectors of the flow.
     * 
     */
    public Output<List<FlowDestinationFlowConfig>> getDestinationFlowConfigList() {
        return this.destinationFlowConfigList;
    }
    /**
     * ARN identifier of the flow.
     * 
     */
    @Export(name="flowArn", type=String.class, parameters={})
    private Output<String> flowArn;

    /**
     * @return ARN identifier of the flow.
     * 
     */
    public Output<String> getFlowArn() {
        return this.flowArn;
    }
    /**
     * Name of the flow.
     * 
     */
    @Export(name="flowName", type=String.class, parameters={})
    private Output<String> flowName;

    /**
     * @return Name of the flow.
     * 
     */
    public Output<String> getFlowName() {
        return this.flowName;
    }
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @Export(name="kMSArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kMSArn;

    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    public Output</* @Nullable */ String> getKMSArn() {
        return this.kMSArn;
    }
    /**
     * Configurations of Source connector of the flow.
     * 
     */
    @Export(name="sourceFlowConfig", type=FlowSourceFlowConfig.class, parameters={})
    private Output<FlowSourceFlowConfig> sourceFlowConfig;

    /**
     * @return Configurations of Source connector of the flow.
     * 
     */
    public Output<FlowSourceFlowConfig> getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }
    /**
     * List of Tags.
     * 
     */
    @Export(name="tags", type=List.class, parameters={FlowTag.class})
    private Output</* @Nullable */ List<FlowTag>> tags;

    /**
     * @return List of Tags.
     * 
     */
    public Output</* @Nullable */ List<FlowTag>> getTags() {
        return this.tags;
    }
    /**
     * List of tasks for the flow.
     * 
     */
    @Export(name="tasks", type=List.class, parameters={FlowTask.class})
    private Output<List<FlowTask>> tasks;

    /**
     * @return List of tasks for the flow.
     * 
     */
    public Output<List<FlowTask>> getTasks() {
        return this.tasks;
    }
    /**
     * Trigger settings of the flow.
     * 
     */
    @Export(name="triggerConfig", type=FlowTriggerConfig.class, parameters={})
    private Output<FlowTriggerConfig> triggerConfig;

    /**
     * @return Trigger settings of the flow.
     * 
     */
    public Output<FlowTriggerConfig> getTriggerConfig() {
        return this.triggerConfig;
    }

    public interface BuilderApplicator {
        public void apply(FlowArgs.Builder a);
    }
    private static io.pulumi.awsnative.appflow.FlowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.appflow.FlowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Flow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flow(String name) {
        this(name, FlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flow(String name, FlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flow(String name, FlowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:Flow", name, args == null ? FlowArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Flow(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:Flow", name, null, makeResourceOptions(options, id));
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
    public static Flow get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Flow(name, id, options);
    }
}

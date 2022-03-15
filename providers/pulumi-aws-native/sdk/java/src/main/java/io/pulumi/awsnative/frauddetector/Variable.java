// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.frauddetector.VariableArgs;
import io.pulumi.awsnative.frauddetector.enums.VariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.VariableDataType;
import io.pulumi.awsnative.frauddetector.enums.VariableType;
import io.pulumi.awsnative.frauddetector.outputs.VariableTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A resource schema for a Variable in Amazon Fraud Detector.
 * 
 */
@ResourceType(type="aws-native:frauddetector:Variable")
public class Variable extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the variable.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the variable.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The time when the variable was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The time when the variable was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The source of the data.
     * 
     */
    @Export(name="dataSource", type=VariableDataSource.class, parameters={})
    private Output<VariableDataSource> dataSource;

    /**
     * @return The source of the data.
     * 
     */
    public Output<VariableDataSource> getDataSource() {
        return this.dataSource;
    }
    /**
     * The data type.
     * 
     */
    @Export(name="dataType", type=VariableDataType.class, parameters={})
    private Output<VariableDataType> dataType;

    /**
     * @return The data type.
     * 
     */
    public Output<VariableDataType> getDataType() {
        return this.dataType;
    }
    /**
     * The default value for the variable when no value is received.
     * 
     */
    @Export(name="defaultValue", type=String.class, parameters={})
    private Output<String> defaultValue;

    /**
     * @return The default value for the variable when no value is received.
     * 
     */
    public Output<String> getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The time when the variable was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return The time when the variable was last updated.
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The name of the variable.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the variable.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Tags associated with this variable.
     * 
     */
    @Export(name="tags", type=List.class, parameters={VariableTag.class})
    private Output</* @Nullable */ List<VariableTag>> tags;

    /**
     * @return Tags associated with this variable.
     * 
     */
    public Output</* @Nullable */ List<VariableTag>> getTags() {
        return this.tags;
    }
    /**
     * The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    @Export(name="variableType", type=VariableType.class, parameters={})
    private Output</* @Nullable */ VariableType> variableType;

    /**
     * @return The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    public Output</* @Nullable */ VariableType> getVariableType() {
        return this.variableType;
    }

    public interface BuilderApplicator {
        public void apply(VariableArgs.Builder a);
    }
    private static io.pulumi.awsnative.frauddetector.VariableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.frauddetector.VariableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Variable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Variable(String name) {
        this(name, VariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Variable(String name, VariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Variable(String name, VariableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Variable(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Variable", name, null, makeResourceOptions(options, id));
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
    public static Variable get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Variable(name, id, options);
    }
}

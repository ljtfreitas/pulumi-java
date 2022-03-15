// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.forecast.DatasetGroupArgs;
import io.pulumi.awsnative.forecast.enums.DatasetGroupDomain;
import io.pulumi.awsnative.forecast.outputs.DatasetGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a dataset group that holds a collection of related datasets
 * 
 */
@ResourceType(type="aws-native:forecast:DatasetGroup")
public class DatasetGroup extends io.pulumi.resources.CustomResource {
    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * 
     */
    @Export(name="datasetArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> datasetArns;

    /**
     * @return An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * 
     */
    public Output</* @Nullable */ List<String>> getDatasetArns() {
        return this.datasetArns;
    }
    /**
     * The Amazon Resource Name (ARN) of the dataset group to delete.
     * 
     */
    @Export(name="datasetGroupArn", type=String.class, parameters={})
    private Output<String> datasetGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the dataset group to delete.
     * 
     */
    public Output<String> getDatasetGroupArn() {
        return this.datasetGroupArn;
    }
    /**
     * A name for the dataset group.
     * 
     */
    @Export(name="datasetGroupName", type=String.class, parameters={})
    private Output<String> datasetGroupName;

    /**
     * @return A name for the dataset group.
     * 
     */
    public Output<String> getDatasetGroupName() {
        return this.datasetGroupName;
    }
    /**
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match.
     * 
     */
    @Export(name="domain", type=DatasetGroupDomain.class, parameters={})
    private Output<DatasetGroupDomain> domain;

    /**
     * @return The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match.
     * 
     */
    public Output<DatasetGroupDomain> getDomain() {
        return this.domain;
    }
    /**
     * The tags of Application Insights application.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DatasetGroupTag.class})
    private Output</* @Nullable */ List<DatasetGroupTag>> tags;

    /**
     * @return The tags of Application Insights application.
     * 
     */
    public Output</* @Nullable */ List<DatasetGroupTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(DatasetGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.forecast.DatasetGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.forecast.DatasetGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DatasetGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetGroup(String name) {
        this(name, DatasetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetGroup(String name, DatasetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetGroup(String name, DatasetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:forecast:DatasetGroup", name, args == null ? DatasetGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DatasetGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:forecast:DatasetGroup", name, null, makeResourceOptions(options, id));
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
    public static DatasetGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatasetGroup(name, id, options);
    }
}

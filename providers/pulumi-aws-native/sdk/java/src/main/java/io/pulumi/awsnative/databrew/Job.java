// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.JobArgs;
import io.pulumi.awsnative.databrew.enums.JobEncryptionMode;
import io.pulumi.awsnative.databrew.enums.JobLogSubscription;
import io.pulumi.awsnative.databrew.enums.JobType;
import io.pulumi.awsnative.databrew.outputs.JobDataCatalogOutput;
import io.pulumi.awsnative.databrew.outputs.JobDatabaseOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutputLocation;
import io.pulumi.awsnative.databrew.outputs.JobProfileConfiguration;
import io.pulumi.awsnative.databrew.outputs.JobRecipe;
import io.pulumi.awsnative.databrew.outputs.JobSample;
import io.pulumi.awsnative.databrew.outputs.JobTag;
import io.pulumi.awsnative.databrew.outputs.JobValidationConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataBrew::Job.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:databrew:Job")
public class Job extends io.pulumi.resources.CustomResource {
    @Export(name="dataCatalogOutputs", type=List.class, parameters={JobDataCatalogOutput.class})
    private Output</* @Nullable */ List<JobDataCatalogOutput>> dataCatalogOutputs;

    public Output</* @Nullable */ List<JobDataCatalogOutput>> getDataCatalogOutputs() {
        return this.dataCatalogOutputs;
    }
    @Export(name="databaseOutputs", type=List.class, parameters={JobDatabaseOutput.class})
    private Output</* @Nullable */ List<JobDatabaseOutput>> databaseOutputs;

    public Output</* @Nullable */ List<JobDatabaseOutput>> getDatabaseOutputs() {
        return this.databaseOutputs;
    }
    /**
     * Dataset name
     * 
     */
    @Export(name="datasetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> datasetName;

    /**
     * @return Dataset name
     * 
     */
    public Output</* @Nullable */ String> getDatasetName() {
        return this.datasetName;
    }
    /**
     * Encryption Key Arn
     * 
     */
    @Export(name="encryptionKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeyArn;

    /**
     * @return Encryption Key Arn
     * 
     */
    public Output</* @Nullable */ String> getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }
    /**
     * Encryption mode
     * 
     */
    @Export(name="encryptionMode", type=JobEncryptionMode.class, parameters={})
    private Output</* @Nullable */ JobEncryptionMode> encryptionMode;

    /**
     * @return Encryption mode
     * 
     */
    public Output</* @Nullable */ JobEncryptionMode> getEncryptionMode() {
        return this.encryptionMode;
    }
    /**
     * Job Sample
     * 
     */
    @Export(name="jobSample", type=JobSample.class, parameters={})
    private Output</* @Nullable */ JobSample> jobSample;

    /**
     * @return Job Sample
     * 
     */
    public Output</* @Nullable */ JobSample> getJobSample() {
        return this.jobSample;
    }
    /**
     * Log subscription
     * 
     */
    @Export(name="logSubscription", type=JobLogSubscription.class, parameters={})
    private Output</* @Nullable */ JobLogSubscription> logSubscription;

    /**
     * @return Log subscription
     * 
     */
    public Output</* @Nullable */ JobLogSubscription> getLogSubscription() {
        return this.logSubscription;
    }
    /**
     * Max capacity
     * 
     */
    @Export(name="maxCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxCapacity;

    /**
     * @return Max capacity
     * 
     */
    public Output</* @Nullable */ Integer> getMaxCapacity() {
        return this.maxCapacity;
    }
    /**
     * Max retries
     * 
     */
    @Export(name="maxRetries", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxRetries;

    /**
     * @return Max retries
     * 
     */
    public Output</* @Nullable */ Integer> getMaxRetries() {
        return this.maxRetries;
    }
    /**
     * Job name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Job name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output location
     * 
     */
    @Export(name="outputLocation", type=JobOutputLocation.class, parameters={})
    private Output</* @Nullable */ JobOutputLocation> outputLocation;

    /**
     * @return Output location
     * 
     */
    public Output</* @Nullable */ JobOutputLocation> getOutputLocation() {
        return this.outputLocation;
    }
    @Export(name="outputs", type=List.class, parameters={JobOutput.class})
    private Output</* @Nullable */ List<JobOutput>> outputs;

    public Output</* @Nullable */ List<JobOutput>> getOutputs() {
        return this.outputs;
    }
    /**
     * Profile Job configuration
     * 
     */
    @Export(name="profileConfiguration", type=JobProfileConfiguration.class, parameters={})
    private Output</* @Nullable */ JobProfileConfiguration> profileConfiguration;

    /**
     * @return Profile Job configuration
     * 
     */
    public Output</* @Nullable */ JobProfileConfiguration> getProfileConfiguration() {
        return this.profileConfiguration;
    }
    /**
     * Project name
     * 
     */
    @Export(name="projectName", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectName;

    /**
     * @return Project name
     * 
     */
    public Output</* @Nullable */ String> getProjectName() {
        return this.projectName;
    }
    @Export(name="recipe", type=JobRecipe.class, parameters={})
    private Output</* @Nullable */ JobRecipe> recipe;

    public Output</* @Nullable */ JobRecipe> getRecipe() {
        return this.recipe;
    }
    /**
     * Role arn
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Role arn
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @Export(name="tags", type=List.class, parameters={JobTag.class})
    private Output</* @Nullable */ List<JobTag>> tags;

    public Output</* @Nullable */ List<JobTag>> getTags() {
        return this.tags;
    }
    /**
     * Timeout
     * 
     */
    @Export(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return Timeout
     * 
     */
    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    /**
     * Job type
     * 
     */
    @Export(name="type", type=JobType.class, parameters={})
    private Output<JobType> type;

    /**
     * @return Job type
     * 
     */
    public Output<JobType> getType() {
        return this.type;
    }
    /**
     * Data quality rules configuration
     * 
     */
    @Export(name="validationConfigurations", type=List.class, parameters={JobValidationConfiguration.class})
    private Output</* @Nullable */ List<JobValidationConfiguration>> validationConfigurations;

    /**
     * @return Data quality rules configuration
     * 
     */
    public Output</* @Nullable */ List<JobValidationConfiguration>> getValidationConfigurations() {
        return this.validationConfigurations;
    }

    public interface BuilderApplicator {
        public void apply(JobArgs.Builder a);
    }
    private static io.pulumi.awsnative.databrew.JobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.databrew.JobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Job(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Job(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Job", name, null, makeResourceOptions(options, id));
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
    public static Job get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}

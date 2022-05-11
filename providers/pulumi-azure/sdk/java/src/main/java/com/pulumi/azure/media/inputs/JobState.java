// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.azure.media.inputs.JobInputAssetArgs;
import com.pulumi.azure.media.inputs.JobOutputAssetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends com.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Optional customer supplied description of the Job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional customer supplied description of the Job.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A `input_asset` block as defined below. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="inputAsset")
    private @Nullable Output<JobInputAssetArgs> inputAsset;

    /**
     * @return A `input_asset` block as defined below. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<JobInputAssetArgs>> inputAsset() {
        return Optional.ofNullable(this.inputAsset);
    }

    /**
     * The Media Services account name. Changing this forces a new Transform to be created.
     * 
     */
    @Import(name="mediaServicesAccountName")
    private @Nullable Output<String> mediaServicesAccountName;

    /**
     * @return The Media Services account name. Changing this forces a new Transform to be created.
     * 
     */
    public Optional<Output<String>> mediaServicesAccountName() {
        return Optional.ofNullable(this.mediaServicesAccountName);
    }

    /**
     * The name which should be used for this Media Job. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Media Job. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `output_asset` blocks as defined below. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="outputAssets")
    private @Nullable Output<List<JobOutputAssetArgs>> outputAssets;

    /**
     * @return One or more `output_asset` blocks as defined below. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<List<JobOutputAssetArgs>>> outputAssets() {
        return Optional.ofNullable(this.outputAssets);
    }

    /**
     * Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The name of the Resource Group where the Media Job should exist. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Media Job should exist. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Transform name. Changing this forces a new Media Job to be created.
     * 
     */
    @Import(name="transformName")
    private @Nullable Output<String> transformName;

    /**
     * @return The Transform name. Changing this forces a new Media Job to be created.
     * 
     */
    public Optional<Output<String>> transformName() {
        return Optional.ofNullable(this.transformName);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.description = $.description;
        this.inputAsset = $.inputAsset;
        this.mediaServicesAccountName = $.mediaServicesAccountName;
        this.name = $.name;
        this.outputAssets = $.outputAssets;
        this.priority = $.priority;
        this.resourceGroupName = $.resourceGroupName;
        this.transformName = $.transformName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobState $;

        public Builder() {
            $ = new JobState();
        }

        public Builder(JobState defaults) {
            $ = new JobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional customer supplied description of the Job.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional customer supplied description of the Job.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param inputAsset A `input_asset` block as defined below. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder inputAsset(@Nullable Output<JobInputAssetArgs> inputAsset) {
            $.inputAsset = inputAsset;
            return this;
        }

        /**
         * @param inputAsset A `input_asset` block as defined below. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder inputAsset(JobInputAssetArgs inputAsset) {
            return inputAsset(Output.of(inputAsset));
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(@Nullable Output<String> mediaServicesAccountName) {
            $.mediaServicesAccountName = mediaServicesAccountName;
            return this;
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(String mediaServicesAccountName) {
            return mediaServicesAccountName(Output.of(mediaServicesAccountName));
        }

        /**
         * @param name The name which should be used for this Media Job. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Media Job. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputAssets One or more `output_asset` blocks as defined below. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder outputAssets(@Nullable Output<List<JobOutputAssetArgs>> outputAssets) {
            $.outputAssets = outputAssets;
            return this;
        }

        /**
         * @param outputAssets One or more `output_asset` blocks as defined below. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder outputAssets(List<JobOutputAssetArgs> outputAssets) {
            return outputAssets(Output.of(outputAssets));
        }

        /**
         * @param outputAssets One or more `output_asset` blocks as defined below. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder outputAssets(JobOutputAssetArgs... outputAssets) {
            return outputAssets(List.of(outputAssets));
        }

        /**
         * @param priority Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Media Job should exist. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Media Job should exist. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param transformName The Transform name. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder transformName(@Nullable Output<String> transformName) {
            $.transformName = transformName;
            return this;
        }

        /**
         * @param transformName The Transform name. Changing this forces a new Media Job to be created.
         * 
         * @return builder
         * 
         */
        public Builder transformName(String transformName) {
            return transformName(Output.of(transformName));
        }

        public JobState build() {
            return $;
        }
    }

}

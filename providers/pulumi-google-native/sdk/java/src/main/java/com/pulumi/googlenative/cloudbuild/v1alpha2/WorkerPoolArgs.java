// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild.v1alpha2.inputs.NetworkConfigArgs;
import com.pulumi.googlenative.cloudbuild.v1alpha2.inputs.WorkerConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NetworkConfigArgs> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`.
     * 
     */
    public Optional<Output<NetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    @Import(name="workerConfig")
    private @Nullable Output<WorkerConfigArgs> workerConfig;

    /**
     * @return Worker configuration for the `WorkerPool`.
     * 
     */
    public Optional<Output<WorkerConfigArgs>> workerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    /**
     * Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    @Import(name="workerPoolId", required=true)
    private Output<String> workerPoolId;

    /**
     * @return Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    public Output<String> workerPoolId() {
        return this.workerPoolId;
    }

    private WorkerPoolArgs() {}

    private WorkerPoolArgs(WorkerPoolArgs $) {
        this.networkConfig = $.networkConfig;
        this.project = $.project;
        this.region = $.region;
        this.workerConfig = $.workerConfig;
        this.workerPoolId = $.workerPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolArgs $;

        public Builder() {
            $ = new WorkerPoolArgs();
        }

        public Builder(WorkerPoolArgs defaults) {
            $ = new WorkerPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<NetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Network configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(NetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param workerConfig Worker configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(@Nullable Output<WorkerConfigArgs> workerConfig) {
            $.workerConfig = workerConfig;
            return this;
        }

        /**
         * @param workerConfig Worker configuration for the `WorkerPool`.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(WorkerConfigArgs workerConfig) {
            return workerConfig(Output.of(workerConfig));
        }

        /**
         * @param workerPoolId Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder workerPoolId(Output<String> workerPoolId) {
            $.workerPoolId = workerPoolId;
            return this;
        }

        /**
         * @param workerPoolId Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder workerPoolId(String workerPoolId) {
            return workerPoolId(Output.of(workerPoolId));
        }

        public WorkerPoolArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.workerPoolId = Objects.requireNonNull($.workerPoolId, "expected parameter 'workerPoolId' to be non-null");
            return $;
        }
    }

}

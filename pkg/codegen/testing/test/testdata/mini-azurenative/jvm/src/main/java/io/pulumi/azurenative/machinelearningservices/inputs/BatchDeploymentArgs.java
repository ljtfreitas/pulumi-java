// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Batch inference settings per deployment.
 * 
 */
public final class BatchDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchDeploymentArgs Empty = new BatchDeploymentArgs();

    /**
     * Description of the endpoint deployment.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @InputImport(name="environmentId")
      private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * Error threshold, if the error count for the entire input goes above this value,
     * the batch inference will be aborted. Range is [-1, int.MaxValue].
     * For FileDataset, this value is the count of file failures.
     * For TabularDataset, this value is the count of record failures.
     * If set to -1 (the lower bound), all failures during batch inference will be ignored.
     * 
     */
    @InputImport(name="errorThreshold")
      private final @Nullable Input<Integer> errorThreshold;

    public Input<Integer> getErrorThreshold() {
        return this.errorThreshold == null ? Input.empty() : this.errorThreshold;
    }

    /**
     * Size of the mini-batch passed to each batch invocation.
     * For FileDataset, this is the number of files per mini-batch.
     * For TabularDataset, this is the size of the records in bytes, per mini-batch.
     * 
     */
    @InputImport(name="miniBatchSize")
      private final @Nullable Input<Double> miniBatchSize;

    public Input<Double> getMiniBatchSize() {
        return this.miniBatchSize == null ? Input.empty() : this.miniBatchSize;
    }

    /**
     * Partition keys list used for Named partitioning.
     * 
     */
    @InputImport(name="partitionKeys")
      private final @Nullable Input<List<String>> partitionKeys;

    public Input<List<String>> getPartitionKeys() {
        return this.partitionKeys == null ? Input.empty() : this.partitionKeys;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public BatchDeploymentArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> environmentId,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<Integer> errorThreshold,
        @Nullable Input<Double> miniBatchSize,
        @Nullable Input<List<String>> partitionKeys,
        @Nullable Input<Map<String,String>> properties) {
        this.description = description;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.errorThreshold = errorThreshold;
        this.miniBatchSize = miniBatchSize;
        this.partitionKeys = partitionKeys;
        this.properties = properties;
    }

    private BatchDeploymentArgs() {
        this.description = Input.empty();
        this.environmentId = Input.empty();
        this.environmentVariables = Input.empty();
        this.errorThreshold = Input.empty();
        this.miniBatchSize = Input.empty();
        this.partitionKeys = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> environmentId;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<Integer> errorThreshold;
        private @Nullable Input<Double> miniBatchSize;
        private @Nullable Input<List<String>> partitionKeys;
        private @Nullable Input<Map<String,String>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.errorThreshold = defaults.errorThreshold;
    	      this.miniBatchSize = defaults.miniBatchSize;
    	      this.partitionKeys = defaults.partitionKeys;
    	      this.properties = defaults.properties;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnvironmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setErrorThreshold(@Nullable Input<Integer> errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }

        public Builder setErrorThreshold(@Nullable Integer errorThreshold) {
            this.errorThreshold = Input.ofNullable(errorThreshold);
            return this;
        }

        public Builder setMiniBatchSize(@Nullable Input<Double> miniBatchSize) {
            this.miniBatchSize = miniBatchSize;
            return this;
        }

        public Builder setMiniBatchSize(@Nullable Double miniBatchSize) {
            this.miniBatchSize = Input.ofNullable(miniBatchSize);
            return this;
        }

        public Builder setPartitionKeys(@Nullable Input<List<String>> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        public Builder setPartitionKeys(@Nullable List<String> partitionKeys) {
            this.partitionKeys = Input.ofNullable(partitionKeys);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public BatchDeploymentArgs build() {
            return new BatchDeploymentArgs(description, environmentId, environmentVariables, errorThreshold, miniBatchSize, partitionKeys, properties);
        }
    }
}

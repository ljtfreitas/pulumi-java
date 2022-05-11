// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleCapacityArgs;
import com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SparkClusterRolesWorkerNodeAutoscaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkClusterRolesWorkerNodeAutoscaleArgs Empty = new SparkClusterRolesWorkerNodeAutoscaleArgs();

    /**
     * A `capacity` block as defined below.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<SparkClusterRolesWorkerNodeAutoscaleCapacityArgs> capacity;

    /**
     * @return A `capacity` block as defined below.
     * 
     */
    public Optional<Output<SparkClusterRolesWorkerNodeAutoscaleCapacityArgs>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * A `recurrence` block as defined below.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs> recurrence;

    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    public Optional<Output<SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    private SparkClusterRolesWorkerNodeAutoscaleArgs() {}

    private SparkClusterRolesWorkerNodeAutoscaleArgs(SparkClusterRolesWorkerNodeAutoscaleArgs $) {
        this.capacity = $.capacity;
        this.recurrence = $.recurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkClusterRolesWorkerNodeAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterRolesWorkerNodeAutoscaleArgs $;

        public Builder() {
            $ = new SparkClusterRolesWorkerNodeAutoscaleArgs();
        }

        public Builder(SparkClusterRolesWorkerNodeAutoscaleArgs defaults) {
            $ = new SparkClusterRolesWorkerNodeAutoscaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity A `capacity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<SparkClusterRolesWorkerNodeAutoscaleCapacityArgs> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity A `capacity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder capacity(SparkClusterRolesWorkerNodeAutoscaleCapacityArgs capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param recurrence A `recurrence` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence A `recurrence` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public SparkClusterRolesWorkerNodeAutoscaleArgs build() {
            return $;
        }
    }

}

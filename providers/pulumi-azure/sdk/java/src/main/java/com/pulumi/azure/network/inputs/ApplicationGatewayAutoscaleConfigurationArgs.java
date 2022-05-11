// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayAutoscaleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayAutoscaleConfigurationArgs Empty = new ApplicationGatewayAutoscaleConfigurationArgs();

    /**
     * Maximum capacity for autoscaling. Accepted values are in the range `2` to `125`.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<Integer> maxCapacity;

    /**
     * @return Maximum capacity for autoscaling. Accepted values are in the range `2` to `125`.
     * 
     */
    public Optional<Output<Integer>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * Minimum capacity for autoscaling. Accepted values are in the range `0` to `100`.
     * 
     */
    @Import(name="minCapacity", required=true)
    private Output<Integer> minCapacity;

    /**
     * @return Minimum capacity for autoscaling. Accepted values are in the range `0` to `100`.
     * 
     */
    public Output<Integer> minCapacity() {
        return this.minCapacity;
    }

    private ApplicationGatewayAutoscaleConfigurationArgs() {}

    private ApplicationGatewayAutoscaleConfigurationArgs(ApplicationGatewayAutoscaleConfigurationArgs $) {
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayAutoscaleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayAutoscaleConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayAutoscaleConfigurationArgs();
        }

        public Builder(ApplicationGatewayAutoscaleConfigurationArgs defaults) {
            $ = new ApplicationGatewayAutoscaleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxCapacity Maximum capacity for autoscaling. Accepted values are in the range `2` to `125`.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity Maximum capacity for autoscaling. Accepted values are in the range `2` to `125`.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(Integer maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity Minimum capacity for autoscaling. Accepted values are in the range `0` to `100`.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Output<Integer> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity Minimum capacity for autoscaling. Accepted values are in the range `0` to `100`.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Integer minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        public ApplicationGatewayAutoscaleConfigurationArgs build() {
            $.minCapacity = Objects.requireNonNull($.minCapacity, "expected parameter 'minCapacity' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableTargetTrackingScalingPolicyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableTargetTrackingScalingPolicyConfigurationArgs Empty = new GlobalTableTargetTrackingScalingPolicyConfigurationArgs();

    @InputImport(name="disableScaleIn")
    private final @Nullable Input<Boolean> disableScaleIn;

    public Input<Boolean> getDisableScaleIn() {
        return this.disableScaleIn == null ? Input.empty() : this.disableScaleIn;
    }

    @InputImport(name="scaleInCooldown")
    private final @Nullable Input<Integer> scaleInCooldown;

    public Input<Integer> getScaleInCooldown() {
        return this.scaleInCooldown == null ? Input.empty() : this.scaleInCooldown;
    }

    @InputImport(name="scaleOutCooldown")
    private final @Nullable Input<Integer> scaleOutCooldown;

    public Input<Integer> getScaleOutCooldown() {
        return this.scaleOutCooldown == null ? Input.empty() : this.scaleOutCooldown;
    }

    @InputImport(name="targetValue", required=true)
    private final Input<Double> targetValue;

    public Input<Double> getTargetValue() {
        return this.targetValue;
    }

    public GlobalTableTargetTrackingScalingPolicyConfigurationArgs(
        @Nullable Input<Boolean> disableScaleIn,
        @Nullable Input<Integer> scaleInCooldown,
        @Nullable Input<Integer> scaleOutCooldown,
        Input<Double> targetValue) {
        this.disableScaleIn = disableScaleIn;
        this.scaleInCooldown = scaleInCooldown;
        this.scaleOutCooldown = scaleOutCooldown;
        this.targetValue = Objects.requireNonNull(targetValue, "expected parameter 'targetValue' to be non-null");
    }

    private GlobalTableTargetTrackingScalingPolicyConfigurationArgs() {
        this.disableScaleIn = Input.empty();
        this.scaleInCooldown = Input.empty();
        this.scaleOutCooldown = Input.empty();
        this.targetValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableTargetTrackingScalingPolicyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableScaleIn;
        private @Nullable Input<Integer> scaleInCooldown;
        private @Nullable Input<Integer> scaleOutCooldown;
        private Input<Double> targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableTargetTrackingScalingPolicyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.scaleInCooldown = defaults.scaleInCooldown;
    	      this.scaleOutCooldown = defaults.scaleOutCooldown;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setDisableScaleIn(@Nullable Input<Boolean> disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        public Builder setDisableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = Input.ofNullable(disableScaleIn);
            return this;
        }

        public Builder setScaleInCooldown(@Nullable Input<Integer> scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }

        public Builder setScaleInCooldown(@Nullable Integer scaleInCooldown) {
            this.scaleInCooldown = Input.ofNullable(scaleInCooldown);
            return this;
        }

        public Builder setScaleOutCooldown(@Nullable Input<Integer> scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }

        public Builder setScaleOutCooldown(@Nullable Integer scaleOutCooldown) {
            this.scaleOutCooldown = Input.ofNullable(scaleOutCooldown);
            return this;
        }

        public Builder setTargetValue(Input<Double> targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }

        public Builder setTargetValue(Double targetValue) {
            this.targetValue = Input.of(Objects.requireNonNull(targetValue));
            return this;
        }

        public GlobalTableTargetTrackingScalingPolicyConfigurationArgs build() {
            return new GlobalTableTargetTrackingScalingPolicyConfigurationArgs(disableScaleIn, scaleInCooldown, scaleOutCooldown, targetValue);
        }
    }
}
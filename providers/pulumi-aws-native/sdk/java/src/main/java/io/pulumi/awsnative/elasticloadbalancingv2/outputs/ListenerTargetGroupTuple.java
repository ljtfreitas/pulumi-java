// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerTargetGroupTuple {
    private final @Nullable String targetGroupArn;
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ListenerTargetGroupTuple(
        @CustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.targetGroupArn = targetGroupArn;
        this.weight = weight;
    }

    public Optional<String> getTargetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerTargetGroupTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetGroupArn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerTargetGroupTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.weight = defaults.weight;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public ListenerTargetGroupTuple build() {
            return new ListenerTargetGroupTuple(targetGroupArn, weight);
        }
    }
}

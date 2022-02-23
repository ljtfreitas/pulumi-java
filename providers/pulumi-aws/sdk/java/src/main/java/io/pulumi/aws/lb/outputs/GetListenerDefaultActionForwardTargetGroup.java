// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetListenerDefaultActionForwardTargetGroup {
    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    private final String arn;
    private final Integer weight;

    @OutputCustomType.Constructor({"arn","weight"})
    private GetListenerDefaultActionForwardTargetGroup(
        String arn,
        Integer weight) {
        this.arn = Objects.requireNonNull(arn);
        this.weight = Objects.requireNonNull(weight);
    }

    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GetListenerDefaultActionForwardTargetGroup build() {
            return new GetListenerDefaultActionForwardTargetGroup(arn, weight);
        }
    }
}

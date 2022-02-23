// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetTargetGroupArgs Empty = new SpotFleetTargetGroupArgs();

    @InputImport(name="arn", required=true)
        private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    public SpotFleetTargetGroupArgs(Input<String> arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private SpotFleetTargetGroupArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }
        public SpotFleetTargetGroupArgs build() {
            return new SpotFleetTargetGroupArgs(arn);
        }
    }
}

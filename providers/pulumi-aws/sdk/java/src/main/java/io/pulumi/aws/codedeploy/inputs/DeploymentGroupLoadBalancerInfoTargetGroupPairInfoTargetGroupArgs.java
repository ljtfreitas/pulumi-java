// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs();

    /**
     * Name of the target group.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs(name);
        }
    }
}

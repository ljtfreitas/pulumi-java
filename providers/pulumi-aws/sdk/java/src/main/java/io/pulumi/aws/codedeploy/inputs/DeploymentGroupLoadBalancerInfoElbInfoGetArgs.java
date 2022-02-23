// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoElbInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoElbInfoGetArgs Empty = new DeploymentGroupLoadBalancerInfoElbInfoGetArgs();

    /**
     * The name of the load balancer that will be used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DeploymentGroupLoadBalancerInfoElbInfoGetArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private DeploymentGroupLoadBalancerInfoElbInfoGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoElbInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoElbInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public DeploymentGroupLoadBalancerInfoElbInfoGetArgs build() {
            return new DeploymentGroupLoadBalancerInfoElbInfoGetArgs(name);
        }
    }
}

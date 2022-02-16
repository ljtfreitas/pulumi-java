// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterAddonsConfigCloudrunConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigCloudrunConfigGetArgs Empty = new ClusterAddonsConfigCloudrunConfigGetArgs();

    @InputImport(name="disabled", required=true)
    private final Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled;
    }

    @InputImport(name="loadBalancerType")
    private final @Nullable Input<String> loadBalancerType;

    public Input<String> getLoadBalancerType() {
        return this.loadBalancerType == null ? Input.empty() : this.loadBalancerType;
    }

    public ClusterAddonsConfigCloudrunConfigGetArgs(
        Input<Boolean> disabled,
        @Nullable Input<String> loadBalancerType) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.loadBalancerType = loadBalancerType;
    }

    private ClusterAddonsConfigCloudrunConfigGetArgs() {
        this.disabled = Input.empty();
        this.loadBalancerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigCloudrunConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> disabled;
        private @Nullable Input<String> loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigCloudrunConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder setDisabled(Input<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Input.of(Objects.requireNonNull(disabled));
            return this;
        }

        public Builder setLoadBalancerType(@Nullable Input<String> loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        public Builder setLoadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = Input.ofNullable(loadBalancerType);
            return this;
        }

        public ClusterAddonsConfigCloudrunConfigGetArgs build() {
            return new ClusterAddonsConfigCloudrunConfigGetArgs(disabled, loadBalancerType);
        }
    }
}
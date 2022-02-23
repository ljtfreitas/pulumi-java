// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyState Empty = new ResourcePolicyState();

    @InputImport(name="enableHybrid")
    private final @Nullable Input<String> enableHybrid;

    public Input<String> getEnableHybrid() {
        return this.enableHybrid == null ? Input.empty() : this.enableHybrid;
    }

    /**
     * The policy to be applied to the aws glue data catalog.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public ResourcePolicyState(
        @Nullable Input<String> enableHybrid,
        @Nullable Input<String> policy) {
        this.enableHybrid = enableHybrid;
        this.policy = policy;
    }

    private ResourcePolicyState() {
        this.enableHybrid = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> enableHybrid;
        private @Nullable Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHybrid = defaults.enableHybrid;
    	      this.policy = defaults.policy;
        }

        public Builder setEnableHybrid(@Nullable Input<String> enableHybrid) {
            this.enableHybrid = enableHybrid;
            return this;
        }

        public Builder setEnableHybrid(@Nullable String enableHybrid) {
            this.enableHybrid = Input.ofNullable(enableHybrid);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }
        public ResourcePolicyState build() {
            return new ResourcePolicyState(enableHybrid, policy);
        }
    }
}
